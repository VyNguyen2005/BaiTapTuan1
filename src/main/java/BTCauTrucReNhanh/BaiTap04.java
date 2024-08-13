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
public class BaiTap04 {
    public static void main(String[] args) {
        int a;
        String kq = "";
        System.out.println("Kiem tra tinh chan le cua mot so");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a = sc.nextInt();
        
        if(a % 2 == 0){
            kq = "" +a + " la so chan";
        }
        else{
            kq = "" +a + " la so le";
        }
        
        System.out.println(kq);
    }
}
