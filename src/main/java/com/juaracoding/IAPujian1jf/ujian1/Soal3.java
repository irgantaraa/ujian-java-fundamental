package com.juaracoding.IAPujian1jf.ujian1;

public class Soal3 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlahTiket = 6;
        double discount = 0.0;

        boolean isWeekend = true;

        // Harga tiket
        int hargaTiket = isWeekend ? 45000 : 35000; // ternary jika weekend 45000 & weekdays 35000

        // Hitung total harga
        int totalHarga = jumlahTiket * hargaTiket;

        // Cek apakah ada diskon
        if (jumlahTiket > 5) {
            discount = 0.1; // Diskon 10%
            totalHarga -= totalHarga * discount;  // Menerapkan diskon ke total harga
            System.out.println("Jumlah Tiket : " + jumlahTiket);
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            System.out.println("Jumlah Tiket : " + jumlahTiket);
            System.out.println("Total harga: " + totalHarga);
        }
    }
}
