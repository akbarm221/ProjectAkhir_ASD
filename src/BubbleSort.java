public class BubbleSort {
    public static void bubbleSort(JadwalUjian[] jadwalUjian, String kriteria) {
        int n = jadwalUjian.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean harusTukar = false;

                if (kriteria.equals("nama")) {
                    harusTukar = jadwalUjian[j].namaMataKuliah.compareTo(jadwalUjian[j + 1].namaMataKuliah) > 0;
                } else if (kriteria.equals("tanggal")) {
                    harusTukar = jadwalUjian[j].tanggalUjian.compareTo(jadwalUjian[j + 1].tanggalUjian) > 0;
                }

                if (harusTukar) {
                    JadwalUjian temp = jadwalUjian[j];
                    jadwalUjian[j] = jadwalUjian[j + 1];
                    jadwalUjian[j + 1] = temp;
                }
            }
        }
    }
}
