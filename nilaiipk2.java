import java.util.Scanner;
public class nilaiipk2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nim, nama;
        String namaMk1, namaMk2, namaMk3;
        int nilai1, nilai2, nilai3;
        int sks1, sks2, sks3;
        int bobot1, bobot2, bobot3;
        double totalBobot;
        int totalSks;
        double IP;
        int sksMaks;

        // Input data mahasiswa
        System.out.print("Masukkan Nama lengkap : ");
        nama = scanner.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = scanner.nextLine();

        //  Matakuliah 1
        System.out.print("\nNama Matakuliah 1 : ");
        namaMk1 = scanner.nextLine();
        System.out.print("Nilai Matakuliah 1 : ");
        nilai1 = scanner.nextInt();
        System.out.print("SKS Matakuliah 1 : ");
        sks1 = scanner.nextInt();
        scanner.nextLine();

        
        if (nilai1 >= 80) {
            bobot1 = 4;
        } else if (nilai1 >= 75) {
            bobot1 = 3;
        } else if (nilai1 >= 65) {
            bobot1 = 2;
        } else if (nilai1 >= 60) {
            bobot1 = 1;
        } else {
            bobot1 = 0;
        }

        // Matakuliah 2
        System.out.print("\nNama Matakuliah 2 : ");
        namaMk2 = scanner.nextLine();
        System.out.print("Nilai Matakuliah 2 : ");
        nilai2 = scanner.nextInt();
        System.out.print("SKS Matakuliah 2 : ");
        sks2 = scanner.nextInt();
        scanner.nextLine();

        
        if (nilai2 >= 80) {
            bobot2 = 4;
        } else if (nilai2 >= 75) {
            bobot2 = 3;
        } else if (nilai2 >= 65) {
            bobot2 = 2;
        } else if (nilai2 >= 60) {
            bobot2 = 1;
        } else {
            bobot2 = 0;
        }

        // Matakuliah 3
        System.out.print("\nNama Matakuliah 3 : ");
        namaMk3 = scanner.nextLine();
        System.out.print("Nilai Matakuliah 3 : ");
        nilai3 = scanner.nextInt();
        System.out.print("SKS Matakuliah 3 : ");
        sks3 = scanner.nextInt();

        if (nilai3 >= 80) {
            bobot3 = 4;
        } else if (nilai3 >= 75) {
            bobot3 = 3;
        } else if (nilai3 >= 65) {
            bobot3 = 2;
        } else if (nilai3 >= 60) {
            bobot3 = 1;
        } else {
            bobot3 = 0;
        }

        // HITUNG=
        totalBobot = (bobot1 * sks1) + (bobot2 * sks2) + (bobot3 * sks3);
        totalSks = sks1 + sks2 + sks3;
        IP = totalBobot / totalSks;

        //SKS MAKS
        if (IP >= 3.50) {
            sksMaks = 24;
        } else if (IP >= 3.00) {
            sksMaks = 22;
        } else if (IP >= 2.00) {
            sksMaks = 20;
        } else {
            sksMaks = 18;
        }

        //OUTPUT Hasil akhir
        System.out.println("\n===== HASIL =====");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Total SKS   : " + totalSks);
        System.out.println("IP Semester : " + IP);
        System.out.println("SKS Maks    : " + sksMaks);

        scanner.close();
    


    }
}

