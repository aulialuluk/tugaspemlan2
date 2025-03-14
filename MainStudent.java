import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSiswa = 2;
        Student[] s1 = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("=======================");
            System.out.println("Data dari siswa ke-" + (i + 1));
            System.out.println("=======================");

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            System.out.print("Nilai Matematika: ");
            double matematika = input.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double inggris = input.nextDouble();

            System.out.print("Nilai Sains: ");
            double sains = input.nextDouble();
            System.out.print("\n");

            input.nextLine(); // Membuang newline setelah nextDouble()

            s1[i] = new Student(nama, alamat, umur, matematika, inggris, sains);
        }

        System.out.println("=======================");
        System.out.println("Menampilkan Data siswa:");
        System.out.println("=======================");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Diketahui Siswa ke-" + (i + 1) + ":");
            s1[i].displayMessage();
        }
        input.close();
    }
}
