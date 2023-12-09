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
public class nomor7a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        
        int loop =1;// memesan tempat di memori dengan nama putar dengan tipe data integer
        double jumlah = 0, jumlahKuadrat=0;// memesan tempat di memori dengan nama jumlah, jumlahKuadrat dengan tipe data double
        double bilangan, dataInput,rerata,selisih,min=0,maks=0,varia,devia;// memesan tempat dimemori dengan nama bilangan, dataInput, rerata, selisih, maks, min, devia, varia dengan tipe data double 
     
        
        System.out.print("masukan data yang ingin dihitung : ");// mencetak tulisan "masukan data yang ingin dihitung : "
        dataInput=in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable dataInput
        
        while (loop <= dataInput){ // selama isi variable loop kurang sama dengan isi variable dataInput
            System.out.println("masukan data ke "+loop+" : ");// mencetak tulisan "masukan data ke " disambung dengan isi variable loop disambung dengan " : "
            bilangan = in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable bilangan 
            jumlah = jumlah + bilangan;//menyimpan hasil perhitungan dari isi variable jumlah ditambah isi variable bilangan lalu disimpan ke variable jumlah
            jumlahKuadrat = jumlahKuadrat+Math.pow(bilangan, 2) ;//menyimpan hasil perhitungan dari isi variable jumlahKuadrat ditambah pangakat 2 dari isi variable bilangan lalu disimpan ke variable jumlahKuadrat
            
            if (bilangan==1) maks=bilangan;//jika isi variable bilangan sama dengan 1 maka menyimpan bilangan ke variable maks
            else if (bilangan>maks) maks=bilangan;// jika bilangan lebih besar dari variable maks maka menyimpan variable bilangan ke variable maks
            if (bilangan==1) min=bilangan;//jika isi variable bilangan sama dengan 1 maka menyimpan bilangan ke variable min
            else if (bilangan<min) min=bilangan;//jika bilangan lebih besar dari variable min maka menyimpan variable bilangan ke variable min
            
          
            
            loop++;// menyimpan hasil perhitungan dari isi variable loop ditambah dengan 1 lalu disimpan ke variable loop
            
        }
        System.out.println("data terbesar = "+maks);//mencetak tulisan "data terbesar = " disambung isi variable maks
        System.out.println("data terkecil = "+min);//mencetak tulisan "data terkecil = " disambung isi variable min
        
        selisih=maks-min;//menyimpan hasil hitung dari isi variable maks dikurangi isi variable min
        System.out.println("rentang data = "+selisih);//mencetak tulisan "rantang data = " disambung isi variable selisih

        rerata=jumlah/dataInput;// menyimpan hasil hitung isi variable jumlah dibagi isi variable dataInput
        System.out.println("rata rata = "+rerata);//mencetak tulisan "rata rata = " disambung isi variable rerata
         
        varia= jumlahKuadrat - loop*Math.pow(rerata, 2)/loop;//menyimpan hasil hitung isi variable jumlahKuadrat dikurang isi variable loop dikali pangkat 2 isi variable rerata dibagi isi variable loop lalu disimpan ke variable varia
        System.out.println("variansi = "+varia);//mencetak tulisan "variansi = " disambung isi variable varia
        
        devia= Math.sqrt(selisih);// menyimpan hasil hitung akar isi variable varia lalu disimpan ke variable devia
        System.out.println("deviasi standard = "+varia);//mencetak tulisan "deviasi standard = " disambung isi variable devia
    }
}
