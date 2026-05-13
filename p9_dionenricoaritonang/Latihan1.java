package Latihan;

// Contoh menggunakan Class, Object, Method, Getter, Setter, Array, dan Perulangan (for)

public class Latihan1 {
    private String namaHewan;
    private String jenis;
    private String suara;

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenis() {
        return jenis;
    }

    public String getSuara() {
        return suara;
    }

    public static void main(String args[]) {
        Latihan1 hewan[] = new Latihan1[3];

        hewan[0] = new Latihan1();
        hewan[0].setNamaHewan("Singa");
        hewan[0].setJenis("Karnivora");
        hewan[0].setSuara("Roar");

        hewan[1] = new Latihan1();
        hewan[1].setNamaHewan("Gajah");
        hewan[1].setJenis("Herbivora");
        hewan[1].setSuara("Trumpet");

        hewan[2] = new Latihan1();
        hewan[2].setNamaHewan("Burung");
        hewan[2].setJenis("Omnivora");
        hewan[2].setSuara("Cuit cuit");

        for (int i = 0; i < hewan.length; i++) {
            System.out.println("Hewan ke-" + (i + 1));
            System.out.println("Nama  : " + hewan[i].getNamaHewan());
            System.out.println("Jenis : " + hewan[i].getJenis());
            System.out.println("Suara : " + hewan[i].getSuara());
            System.out.println();
        }
    }
}
