/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai9_SoNgayTrongThay {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("nhap nam");
        int nam = Scanner.nextInt();
        System.out.println("nhap thang");
        int thang = Scanner.nextInt();
        YearMonth yearMonth = YearMonth.of(nam, thang);
        int ngay = yearMonth.lengthOfMonth();

        System.out.println("Thang " + thang + " nam " + nam + " co " + ngay + " ngay.");
    }
}

