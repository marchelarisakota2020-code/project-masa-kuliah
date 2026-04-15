import java.util.Scanner;
public class latihanfordo {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
       
        /*
        membuat program untuk menghitung total SSKM berdasarkan kegiatan
        dan poin SSKM dari kegiatan yang diinputkan.
        Kegiatan bisa diinput hingga 5 data.
        output :
        bimbingan kasir - 5 poin
        seminar AI - 3 poin
        total : 8 poin
        */
       //input - inisiallisasi variabel dan nilai default
       String kegiatan ="";
       int poinSSKM=0,total=0;

       // perulangan input data sebanyak 5 kali
       // shortcut for >> fori + enter/tab
       for (int i = 1; i <6; i++) {
        // logika isi perulangan 
        System.out.println("Data ke:"+ (i+1));
        System.out.println("Masukkan kegiatan :");
        kegiatan = Scanner.nextLine();
        System.out.println("Poin SSKM :");
        poinSSKM = Scanner.nextInt();
        Scanner.nextLine();


        // hitung total =3+5+7+7

        total += poinSSKM;// total = total = poinSSKM
                          // 0=0+3
                          // 3=3+5   
     }
     System.out.println("Total : "+ total );


       Scanner.close();

       


    }
}
