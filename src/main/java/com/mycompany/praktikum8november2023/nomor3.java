/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum8november2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor3 { // deklarasi class 
    public static void main(String[] args) { // deklarasi metode main
        int bilangan = 0, jumlah = 0; // memesan 2 tempat dimemori dengan masing-masing nama bilangan dan jumlah juga masing-masing diisi dengan nilai 0
        while (bilangan <= 100) { // selama isi variable bilangan kurang sama dengan 100 maka akan mengeksekusi perintah dibawahnya
            jumlah=jumlah+bilangan; //menyimpan hasil perhitungan dari isi variable jumlah ditambah isi variable bilangan lalu disimpan ke variable jumlah
            bilangan=bilangan+5; // menyimpan hasil perhitungan dari isi variable bilangan ditambah dengan 5 lalu disimpan ke variable bilangan
        }
        System.out.println(" Jumlah dari 5+10+…+100 =  "+  jumlah);// mencetak tulisan "jumlah dari 5+10+15+....+100 = " disambung dengan isi variable jumlah 
    }
  
}
