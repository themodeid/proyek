package backend.java.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class menerimafile {

    public static void main(String[] args) {
        HashMap<String, Integer> biayaKamar = new HashMap<>();
        biayaKamar.put("1", 100000);
        biayaKamar.put("2", 250000);
        biayaKamar.put("3", 500000);

        try (BufferedReader reader = new BufferedReader(new FileReader("data_pasien.txt"))) {
            String line;
            System.out.printf("%-10s %-15s %-10s %-10s %-15s\n", "ID Pas", "Nama Pasien", "Kode Kamar", "Lama Inap", "Total Biaya");

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");

                // Pastikan data memiliki cukup elemen untuk menghindari error
                if (data.length < 4) {
                    System.out.println("Format data tidak valid: " + line);
                    continue;
                }

                String idPasien = data[0];
                String kodeKamar = data[1];
                int lamaInap;
                String namaPasien = data[3];

                try {
                    lamaInap = Integer.parseInt(data[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Format lama inap tidak valid untuk data: " + line);
                    continue;
                }

                int biayaPerHari = biayaKamar.getOrDefault(kodeKamar, -1);
                if (biayaPerHari == -1) {
                    System.out.println("Kode kamar tidak ditemukan: " + kodeKamar);
                    continue;
                }

                int totalBiaya = biayaPerHari * lamaInap;

                System.out.printf("%-10s %-15s %-10s %-10d Rp %,d\n", idPasien, namaPasien, kodeKamar, lamaInap, totalBiaya);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
