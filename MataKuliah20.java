public class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam+=jam;
        System.out.println("Jam berhasil ditambah. Jam menjadi: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Jam awal kurang dari pengurangan jam yang anda minta.");
        } else {
            jumlahJam-=jam;
            System.out.println("Pengurangan jam berhasil. Jam menjadi: " + jumlahJam);
        }
    }

    public MataKuliah20(){}

    public MataKuliah20(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }
}