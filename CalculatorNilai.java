import java.util.Scanner;

public class CalculatorNilai {
    
    static float hitungRataRata(float nilai1, float nilai2, float nilai3) {
        return (nilai1 + nilai2 + nilai3) / 3;
    }

    static String tentukanPredikat(float rataRata) {
        if (rataRata >= 85) return "SANGAT MEMUASKAN";
        else if (rataRata >= 75) return "MEMUASKAN";
        else if (rataRata >= 65) return "CUKUP";
        else if (rataRata >= 55) return "KURANG";
        else return "SANGAT KURANG";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n*** KALKULATOR PENILAIAN SISWA ***\n");
        
        System.out.print("Masukkan Nama Siswa : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String kelas = scanner.nextLine();
        
        System.out.print("Nilai Bahasa Indonesia : ");
        float indo = scanner.nextFloat();
        
        System.out.print("Nilai Matematika : ");
        float math = scanner.nextFloat();
        
        System.out.print("Nilai IPA : ");
        float ipa = scanner.nextFloat();
        
        float rataRata = hitungRataRata(indo, math, ipa);
        String predikat = tentukanPredikat(rataRata);
        
        System.out.println("\n========== HASIL AKHIR ==========");
        System.out.println("Nama Siswa       : " + nama);
        System.out.println("Kelas            : " + kelas);
        System.out.println("Nilai B.Indo     : " + indo);
        System.out.println("Nilai Matematika : " + math);
        System.out.println("Nilai IPA        : " + ipa);
        System.out.println("Rata-rata        : " + String.format("%.2f", rataRata));
        System.out.println("Predikat         : " + predikat);
        System.out.println("=================================\n");
        
        scanner.close();
    }
}
