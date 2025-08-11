package backend.array;

import java.util.Scanner;

public class matriks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pilihan: 1 untuk array 1 dimensi, 2 untuk array 2 dimensi = ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                dimensi1(input);
                break;
            case 2:
                dimensi2(input);
                break;
            default:
                System.out.println("Dimensi tidak terdaftar");
                break;
        }
    }

    // Method untuk array 1 dimensi
    private static void dimensi1(Scanner userInput) {
        System.out.println("Array 1 dimensi\n");

        System.out.print("Masukkan jumlah elemen array = ");
        int n = userInput.nextInt();  // Membaca jumlah elemen array
        int[] array = new int[n];     // Membuat array 1 dimensi dengan ukuran n

        // Input nilai array1
        System.out.println("nilai array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " = ");
            array[i] = userInput.nextInt();
        }

        // Proses penjumlahan
        int jumlah = 0;
        System.out.println("Nilai-nilai array yang dimasukkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            jumlah += array[i];
        }
        System.out.println("\nJumlah total = " + jumlah);
    }

    // Method untuk array 2 dimensi
    private static void dimensi2(Scanner userInput) {
        System.out.println("Array 2 dimensi");

        // Input jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris = ");
        int baris = userInput.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        int kolom = userInput.nextInt();

        int[][] array = new int[baris][kolom];  // Membuat array 2 dimensi

        
        // Input nilai array 2 dimensi
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai untuk baris " + (i + 1) + " kolom " + (j + 1) + " = ");
                array[i][j] = userInput.nextInt();
            }
        }

        // Menampilkan array dan menghitung jumlah
        int jumlah = 0;
        System.out.println("Nilai-nilai array 2 dimensi:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j] + " ");
                jumlah += array[i][j];  // Menjumlahkan semua elemen
            }
            System.out.println();  // Pindah ke baris baru untuk tampilan
        }

        System.out.println("Jumlah total array 2 dimensi = " + jumlah);
    }
}
