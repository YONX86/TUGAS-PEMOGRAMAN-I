package Latihan;

import java.util.Scanner;

public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program Konversi Tipe Data");
        System.out.println("==========================\n");
        
        
        int a = 17, b = 5;
        double hasil = (double) a / b;
        System.out.println("Hasil " + a + " / " + b + " = " + hasil);
        
        
        double x = 45.89;
        int y = (int) x;
        System.out.println("Ubah " + x + " ke int = " + y);
        
        
        String num = "99";
        int convert = Integer.parseInt(num);
        System.out.println("String " + num + " menjadi int = " + convert);
        
        
        int umur = 19;
        String usia = String.valueOf(umur);
        System.out.println("Int " + umur + " jadi string = " + usia);
        
        
        System.out.print("\nMasukkan angka pertama: ");
        int n1 = sc.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int n2 = sc.nextInt();
        
        double pembagian = (double) n1 / n2;
        System.out.println("Hasil pembagian: " + pembagian);
        
        System.out.println("\nSelesai");
        sc.close();
    }
}
