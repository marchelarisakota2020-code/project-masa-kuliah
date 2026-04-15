import java.util.Scanner;
public class nilaiipk2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nMata Kuliah ke-" + i);

            System.out.print("Masukkan SKS: ");
            int sks = input.nextInt();

            System.out.print("Masukkan nilai (A=4, B=3, C=2, D=1, E=0): ");
            double nilai = input.nextDouble();

            totalNilai += nilai * sks;
            totalSKS += sks;
        }

        double ip = totalNilai / totalSKS;

        // Menentukan SKS maksimal
        int sksMaks;

        if (ip >= 3.50) {
            sksMaks = 24;
        } else if (ip >= 3.00) {
            sksMaks = 22;
        } else if (ip >= 2.00) {
            sksMaks = 20;
        } else {
            sksMaks = 18;
        }

        // Output
        System.out.println("\n===== HASIL =====");
        System.out.println("Total SKS       : " + totalSKS);
        System.out.println("IP Semester     : " + String.format("%.2f", ip));
        System.out.println("SKS Maksimal    : " + sksMaks);

        input.close();
    }
}

