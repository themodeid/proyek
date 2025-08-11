package backend.java.bangun2d1;

import java.util.Scanner;
 
public class bangun2d1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Bangun ruang");

        System.out.println("bangun 2 dimensi");
        System.out.println("");                
        System.out.println("[1: persegi       2: persegi panjang 3: lingkaran     ]");
        System.out.println("[4: segitiga      5: siku siku       6: belah ketupat ]");
        System.out.println("[7: layang layang                                     ]");

        boolean exit = false;

        while (!exit) {
            System.out.print("masukkan jenis bangun = ");
            int input = userInput.nextInt();
        
            switch (input) {
                case 1:
                    Persegi(userInput);
                    break;
                case 2:
                    PersegiPanjang(userInput);
                    break;
                case 3:
                    Lingkaran(userInput);
                    break;
                case 4:
                    Segitiga(userInput);
                    break;
                case 5:
                    Siku(userInput);
                    break;
                case 6:
                    Ketupat(userInput);
                    break;
                case 7:
                    LayangLayang(userInput);
                    break;
                default:
                    System.out.println("Bangun ruang tidak ditemukan");
                    break;
            }

            System.out.println("Apakah Anda ingin keluar (y/t): ");
            String jkeluar = userInput.next();
            if (jkeluar.equalsIgnoreCase("y")) {
                exit = true;
            }
        }
        System.out.println("Sampai jumpa");
        userInput.close();
    }

    // 1 persegi
    private static void Persegi(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Persegi");
        System.out.print("Sisi = ");
        int sisi = userInput.nextInt();
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);
    }

    // 2 persegi panjang
    private static void PersegiPanjang(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Persegi Panjang");
        System.out.print("Panjang = ");
        int panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int lebar = userInput.nextInt();
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);
    }

    // 3 lingkaran
    private static void Lingkaran(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Lingkaran");
        System.out.print("Jari-jari = ");
        int r = userInput.nextInt();
        double pi = Math.PI; 
        double luas = pi * r * r; 
        double keliling = 2 * pi * r;
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);
    }

    // 4 segitiga
    private static void Segitiga(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Segitiga");
        System.out.print("Alas = ");
        int alas = userInput.nextInt();
        System.out.print("Tinggi = ");
        int tinggi = userInput.nextInt();
        double luas = (alas * tinggi) / 2.0; 
        int keliling = alas * 3;
        System.out.println("Luas         = " + luas);
        System.out.println("Keliling     = " + keliling);
    }

    // 5 segitiga siku-siku
    private static void Siku(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Segitiga Siku-siku");
        System.out.println("1 = a, 2 = b, 3 = c");
        System.out.print("Masukkan sisi yang ingin dicari = ");
        int choice = userInput.nextInt();

        if (choice == 1) {
            System.out.print("c = ");
            int c = userInput.nextInt();
            System.out.print("b = ");
            int b = userInput.nextInt();
            double a = Math.sqrt(c * c - b * b);
            double keliling = c + b + a;
            System.out.println("Nilai a  = " + a);
            System.out.println("Keliling = " + keliling);
        } else if (choice == 2) {
            System.out.print("a = ");
            int a = userInput.nextInt();
            System.out.print("c = ");
            int c = userInput.nextInt();
            double b = Math.sqrt(c * c - a * a);
            double keliling = c + a + b;
            System.out.println("Nilai b  = " + b);
            System.out.println("Keliling = " + keliling);
        } else if (choice == 3) {
            System.out.print("a = ");
            int a = userInput.nextInt();
            System.out.print("b = ");
            int b = userInput.nextInt();
            double c = Math.sqrt(a * a + b * b);
            double keliling = c + a + b;
            System.out.println("Nilai c  = " + c);
            System.out.println("Keliling = " + keliling);
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }

    // 6 belah ketupat
    private static void Ketupat(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Belah Ketupat");
        System.out.print("d1   = ");
        int d1 = userInput.nextInt();
        System.out.print("d2   = ");
        int d2 = userInput.nextInt();
        System.out.print("Sisi = ");
        int s = userInput.nextInt();
        double luas = (d1 * d2) / 2.0;
        int keliling = 4 * s;
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);
    }

    // 7 layang-layang
    private static void LayangLayang(Scanner userInput) {
        System.out.println("=========================================================");
        System.out.println("Layang-layang");
        System.out.print("d1 = ");
        int d1 = userInput.nextInt();
        System.out.print("d2 = ");
        int d2 = userInput.nextInt();
        System.out.print("ab = ");
        int ab = userInput.nextInt();
        System.out.print("ad = ");
        int ad = userInput.nextInt();
        double luas = (d1 * d2) / 2.0;
        int keliling = 2 * (ab + ad);
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);
    }
}
