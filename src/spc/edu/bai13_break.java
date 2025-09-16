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
public class bai13_break {
    public static void main(String[] args) {
        System.out.println("break");
        Scanner Scanner=new Scanner(System.in);
        for(int i=0;i<=10000;i++){
            if(i==100){
                break;
                /*continue;*/
            }
            System.out.print(i+" ");
        }
        System.out.println("ket thuc");
    }
}
