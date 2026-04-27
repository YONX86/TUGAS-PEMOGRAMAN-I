package latihan;

import java.util.Scanner;

public class NilaiMahasiswa {
    
    static double hitungNilaiAkhir(double nilaiTugas, double nilaiKuis, double nilaiUTS, double nilaiUAS) {
        return (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
    }

    static char tentukanHurufGrade(double nilai) {
        if (nilai >= 90) return 'A';
        else if (nilai >= 80) return 'B';
        else if (nilai >= 70) return 'C';
        else if (nilai >= 60) return 'D';
        else return 'E';
    }

    static String statusKelulusan(double nilai) {
        return nilai >= 60 ? "LULUS" : "TIDAK LULUS";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== SISTEM PERHITUNGAN NILAI MAHASISWA ===\n");
        
        System.out.print("NPM Mahasiswa : ");
        String npm = sc.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();
        
        System.out.print("Nilai Tugas (20%) : ");
        double tugas = sc.nextDouble();
        
        System.out.print("Nilai Kuis (20%) : ");
        double kuis = sc.nextDouble();
        
        System.out.print("Nilai UTS (30%) : ");
        double uts = sc.nextDouble();
        
        System.out.print("Nilai UAS (30%) : ");
        double uas = sc.nextDouble();
        
        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        char grade = tentukanHurufGrade(nilaiAkhir);
        String status = statusKelulusan(nilaiAkhir);
        
        System.out.println("\n========== HASIL AKHIR ==========");
        System.out.println("NPM          : " + npm);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade        : " + grade);
        System.out.println("Status       : " + status);
        System.out.println("=================================\n");
        
        sc.close();
    }
}
