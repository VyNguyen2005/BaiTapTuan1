/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCauTrucMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap18 {
    public static void main(String[] args) {
        int[] n;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang n: ");
        a = sc.nextInt();
        n = new int[a];
        
        NhapMang(n, sc);
        
        System.out.print("\nCac phan tu cua mang: ");
        XuatMang(n);
        
        System.out.print("\nCac phan tu khong phai la so nguyen to: ");
        KiemTraSoNguyenTo(n);
        
        double avg = TrungBinhSoNguyenTo(n);
        System.out.print("\nTrung binh phan tu la so nguyen to: " +avg);        
        
    }
    public static void NhapMang(int[] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    public static void XuatMang(int[] a){
        for (int item : a) {
            System.out.print(item + " ");
        }
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
    public static void KiemTraSoNguyenTo(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(!LaSoNguyenTo(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static double TrungBinhSoNguyenTo(int[] a){
        int sum = 0;
        double avg;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(LaSoNguyenTo(a[i])){
                index++;
                sum += a[i];
            }
        }
        avg = sum / index;
        return avg;
    }
}

