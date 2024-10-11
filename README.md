# Ujian Java Fundamental

Project ini dibuat untuk memenuhi ujian Java fundamental. Dalam project ini, peserta diminta untuk menyelesaikan beberapa soal pemrograman dasar menggunakan bahasa pemrograman Java, dengan spesifikasi sebagai berikut:

## Spesifikasi Project
- **Bahasa Pemrograman**: Java
- **Build System**: Maven
- **JDK Version**: JDK 17
- **GroupId**: `com.juaracoding.ujianjf`
- **Artifact**: `ujian-java-fundamental`

## Struktur Package
Project ini memiliki struktur package sebagai berikut:
src/main/java └── com.juaracoding.[inisial]ujian1jf.ujian1 └── Soal1.java └── Soal2.java └── Soal3.java └── ...

Dimana `[inisial]` adalah inisial dari nama peserta.

## Ketentuan Penulisan
- **GroupId** dan **Artifact** harus menggunakan huruf kecil.
- Setiap soal akan ditempatkan dalam class yang terpisah di dalam package `ujian1`, dengan nama class sesuai dengan nomor soal (contoh: `Soal1.java` untuk soal nomor 1).
- Setiap class memiliki:
  - 1 fungsi `main` sebagai tempat untuk menjawab soal.
  - Nama variabel di dalam fungsi `main` harus informatif dan sesuai dengan standar penulisan Java.
  
## Daftar Soal
### 1. Variabel
Buatlah sebuah program yang mendeklarasikan beberapa variabel tipe data dasar (int, float, double, char, String) dan lakukan operasi aritmatika sederhana menggunakan variabel-variabel tersebut.

### 2. String Method
Buatlah program yang menggunakan beberapa method bawaan dari class `String` seperti `.substring()`, `.toUpperCase()`, `.toLowerCase()`, dll. Tampilkan hasil dari setiap operasi method tersebut.

### 3. Percabangan
Buat program yang menggunakan statement percabangan `if`, `else if`, dan `else`. Program harus menerima input dari user dan mengeluarkan hasil berdasarkan kondisi tertentu.

### 4. Perulangan
Buat program yang menggunakan perulangan `for`, `while`, atau `do-while` untuk mencetak deret angka dari 1 sampai 100.

### 5. Array
Buat program yang mendeklarasikan array, mengisi array dengan nilai, dan menampilkan isi array tersebut menggunakan perulangan.

## Cara Menjalankan Project
1. Clone repository dari GitHub.
   ```bash
   git clone https://github.com/[irgantaraa]/ujian-java-fundamental.git

2. Masuk ke direktori project
   ```bash
   cd ujian-java-fundamental

3. Build project menggunakan Maven
 ```bash
   mvn clean install



