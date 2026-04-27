import java.util.Scanner;

public class HitungDiskon {
    
    static int hitungDiskon(int harga, int persenDiskon) {
        return (harga * persenDiskon) / 100;
    }

    static String tentukanKategoriHarga(int harga) {
        if (harga >= 500000) return "PREMIUM";
        else if (harga >= 300000) return "STANDAR";
        else if (harga >= 100000) return "EKONOMI";
        else return "MURAH";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n=== PROGRAM HITUNG DISKON BARANG ===\n");
        
        System.out.print("Nama Barang : ");
        String barang = input.nextLine();
        
        System.out.print("Harga Barang (Rp) : ");
        int harga = input.nextInt();
        
        System.out.print("Persentase Diskon (%) : ");
        int diskon = input.nextInt();
        
        int nominalDiskon = hitungDiskon(harga, diskon);
        int hargaSetelahDiskon = harga - nominalDiskon;
        String kategori = tentukanKategoriHarga(harga);
        
        System.out.println("\n===== DETAIL PEMBELIAN =====");
        System.out.println("Nama Barang       : " + barang);
        System.out.println("Kategori Harga    : " + kategori);
        System.out.println("Harga Awal        : Rp" + harga);
        System.out.println("Diskon (" + diskon + "%)      : Rp" + nominalDiskon);
        System.out.println("Harga Akhir       : Rp" + hargaSetelahDiskon);
        System.out.println("============================\n");
        
        input.close();
    }
}
