import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0;

        while (true) {
            System.out.print("Masukkan jumlah jadwal ujian (angka): ");
            if (scanner.hasNextInt()) {
                jumlah = scanner.nextInt();
                if (jumlah > 0) {
                    break; 
                } else {
                    System.out.println("Jumlah jadwal harus lebih dari 0.");
                }
            } else {
                System.out.println("Input tidak valid! Masukkan angka saja.");
                scanner.next();
            }
        }
        scanner.nextLine(); 

      
        JadwalUjian[] jadwalUjian = new JadwalUjian[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            String namaMataKuliah = scanner.nextLine();
            System.out.print("Masukkan tanggal ujian ke-" + (i + 1) + " (YYYY-MM-DD): ");
            String tanggalUjian = scanner.nextLine();
            jadwalUjian[i] = new JadwalUjian(namaMataKuliah, tanggalUjian);
        }

       
        while (true) {
            System.out.println("\nPilih metode pengurutan:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.print("Masukkan pilihan (1/2): ");
            int metode = scanner.nextInt();

            System.out.println("\nPilih kriteria pengurutan:");
            System.out.println("1. Berdasarkan Nama Mata Kuliah");
            System.out.println("2. Berdasarkan Tanggal Ujian");
            System.out.print("Masukkan pilihan (1/2): ");
            int kriteria = scanner.nextInt();
            scanner.nextLine(); 

            if (metode == 1) { 
                if (kriteria == 1) {
                    System.out.println("\nBubble Sort berdasarkan Nama Mata Kuliah:");
                    BubbleSort.bubbleSort(jadwalUjian, "nama");
                } else if (kriteria == 2) {
                    System.out.println("\nBubble Sort berdasarkan Tanggal Ujian:");
                    BubbleSort.bubbleSort(jadwalUjian, "tanggal");
                } else {
                    System.out.println("Pilihan kriteria tidak valid!");
                    continue;
                }
            } else if (metode == 2) { 
                if (kriteria == 1) {
                    System.out.println("\nSelection Sort berdasarkan Nama Mata Kuliah:");
                    SelectionSort.selectionSort(jadwalUjian, "nama");
                } else if (kriteria == 2) {
                    System.out.println("\nSelection Sort berdasarkan Tanggal Ujian:");
                    SelectionSort.selectionSort(jadwalUjian, "tanggal");
                } else {
                    System.out.println("Pilihan kriteria tidak valid!");
                    continue;
                }
            } else {
                System.out.println("Pilihan metode tidak valid!");
                continue;
            }

          
            for (JadwalUjian jadwal : jadwalUjian) {
                jadwal.cetakJadwal();
            }

            System.out.print("\nIngin mencoba lagi? (y/n): ");
            String ulang = scanner.nextLine();
            if (!ulang.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }
}
