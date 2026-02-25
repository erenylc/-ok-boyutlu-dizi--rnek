/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proje1;

import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class proje1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("1.Sayıyı giriniz");
        int sayi1= input.nextInt();
        System.out.println("2.Sayıyı giriniz");
        int sayi2= input.nextInt();
        
        if (sayi1>sayi2){
            System.out.println("Tekrar giriniz sayi1 sayi2 den küçük olmalıdır");
        }else{
           int i=sayi1;
           
           while(i<=sayi2){
               if (i%2==0){
                   System.out.println(i);
               }
               i++;
           }
           
        }
    }
}
    

