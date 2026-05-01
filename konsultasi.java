import java.util.Scanner;

public class konsultasi {
     public static void main(String[] args) {

        /*
        konsultasi Akademik
        Dosen membuka sesi konsultasi untuk maksimal 7 mahasiswa. setiap mahasiswa yang datang
        akan dilayani dan dihitung.Jika tidak ada mahasiswa lagi yang datang ,sesi dihentikan 
        walaupun kuata belum penuh.
        */
        // Deklarasi variabel
        String jwb="";
        String nama="";
        String nim="";
        int jumlah=0;
        Scanner Scanner = new Scanner(System.in);


        while (!jwb.equalsIgnoreCase("Y")) {
            jumlah++;
            System.out.println("Mahasiswa ke-" + jumlah + " Dilayani ");
            System.out.println("Masukkan Nama Mahasiswa :");
            nama = Scanner.nextLine();
            System.out.println("Masukkan NIM Mahasiswa :");
            nim= Scanner.nextLine();

            if(jumlah == 7) {
                System.out.println("Mahasiswa sudah penuh");
                break;
            }
            System.out.println("Masih ada mahasiswa ? (Y/N)");
            jwb = Scanner.nextLine();

            if(!jwb.equalsIgnoreCase("N")) {

            }
            
        }
            System.out.println("Sesi selesai");
            System.out.println("Total mahasiswa: " + jumlah);

            Scanner.close();
        
    
    }
}
