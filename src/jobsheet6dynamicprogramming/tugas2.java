/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tugas2 {
    public static void main(String[] args){
        String identitas = "Regita Putri Rozi/X RPL 5/35";
        System.out.println("Identitas: " + identitas);
        
        Scanner baca = new Scanner(System.in);
        String jenis[] = new String[] {"E", "B", "A", "D", "C"};
        int berat[] = new int[] {7, 5, 4, 3, 2};
        int bayaran[] = new int[] {10000, 7000, 5000, 3000, 2000};
        int harga;
        int total = 0;
        int jumlah;
        System.out.print("Masukkan berat: ");
        int beratmuatan = baca.nextInt();
        
        for(int a = 0; a < jenis.length; a++){
            if(beratmuatan >= berat[a]){
                jumlah = beratmuatan / berat[a];
                harga = jumlah * bayaran[a];
                total += harga;
                System.out.println("Barang: " +jenis[a]+ " sebanyak " +jumlah);
                System.out.println("Bayaran: " +harga);
            }
        }
        System.out.println("Total bayaran: Rp " +total);
            }
        }