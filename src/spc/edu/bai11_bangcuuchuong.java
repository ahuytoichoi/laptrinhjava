/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class bai11_bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("bang cuu chuong");
        for(int so=2;so<=9;so++)
        {
             System.out.println("Bang cuu chuong " + so + ":");
            for(int i=1;i<=9;i++){
             System.out.println(i + " x " + so + " = " + (i * so));
                
            }
            System.out.println();
        }
    }
}
