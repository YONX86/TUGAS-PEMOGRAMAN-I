package Latihan;

import java.util.Scanner;

public class Latihan2 {
    
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
    
    static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n=== Program Menghitung Persegi Panjang ===\n");
        
        System.out.print("Masukkan Panjang (cm) : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan Lebar (cm)   : ");
        int lebar = input.nextInt();
        
        if (panjang <= 0 || lebar <= 0) {
            System.out.println("\n*** Error: Panjang dan Lebar harus lebih dari 0 ***\n");
        } else {
            int luas = hitungLuas(panjang, lebar);
            int keliling = hitungKeliling(panjang, lebar);
            
            System.out.println("\n========== HASIL PERHITUNGAN ==========");
            System.out.println("Panjang        : " + panjang + " cm");
            System.out.println("Lebar          : " + lebar + " cm");
            System.out.println("Luas           : " + luas + " cm²");
            System.out.println("Keliling       : " + keliling + " cm");
            System.out.println("========================================\n");
        }
        
        input.close();
    }
}