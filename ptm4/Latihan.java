package Latihan;

public class Latihan3 {
    public static void main(String[] args) {
        
        double gajiPokok = 5000000;
        double tunjangan = 1500000;
        double bonus = 800000;
        
        double totalPenghasilan = gajiPokok + tunjangan + bonus;
        
        double pajakPersen = 15;
        double potonganPajak = (pajakPersen / 100) * totalPenghasilan;
        
        double gajiDiterima = totalPenghasilan - potonganPajak;
        
        System.out.println("Detail Perhitungan Gaji");
        System.out.println("======================");
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Bonus: " + bonus);
        System.out.println("");
        System.out.println("Total Penghasilan: " + totalPenghasilan);
        System.out.println("Pajak (" + pajakPersen + "%): " + potonganPajak);
        System.out.println("Gaji Diterima: " + gajiDiterima);
    }
}
