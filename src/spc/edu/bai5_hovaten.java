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
public class bai5_hovaten {
    public static void main(String[] args) {
        System.out.println("chuong trinh nhap ho va ten");
        Scanner Nhap = new Scanner(System.in);
        System.out.println("nhap ho va ten");
        String hoten = Nhap.nextLine();
        System.out.println("nhap nam sinh");
        int nam = Nhap.nextInt(); 
        
        int tuoi = 2025 - nam;
        System.out.printf("chao mung ban %s,ban nam nay %d\n tuoi ",hoten,tuoi);
                
                
    }
}
