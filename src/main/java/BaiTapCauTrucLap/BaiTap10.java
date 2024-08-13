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
public class BaiTap10 {
        public static void main(String[] args) {
        int n;
        String kq = "";
        System.out.println("Nhap so nguyen n. Kiem tra n co phai la so nguyen to khong?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        if(LaSoNguyenTo(n)){
            kq = "" +n + " la so nguyen to";
        }
        else{
            kq = "" +n + " khong phai la so nguyen to";
        }
        
        System.out.println(kq);
        
    }
    public static Boolean LaSoNguyenTo(int n){
        boolean flag = true;
        if(n < 2){
            return !flag;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return !flag;
            }
            else{
                return flag;
            }
        }
        return flag;
    }
}
