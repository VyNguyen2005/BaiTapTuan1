/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCauTrucLap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap08 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Chuong trinh tinh tong cac so nguyen tu 1 -> N");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Tong cac so nguyen tu 1 den " +n + " " + "la " +sum);
    }
}
