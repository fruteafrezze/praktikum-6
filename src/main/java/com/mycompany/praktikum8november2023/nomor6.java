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
public class nomor6 {// deklarasi class
    public static void main(String[] args) {// deklarasi metode main 
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        
        int putar =1;// memesan tempat di memori dengan nama putar dengan tipe data integer
        double jumlah = 0;// memesan tempat di memori dengan nama jumlah dengan tipe data double
        double bilangan, dataInput,rerata;// memesan tempat dimemori dengan nama bilangan, dataInput, rerata dengan tipe data double 
     
        System.out.println("Program menghitung rerata");// mencetak tulisan "Program menghitung rerata"
        System.out.print("masukan data yang ingin dihitung : ");// mencetak tulisan "masukan data yang ingin dihitung : "
        dataInput=in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable dataInput
        
        while (putar <= dataInput){ // selama isi variable putar kurang sama dengan isi variable dataInput
            System.out.println("masukan data ke "+putar+" : ");// mencetak tulisan "masukan data ke " disambung dengan isi variable putar disambung dengan " : "
            bilangan = in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable bilangan 
            jumlah = jumlah + bilangan;//menyimpan hasil perhitungan dari isi variable jumlah ditambah isi variable bilangan lalu disimpan ke variable jumlah
            putar++;// menyimpan hasil perhitungan dari isi variable putar ditambah dengan 1 lalu disimpan ke variable putar
        }
        rerata=jumlah/dataInput;// menyimpan hasil hitung isi variable jumlah dibagi isi variable dataInput
        System.out.println("jumlah rerata bilangan tersebut adalah "+rerata);// mencetak tulisan " jumlah rerata bilangan tersebut adalah " disambung isi variable rerata
    }
}
