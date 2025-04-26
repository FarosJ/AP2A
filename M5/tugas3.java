/*  
 * Nama : Faros Jubran Aqila
 * NPM : 50424431
 * Kelas : 1IA20
 * Tugas : 3
 */

 public class tugas3 {

    public static void main(String[] args) {
        System.out.println("\n=====Pencarian Elemen Ganda 1D dan 2D=====");

        // Menginisialisasi array angka 1D dan 2D yang berisi elemen-elemen yang memiliki duplikat.
        int[] angka1D = {12, 1, 3, 5, 1, 9, 12, 3, 4, 7};
        int[][] angka2D = {
            {7, 8, 10, 12, 16, 18, 27},
            {6, 10, 12, 3, 27, 17, 2}
        };

        // Output pencarian elemen ganda di array 1D
        System.out.println("\nOutput 1D:");
        
        // Untuk array 1D:
        // - Melakukan perbandingan setiap elemen dengan elemen setelahnya.
        // - Jika ditemukan elemen yang sama, cetak nilai dan lokasi indeksnya.
        // - Menggunakan break agar tidak mencetak ganda berulang-ulang.
        for (int i = 0; i < angka1D.length; i++) {
            for (int j = i + 1; j < angka1D.length; j++) {
                if (angka1D[i] == angka1D[j]) {
                    System.out.println("Elemen ganda: " + angka1D[i]);
                    System.out.println("Lokasi : [" + i + "] dan [" + j + "]");
                    break; // Menghentikan perulangan setelah ditemukan duplikat pertama
                }
            }
        }

        // Output pencarian elemen ganda di array 2D
        System.out.println("\nOutput 2D:");
        
        // Untuk array 2D:
        // - Melakukan perbandingan elemen dalam array 2D.
        // - Membandingkan setiap elemen dengan elemen setelahnya di baris atau kolom berikutnya.
        // - Jika ditemukan elemen yang sama, cetak nilai dan posisi baris-kolomnya.
        // - Menggunakan break agar tidak mencetak ganda berulang-ulang.
        int rows = angka2D.length;
        int cols = angka2D[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = i; k < rows; k++) {
                    // Jika di baris yang sama, mulai mencari dari kolom berikutnya
                    int lStart = (k == i) ? j + 1 : 0;
                    for (int l = lStart; l < cols; l++) {
                        if (angka2D[i][j] == angka2D[k][l]) {
                            System.out.println("Elemen ganda: " + angka2D[i][j]);
                            System.out.println("Lokasi : [" + i + "][" + j + "] dan [" + k + "][" + l + "]");
                            break; // Menghentikan perulangan setelah ditemukan duplikat pertama
                        }
                    }
                }
            }
        }
    }
}
