/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai17_tongChanLe {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Tính Tổng Chẵn");
        Scanner Sc=new Scanner(System.in);
        int nhap = Sc.nextInt();
        int tongChan=0;
        int tongLe=0;
        for (int i = 1; i <= nhap; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
        }

        System.out.println("Tổng các số chẵn từ 1 đến " + nhap + " là: " + tongChan);
        System.out.println("Tổng các số lẻ từ 1 đến " + nhap + " là: " + tongLe);

        Sc.close();
    }
}
