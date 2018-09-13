/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hitungfibonacci {
    public static void main(String[] args){
        
        String identitas = "Regita Putri Rozi/ X RPL 5/ 35";
        tampilJudul(identitas);
        int n = tampilInput();
    }
    private static void tampilJudul(String identitas){
        System.out.println("Identitas: " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ..., dst.\n ");
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-1: ");
        int n = scanner.nextInt();
        
        return n;
    }
}
        
