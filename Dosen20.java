public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        if (statusAktif == true) {
            System.out.println("Status dosen: Aktif");
        } else {
            System.out.println("Status dosen: Tidak Aktif");
        }
        System.out.println("Tahun dosen bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian dosen: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif == true) {
            System.out.println("Anda berhasil mengubah status dosen menjadi Aktif");
        } else {
            System.out.println("Anda berhasil mengubah status dosen menjadi Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diganti menjadi " + bidangKeahlian);
    }

    public Dosen20(){}

    public Dosen20(String id, String nm, boolean status, int tahun, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }
}
