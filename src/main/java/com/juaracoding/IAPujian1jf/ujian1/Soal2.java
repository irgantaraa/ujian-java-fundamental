package com.juaracoding.IAPujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner snanner = new Scanner(System.in);

        System.out.print("Masukan Nama Film : ");
        String namaFilm = snanner.nextLine();

        System.out.println("Nama Film dalam huruf kapital: " + namaFilm.toUpperCase()); // merubah nama film menjadi kapital
        snanner.close();
    }
}
