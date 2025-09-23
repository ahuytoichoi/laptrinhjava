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
public class bai19_FindMaxInArray {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("FIND MAX IN ARRAY");
         int[] xarr = new int[10];
        int lonnhat;
        int nhonhat;
        int tongChan = 0;
        Scanner nhap = new Scanner(System.in);

        // Nhập mảng
        for (int i = 0; i < 10; i++) {
            System.out.print("Phần tử của mảng " + i + ": ");
            xarr[i] = nhap.nextInt();
        }

        // Khởi tạo lonnhat và nhonhat bằng phần tử đầu tiên
        lonnhat = xarr[0];
        nhonhat = xarr[0];

        // Xuất mảng, tìm max, min và tính tổng chẵn
        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(xarr[i] + " ");

            if (xarr[i] > lonnhat) {
                lonnhat = xarr[i];
            }

            if (xarr[i] < nhonhat) {
                nhonhat = xarr[i];
            }

            if (xarr[i] % 2 == 0) {
                tongChan += xarr[i];
            }
        }

        System.out.println("\nPhần tử lớn nhất là: " + lonnhat);
        System.out.println("Phần tử nhỏ nhất là: " + nhonhat);
        System.out.println("Tổng các số chẵn là: " + tongChan);
    }
}
