package backend.java.buffered;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MenuReader {
    public static void main(String[] args) {
        String fileName = "menu_NamaMahasiswa.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Membaca dan menampilkan menu dari file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Kesalahan dalam membaca file: " + e.getMessage());
            return;
        }

        // Daftar harga menu
        int[] hargaMenu = {14000, 16000, 12500, 23000};
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Order? (y/t): ");
            String order = scanner.nextLine();
            if (order.equalsIgnoreCase("y")) {
                System.out.print("No Pesanan: ");
                int noPesanan = scanner.nextInt();
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                // Validasi nomor pesanan
                if (noPesanan >= 1 && noPesanan <= hargaMenu.length) {
                    totalHarga += hargaMenu[noPesanan - 1] * jumlah;
                } else {
                    System.out.println("Menu tidak valid!");
                }

                System.out.print("Pesan lagi? (y/t): ");
                String pesanLagi = scanner.nextLine();
                if (!pesanLagi.equalsIgnoreCase("y")) {
                    lanjut = false;
                }
            } else {
                lanjut = false;
            }
        }

        System.out.println("Total: Rp " + totalHarga);
    }
}
