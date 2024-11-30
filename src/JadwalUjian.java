public class JadwalUjian {
    String namaMataKuliah;
    String tanggalUjian;

    
    public JadwalUjian(String namaMataKuliah, String tanggalUjian) {
        this.namaMataKuliah = namaMataKuliah;
        this.tanggalUjian = tanggalUjian;
    }

    // Method untuk mencetak jadwal
    public void cetakJadwal() {
        System.out.println(namaMataKuliah + " - " + tanggalUjian);
    }
}
