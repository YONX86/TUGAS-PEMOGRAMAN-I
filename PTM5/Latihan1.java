package PTM5;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        float Kehadiran, NilaiAkhir, validasi ;
        
        System.out.println("Masukkan Kehadiran     : ");
        Kehadiran = input.nextFloat();
        System.out.println("Masukkan NilaiAkhir     : ");
        NilaiAkhir = input.nextFloat();
        
        validasi = 21 * 75 / 100;
        
        if (Kehadiran > validasi){
            if (NilaiAkhir >= 80){
                System.out.println("Grade Nilai= A");
            } else if (NilaiAkhir >= 70){
                System.out.println("Grade Nilai= B");
            } else if (NilaiAkhir >= 60){
                System.out.println("Grade Nilai= C");
            } else if (NilaiAkhir >= 55){
                System.out.println("Grade Nilai= D");
            } else if (NilaiAkhir < 55){
                System.out.println("Grade Nilai= E");
            }
        } else {
            if (NilaiAkhir == 55){
                System.out.println("Tidak Lulus");
            }
        }
            
    }
}