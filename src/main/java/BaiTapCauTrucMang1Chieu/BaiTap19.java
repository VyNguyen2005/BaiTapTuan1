/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCauTrucMang1Chieu;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class BaiTap19 {
    public static void main(String[] args) {
        int[] n;
        int a;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        a = sc.nextInt();
        
        n = new int[a];
        
        System.out.print("\nMang phat sinh: ");
        PhatSinhMang(n); 
        XuatMang(n);
        
        System.out.print("\nMang tang dan: ");
        SapXepTang(n);
        XuatMang(n);
        
        System.out.print("\nNhap so nguyen x: ");
        x = sc.nextInt();
        System.out.print("Cac uoc so cua " +x + " la: ");
        TimUocSoX(n, x);
    }
    public static void PhatSinhMang(int[] a){
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(50);
        }
    }
    public static void XuatMang(int[] a){
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
    public static void SapXepTang(int[] n){
        Arrays.sort(n);
    }
    public static void TimUocSoX(int[] a, int x){
        for (int i = 0; i < a.length; i++) {
           if(a[i] > 0 && x % a[i] == 0){
               System.out.print(a[i] + " ");
           }     
        }
    }
}
