/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum8november2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor4 { // deklarasi class
    public static void main(String[] args) { // deklarasi metode main
        int putar =1; // memesan tempat dimemori bernama putar diisi dengan 1
        double jumlah = 0; // memesan tempat dimemori bernama jumlah diisi dengan 0
        double bilangan; // memesan tempat dimemori bernama bilangan 
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        while (putar <= 5){ // selama isi variable putar kurang sama dengan 5 maka akan menjalankan perintah dibawah ini
            System.out.println("masukan data ke "+putar+" : ");// mencetak tulisan "masukan data ke " disambung isi variable putar disambung " : "
            bilangan = in.nextDouble();// membaca input data dari keyboard lalu disimpan ke variable bilangan
            jumlah = jumlah + bilangan;//menyimpan hasil perhitungan dari isi variable jumlah ditambah isi variable bilangan lalu disimpan ke variable jumlah

            putar++;// menyimpan hasil perhitungan dari isi variable putar ditambah dengan 1 lalu disimpan ke variable putar
        }
        System.out.println("jumlah 5 bilangan tersebut adalah "+jumlah);// mencetak tulisan " jumlah 5 bilangan tersebut adalah " disambung dengan isi variable jumlah
    }
}
