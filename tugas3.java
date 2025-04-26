/* 
 * Nama : Faros Jubran Aqila
 * NPM : 50424431
 * Kelas : 1IA20
 * Tugas : 3
 */

 public class tugas3 {

    public static void main(String[] args) {
        // Menginisialisasi array angka 1D dan 2D yang berisi elemen-elemen yang memiliki duplikat.
        int[] angka1D = {12, 1, 3, 5, 1, 9, 12, 3, 4, 7};
        int[][] angka2D = {
            {7, 8, 10, 12, 16, 18, 27},
            {6, 10, 12, 3, 27, 17, 2}
        };

        // Output pencarian elemen ganda di array 1D
        System.out.println("\nOutput 1D:");
        Ganda1D(angka1D); // Panggil method untuk mencari elemen ganda pada array 1D

        // Output pencarian elemen ganda di array 2D
        System.out.println("\nOutput 2D:");
        Ganda2D(angka2D); // Panggil method untuk mencari elemen ganda pada array 2D
    }

    public static void Ganda1D(int[] arr) {
        // Untuk array 1D:
        // - Melakukan perbandingan setiap elemen dengan elemen setelahnya.
        // - Jika ditemukan elemen yang sama, cetak nilai dan lokasi indeksnya.
        // - Menggunakan break agar tidak mencetak ganda berulang-ulang.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Elemen ganda: " + arr[i]);
                    System.out.println("Lokasi : [" + i + "] dan [" + j + "]");
                    break; //Menghentikan perulangan setelah ditemukan duplikat pertama
                }
            }
        }
    }

    public static void Ganda2D(int[][] arr) {
        // Untuk array 2D:
        // - Melakukan perbandingan elemen dalam array 2D.
        // - Membandingkan setiap elemen dengan elemen setelahnya di baris atau kolom berikutnya.
        // - Jika ditemukan elemen yang sama, cetak nilai dan posisi baris-kolomnya.
        // - Menggunakan break agar tidak mencetak ganda berulang-ulang.
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = i; k < rows; k++) {
                    // Mulai mencari di kolom berikutnya jika masih berada di baris yang sama
                    int lStart = (k == i) ? j + 1 : 0;
                    for (int l = lStart; l < cols; l++) {
                        if (arr[i][j] == arr[k][l]) {
                            System.out.println("Elemen ganda: " + arr[i][j]);
                            System.out.println("Lokasi : [" + i + "][" + j + "] dan [" + k + "][" + l + "]");
                            break; // Menghentikan perulangan setelah ditemukan duplikat pertama
                        }
                    }
                }
            }
        }
    }
}
