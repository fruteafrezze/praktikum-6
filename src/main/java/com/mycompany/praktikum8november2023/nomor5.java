/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum8november2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor5 {// deklarasi class
    public static void main(String[] args) {// deklarasi metode main
        int hargaPerLiter= 6500,liter = 1,hargaLiter;// memesan 3 tempat dimemori dengan nama hargaPerLiter diisi dengan 6500, liter diisi dengan 1, dan hargaLiter dengan tipe data integer
        System.out.println("Jumlah liter             harga");// mencetak tulisan "jumlah liter     harga"
        System.out.println("==================================");//mencetak tulisan "====================="
        while (liter < 21) {// selama isi variable liter kurang dari 21 maka akan mengeksekusi perintah dibawah ini            
            hargaLiter=liter*hargaPerLiter;// menyimpan perhitungan isi variable liter dikali isi variable hargaPerLiter lalu disimpan ke variable hargaLiter
            System.out.print("      "+liter);//mencetak tulisan "     " disambung isi variable liter
            System.out.println("       |        "+hargaLiter);// mencetak tulisan "     |      " disambung isi variable hargaLiter
            liter++;// menyimpan hasil perhitungan dari isi variable liter ditambah dengan 1 lalu disimpan ke variable liter
        }
        System.out.println("===================================");// mencetak tulisan "==================="
    }
}
