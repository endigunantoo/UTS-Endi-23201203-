/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

/**
 *
 * @author A-13
 */
class UTS {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UTS 20 Mei 2024 oleh endi NIM 23201203");
        System.out.println("=========================================");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("=========================================");

        System.out.println("Selamat Datang " + getPanggilan(scanner) + " " + nama + "!");
        System.out.println("Kalkulator");
        
        String lanjut;
        do {
            kalkulator(scanner);
            System.out.println("Apakah Anda ingin melanjutkan jika iya ketik Y jika tidak klik T (Y/T)? ");
            lanjut = scanner.next();
        } while (lanjut.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih telah menggunakan kalkulator kami. Selamat tinggal!");
        scanner.close();
    }

    public static String getPanggilan(java.util.Scanner scanner) {
        System.out.println("Pilih jenis kelamin Anda (1. Laki-laki / 2. Perempuan): ");
        int jenisKelamin = scanner.nextInt();
        return (jenisKelamin == 1) ? "Mas" : "Mbak";
    }

    public static void kalkulator(java.util.Scanner scanner) {
        System.out.println("Masukkan angka pertama: ");
        double bilangan1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double bilangan2 = scanner.nextDouble();

        System.out.println("Masukkan operator matematika (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid. Pilih operator yang valid.");
                kalkulator(scanner);
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}


