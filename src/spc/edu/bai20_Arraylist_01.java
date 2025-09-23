/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai20_Arraylist_01 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner nhap = new Scanner(System.in);
        ArrayList<String> sinhvien = new ArrayList<String>();
        while(true){
            //nhap
            System.out.print("nhập tên sinh viên:");
            String s = nhap.next();
            if("0".equals(s)) break;
            sinhvien.add(s);//try catch
        }
        System.out.print("danh sách sinh viên là: "+sinhvien.toString());
        System.out.print("\ntổng số có: "+sinhvien.size()+"sinh viên");
    }
}