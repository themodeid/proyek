import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Memasukkan jumlah data
        System.out.print("Masukan jumlah data: ");
        int jumlahData = userInput.nextInt();
        userInput.nextLine(); // Membersihkan buffer

        // Deklarasi array 2D untuk menyimpan data
        String[][] data = new String[jumlahData][3];

        // Input data oleh pengguna
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            data[i][0] = userInput.nextLine();
            
            System.out.print("Nilai Teori: ");
            data[i][1] = userInput.nextLine();

            System.out.print("Nilai Praktikum: ");
            data[i][2] = userInput.nextLine();
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Jumlah Data : " + data.length);
        System.out.println("----------------------------------------");

        // Menampilkan detail mata kuliah
        for (int i = 0; i < data.length; i++) {
            System.out.println("Mata Kuliah : " + data[i][0]);
            System.out.println("Nilai Teori : " + data[i][1]);
            System.out.println("Nilai Praktikum : " + data[i][2]);
            System.out.println();
        }

        System.out.println("----------------------------------------");
        System.out.println("Mata Kuliah   Teori   Praktikum   Rata-rata");
        System.out.println("----------------------------------------------------");

        // Menampilkan tabel dan menghitung rata-rata
        for (int i = 0; i < data.length; i++) {
            String mataKuliah = data[i][0];
            int nilaiTeori = Integer.parseInt(data[i][1]);
            int nilaiPraktikum = Integer.parseInt(data[i][2]);
            double rataRata = (nilaiTeori + nilaiPraktikum) / 2.0;

            System.out.printf("%-12s %-7d %-10d %.1f\n", mataKuliah, nilaiTeori, nilaiPraktikum, rataRata);
        }

        userInput.close();
    }
}
