public class SelectionSort {
    public static void selectionSort(JadwalUjian[] jadwalUjian, String kriteria) {
        int n = jadwalUjian.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                boolean lebihKecil = false;

                if (kriteria.equals("nama")) {
                    lebihKecil = jadwalUjian[j].namaMataKuliah.compareTo(jadwalUjian[minIdx].namaMataKuliah) < 0;
                } else if (kriteria.equals("tanggal")) {
                    lebihKecil = jadwalUjian[j].tanggalUjian.compareTo(jadwalUjian[minIdx].tanggalUjian) < 0;
                }

                if (lebihKecil) {
                    minIdx = j;
                }
            }

            // Swap
            JadwalUjian temp = jadwalUjian[minIdx];
            jadwalUjian[minIdx] = jadwalUjian[i];
            jadwalUjian[i] = temp;
        }
    }
}
