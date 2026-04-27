package Latihan;

import java.util.Scanner;

public class PenilaianSiswa {
    
    static float hitungKehadiranMinimal(int totalPertemuan) {
        return totalPertemuan * 0.75f;
    }

    static String tentukanGrade(float nilai) {
        if (nilai >= 85) return "A+";
        else if (nilai >= 75) return "A";
        else if (nilai >= 65) return "B";
        else if (nilai >= 55) return "C";
        else return "D";
    }

    static String statusKelulusan(float hadir, float batasMinimal, float nilai) {
        if (hadir < batasMinimal) {
            return "GAGAL - Kehadiran Kurang";
        } else if (nilai < 55) {
            return "GAGAL - Nilai Kurang";
        } else {
            return "LULUS";
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== PROGRAM PENILAIAN SISWA ====\n");
        
        System.out.print("Masukkan Nama Siswa : ");
        String nama = input.nextLine();
        
        System.out.print("Total Pertemuan : ");
        int totalPertemuan = input.nextInt();
        
        System.out.print("Jumlah Kehadiran : ");
        int jumlahHadir = input.nextInt();
        
        System.out.print("Nilai Akhir : ");
        float nilaiAkhir = input.nextFloat();
        
        float batasMinimal = hitungKehadiranMinimal(totalPertemuan);
        String grade = tentukanGrade(nilaiAkhir);
        String status = statusKelulusan(jumlahHadir, batasMinimal, nilaiAkhir);
        
        System.out.println("\n===== HASIL PENILAIAN =====");
        System.out.println("Nama Siswa    : " + nama);
        System.out.println("Kehadiran     : " + jumlahHadir + "/" + totalPertemuan);
        System.out.println("Batas Minimal : " + (int)batasMinimal);
        System.out.println("Nilai Akhir   : " + nilaiAkhir);
        System.out.println("Grade         : " + grade);
        System.out.println("Status        : " + status);
        System.out.println("===========================");
        
        input.close();
    }
}
