package backend.java.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MenuWriter {
    public static void main(String[] args) {
        String fileName = "menu_NamaMahasiswa.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Menu Restoran Informatika :\n");
            writer.write("-----------------------------------\n");
            writer.write("1. Nasi Goreng Java       Rp 14000\n");
            writer.write("2. Ayam Bakar Pascal      Rp 16000\n");
            writer.write("3. Mocca Flash            Rp 12500\n");
            writer.write("4. Bebek Visual           Rp 23000\n");
        } catch (IOException e) {
            System.out.println("Kesalahan dalam menulis file: " + e.getMessage());
        }
        System.out.println("Menu berhasil ditulis ke file " + fileName);
    }
}
