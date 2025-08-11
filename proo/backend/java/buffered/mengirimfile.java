package backend.java.buffered;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mengirimfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahData = 1; // NPM Genap = 4, Ganjil = 3

        String[][] dataPasien = new String[jumlahData][4];

        // Input Data Pasien
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan ID Pasien:");
            dataPasien[i][0] = scanner.nextLine();
            System.out.println("Masukkan Nama Pasien:");
            dataPasien[i][1] = scanner.nextLine();
            System.out.println("Masukkan Kode Kamar:");
            dataPasien[i][2] = scanner.nextLine();
            System.out.println("Masukkan Lama Inap:");
            dataPasien[i][3] = scanner.nextLine();
            System.out.println("====================");
        }

        // Menulis ke file
        try (FileWriter writer = new FileWriter("data_pasien.txt")) {
            for (String[] pasien : dataPasien) {
                writer.write(pasien[0] + "_" + pasien[2] + "_" + pasien[3] + "_" + pasien[1] + "\n");
            }
            System.out.println("Selesai menulis ke File");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
        }

        scanner.close();
    }
}
