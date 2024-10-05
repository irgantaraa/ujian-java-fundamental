package com.juaracoding.IAPujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] film = new String[5]; // Array untuk menyimpan nama film

        System.out.println("Daftar film bioskop");

        // Meminta input nama film menggunakan perulangan
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            film[i] = scanner.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        // Menampilkan daftar film menggunakan perulangan
        for (int i = 0; i < film.length; i++) {
            System.out.println((i+1) + ". "+ film[i]);
        }

        scanner.close();
    }
}
