package backend.array;
import java.util.Scanner;

class send_array{
    public static void main(String[] args) {
        int data[]={3,9,76,54, 43, 12, 46, 39, 76, 12, 88, 45,89};
        int i,x;
        
        Scanner s=new Scanner (System.in);
        for (i=0;i<data.length;i++)
            System.out.println("data ke-"+(i)+"\t"+data[i]);
            
        System.out.print ("Masukkan angka yang ingin dicari : "); 
        x=s.nextInt();
        int j=0;
        for (i=0;i<data.length;i++){
            if (x==data[i]) {
                System.out.println("Ada pada elemen ke-"+(i));
                j++;
            }
        }
        if (j==0) System.out.println("Data tidak ditemukan");
    }
}