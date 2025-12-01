                           // Pertanyaan Percobaan 1,2,3,4,5

// Pertanyaan Percobaan 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
   Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu 
   tanpa menggunakan fungsi! 
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
   perintah penampilan menu langsung di dalam fungsi main. 
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
   (mulai dari program dijalankan sampai daftar menu tampil di layar). 

// Pertanyaan Percobaan 2
1. Apakah kegunaan parameter di dalam fungsi?  
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
   namaPelanggan dan isMember? 
3. Apakah parameter sama dengan variabel? Jelaskan. 
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
   perbedaan output ketika isMember bernilai true dan ketika false? 
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter 
   namaPelanggan dan isMember? 
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). 
   Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo 
   adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang 
   berlaku, tampilkan kode invalid. 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
   tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
   perintah pemanggilan fungsi menu yang benar. 
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
   pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
   dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
   Jelaskan alasan Anda.

// Pertanyaan Percobaan 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return 
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh 
dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan 
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua 
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing 
parameter dalam konteks program kafe. 
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari 
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga 
totalHarga. 
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta 
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga 
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis 
menu)?  

// Pertanyaan Percobaan 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... 
namaPengunjung! 
2. Modifikasi method daftarPengunjung menggunakan for-each loop. 
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban 
Anda berdasarkan aturan varargs di Java, dan berikan contohnya! 
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? 
Jika tetap berjalan, bagaimana output yang dihasilkan? 

// Pertanyaan Percobaan 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program 
dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna 
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur 
jalannya program sampai output tersebut muncul. 
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program 
tersebut! 
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? 
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? 
Jelaskan! 
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi 
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume 
di Percobaan 5. 
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan 
kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, 
hitungLuas, dan hitungVolume.

                              //Jawaban Pertanyaan P1-5

// Jawaban P1
1. Tidak. Fungsi tanpa parameter tidak harus bertipe void. Fungsi tersebut bisa memiliki tipe data kembalian lain (seperti int, String, boolean, dll)
2. Bisa. Caranya adalah memindahkan semua perintah (System.out.println) langsung ke dalam fungsi main.
3. Mempersingkat kode program, Dapat memanggil kembali fungsi diluar main
4. start-fungsi main- menu()- fungsi menu()-back to fungsi main- end

// Jawaban P2
1. Sebagai input data dari luar ke dalam fungsi
2. Agar fungsi dapat menampilkan output yang spesifik untuk pelanggan yang member / bukan member dan menentukan logika pemberian diskon berdasarkan status keanggotaan pelanggan tersebut.
3. Hampir sama. Parameter adalah jenis variabel khusus yang dideklarasikan di dalam tanda kurung fungsi untuk menerima nilai input. Sedangkan variabel biasa dideklarasikan di dalam blok kode untuk menyimpan data sementara.
4. Parameter isMember bekerja sebagai penentu kondisi (boolean).
Jika true: Program akan menjalankan blok if dan mencetak kalimat "Anda mendapatkan diskon 10%...".
Jika false: Blok if dilewati, kalimat diskon tidak ditampilkan.
5. Error
6. Sudah memodifikasi
7. Sudah
8. Ya

// Jawaban P3
1. Butuh Return Value: Ketika hasil pemrosesan dalam fungsi ingin digunakan kembali untuk perhitungan lain atau    disimpan dalam variabel di fungsi pemanggil (misal: main). Contoh: Fungsi hitungTotalHarga mengembalikan nilai int agar total harga bisa disimpan di variabel totalHarga dalam main.
Tidak Butuh (Void): Ketika fungsi hanya bertugas melakukan proses (seperti output) dan tidak perlu melaporkan nilai balik ke pemanggil. Contoh: Fungsi menu bertipe void karena hanya menampilkan daftar teks ke terminal.
2. fungsi hitungTotalHarga memiliki tipe data integer dan memiliki parameter (int pilihanMenu, int banyakItem) fungsi ini untuk menghitung total harga yang akan di beli oleh user.
3. sudah
4. sudah

// Jawaban P4
1. karena bersifat fleksibel, dapat menerima jumlah argumen yang tidak terbatas (bisa 0, 1, 5, atau lebih data String)
2. Sudah
3. tidak bisa, hanya boleh ada satu parameter varrags dalam satu fungsi
4. Jika dipanggil tanpa argumen (daftarPengunjung()), Program akan menganggap parameter "namaPengunjung" sebagai array kosong (panjang array = 0). Output: Program hanya akan mencetak baris judul "Daftar Pengunjung Cafe:" saja, tanpa mencetak nama apapun di bawahnya karena perulangan tidak akan dieksekusi.

// Jawaban P5
1. start- method(main)- deklarasi variabel- memanggil fungsi hitungLuas- menghitung- mengembalikan nilai- menyimpan di variabel L- menampilkan Luas- memanggil fungsi hitungVolume- menghitung- menampilkan volume- end.
2. Luas alas balok adalah: 12 Volume balok adalah: 60
Alur=
Start-Input masuk: p=4, l=3, t=5.-hitungLuas(4, 3) dieksekusi -> 4 * 3 = 12- Hasil 12 dicetak-hitungVolume(5, 4, 3) dieksekusi.-Di dalam volume, memanggil hitungLuas(4, 3) lagi -> dapat 12.-Menghitung volume: 12 * 5 = 60.-Hasil 60 dikembalikan ke main dan dicetak-End.
3. Di main, int temp = Jumlah(1, 1) -> temp bernilai 2.
   Panggil TampilJumlah(temp, 5) atau TampilJumlah(2, 5).
   Di dalam TampilJumlah, dipanggil Jumlah(bil1, bil2) yaitu Jumlah(2, 5) -> hasilnya 7.
   Hasil 7 dimasukkan ke fungsi TampilHinggaKei(7).
   Fungsi ini melakukan looping mencetak angka dari 1 sampai 7 tanpa spasi.
4. (Parameter) Digunakan saat fungsi membutuhkan data input dari luar agar bisa bekerja (dinamis). Jika tidak butuh input luar, tidak perlu parameter. (Return Value) Digunakan saat hasil olahan fungsi ingin diolah lagi atau disimpan dalam variabel. Jika fungsi hanya sekadar menampilkan sesuatu ke layar, tidak butuh return value (void).
5. Wajib memakai parameter, karena inputan dari user akan dan pasti berbeda beda.
6. Fungsi ini wajib memiliki return value (int) karena hasil perhitungannya dibutuhkan oleh bagian lain program.