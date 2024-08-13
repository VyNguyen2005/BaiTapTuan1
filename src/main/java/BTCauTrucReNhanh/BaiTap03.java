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
public class BaiTap03 {
    public static void main(String[] args) {
        int a, b, c;
        int min;
        System.out.println("Nhap ba so nguyen. In ra so nho nhat");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextInt();
        System.out.print("Nhap so thu ba: ");
        c = sc.nextInt();
        
        min = a;
        if(min > b){
            min = b;
        }
        else if(min > c){
            min = c;
        }
        
        System.out.println("So nho nhat trong 3 so la: " +min);
    }
}
