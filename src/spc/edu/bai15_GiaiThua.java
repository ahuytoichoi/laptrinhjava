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
public class bai15_GiaiThua {
    public static void main(String[] args) {
        System.out.print("Nhap so");
        Scanner Scanner=new Scanner(System.in);
        int n = Scanner.nextInt();
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        System.out.println(n + "! = " + ketQua);
    }
}
