public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 matkul1 = new MataKuliah20();
        matkul1.kodeMK = "SIB242005";
        matkul1.nama = "Praktikum Algoritma dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 6;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(4);

        MataKuliah20 matkul2 = new MataKuliah20("SIB242004", "Algoritma dan Struktur Data", 2, 4);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(4);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(4);
    }
}
