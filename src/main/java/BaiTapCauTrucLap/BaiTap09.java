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
public class BaiTap09 {
    public static void main(String[] args) {
        int n;
        int tongso = 0;
        System.out.println("Chuong trinh dem so uoc so cua so nguyen duong N");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                tongso++;
            }
        }
        
        System.out.println("So uoc so cua " +n +" la: " +tongso);
    }
}
