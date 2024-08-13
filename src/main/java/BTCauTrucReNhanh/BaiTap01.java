/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTCauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap01 {
    public static void main(String[] args) {
        double a,b;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat ax + b = 0");
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                kq = "Phuong trinh dung voi moi x";
            } else {
                kq = "Phuong trinh vo nghiem";
            }
        } else {
            kq = "Phuong trinh co nghiem duy nhat x = " + (-b)/a;
        }
        
        System.out.println(kq);
    }
}
