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
public class bai7va8_hinhchunhatvahinhtron {
    public static void main(String[] args) {
        // hinh chu nhat
        System.out.println("chuong trinh hinh chu nhat");
        Scanner Scanner =new Scanner(System.in);
        System.out.println("chieu dai");
        double cd = Scanner.nextInt();
        System.out.println("chieu rong");
        double cr = Scanner.nextInt();
        double cv = (cd + cr)*2;
        double dt = cd*cr;
        System.out.println("chu vi hinh chu nhat:"+cv);
        System.out.println("dien tich hinh chu nhat:"+dt);
        
        // hinh tron
        System.out.println("ban kinh");
        double bk = Scanner.nextInt();
        double cvht = 2*3.14*bk;
        double dtht = 3.14*(bk*bk);
        System.out.println("chu vi hinh tron:"+cvht);
        System.out.println("dien tich hinh tron:"+dtht);
        
    }
}
