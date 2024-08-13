/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCauTrucLap;

import java.util.Scanner;
/**
 *
 * @author nguye
 */
public class BaiTap11 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so nguyen n. Kiem tra n co phai la so doi xung khong?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        int sodao = TimSoDao(n);
        if(n == sodao){
            System.out.println("" +n + " la so doi xung");
        }
        else{
            System.out.println("" +n + " khong phai la so doi xung");
        }
        
    }
    public static int TimSoDao(int n){
        int sodao = 0;
        while(n > 0){
            sodao = sodao * 10 + (n % 10);
            n = n / 10;
        }
        return sodao;
    }
}
