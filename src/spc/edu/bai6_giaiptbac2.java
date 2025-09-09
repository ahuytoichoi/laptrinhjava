/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai6_giaiptbac2 {
     public static void main(String[] args) {
        System.out.println("chuong trinh Giai PT Bac2");
        Scanner Scanner = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Nhap he so a");
        a = Scanner.nextDouble();
        System.out.println("Nhap he so b");
        b = Scanner.nextDouble();
        System.out.println("Nhap he so c");
        c = Scanner.nextDouble();
        
        if(a==0){
            if(b!=0){
                if(c==0){
                    System.out.println("phuong trinh vo nghiem");
                }
                else{
                    System.out.println("phuong trinh co vo nghiem");
                }
            }
            else{
                x1 = -c / b;
                System.out.println("phuong trinh co nghiem x1,x2"+x1);
            }
        }
        else{
            delta  = b * b - 4 * a * c;
            if(delta <0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta == 0) {
            x2  = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x2);
            
            }
            else{
                 x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("\nx1 = " + x1);
            System.out.println("\nx2 = " + x2);
            }
        }
        Scanner.close();
     }
}
