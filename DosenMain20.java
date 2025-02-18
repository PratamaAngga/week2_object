import java.time.Year;
public class DosenMain20 {
    public static void main(String[] args) {
        int tahunSekarang = Year.now().getValue();
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "01BD";
        dosen1.nama = "Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2000;
        dosen1.bidangKeahlian = "Matematika";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa kerja dosen: " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun");
        dosen1.ubahKeahlian("IPA");
        System.out.println();
        Dosen20 dosen2 = new Dosen20("02RN", "Rani", false, 2005, "Inggris");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa kerja dosen: " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun");
        dosen2.ubahKeahlian("Indonesia");
    }
}
