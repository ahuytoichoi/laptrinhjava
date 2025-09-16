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
public class bai12_tinhluythua {
    public static void main(String[] args) {
        System.out.println("tinh luy thua");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int so = scanner.nextInt();
        System.out.println("nhap mu");
        int mu = scanner.nextInt();
        int luythua=2;
        for(int i=1;i<mu;i++){
            luythua *= so;
        }
        System.out.println(so+"^"+mu+"="+luythua);
    }
}
