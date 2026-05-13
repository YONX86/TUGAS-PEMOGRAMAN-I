package Latihan;

public class Latihan1 {
    private String hari;
    private String mataPelajaran;
    private String guru;
    private String jam;

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public void setGuru(String guru) {
        this.guru = guru;
    }

    public void setJam(String jam) {
        this.jam = 
    }

    public String getHari() {
        return 
    }

    public String getMataPelajaran() {
        return 
    }

    public String getGuru() {
        return guru;
    }

    public String getJam() {
        return jam;
    }

    public static void main(String args[]) {
        Latihan1 jadwal[] = new Latihan1[3];

        jadwal[0] = new Latihan1();
        jadwal[0].setHari("Senin");
        jadwal[0].setMataPelajaran("Matematika");
        jadwal[0].setGuru("Bu Sari");
        jadwal[0].setJam("08:00 - 09:30");

        jadwal[1] = new Latihan1();
        jadwal[1].setHari("Selasa");
        jadwal[1].setMataPelajaran("Bahasa Indonesia");
        jadwal[1].setGuru("Pak Budi");
        jadwal[1].setJam("10:00 - 11:30");

        jadwal[2] = new Latihan1();
        jadwal[2].setHari("Rabu");
        jadwal[2].setMataPelajaran("IPA");
        jadwal[2].setGuru("Bu Tina");
        jadwal[2].setJam("13:00 - 14:30");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Jadwal Kelas ke-" + (i + 1));
            System.out.println("Hari          : " + jadwal[i].getHari());
            System.out.println("Mata Pelajaran: " + jadwal[i].getMataPelajaran());
            System.out.println("Guru          : " + jadwal[i].getGuru());
            System.out.println("Jam           : " + jadwal[i].getJam());
            System.out.println();
        }
    }
}
