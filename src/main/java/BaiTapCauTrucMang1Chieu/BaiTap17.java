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
public class BaiTap17 {
    public static void main(String[] args) {
        double[] n;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang n: ");
        a = sc.nextInt();
        n = new double[a];
        
        NhapMang(n, sc);
        
        System.out.print("\nCac phan tu cua mang: ");
        XuatMang(n);
        
        TinhTrungBinh(n);
        
    }
    public static void NhapMang(double[] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }
    public static void XuatMang(double[] a){
        for (double item : a) {
            System.out.print(item + " ");
        }
    }
    public static void TinhTrungBinh(double[] a){
        int sum = 0;
        for (double i : a) {
            sum += i;
        }
        float avg = sum / a.length;
        String result = String.format("%.2f", avg);
        System.out.print("\nGia tri trung binh cua mang: " +result);
    }
    public static int TimPhanTu(int[] a){
        int min = a[0];
        for (int i : a) {
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
