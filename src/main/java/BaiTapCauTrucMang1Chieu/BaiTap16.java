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
public class BaiTap16 {
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
        
        int tong = TongMang(n);
        System.out.print("\nTong cac gia tri cua mang: " +tong);
        
        int index = DemDuongLe(n);
        System.out.print("\nCo " +index + " so duong le trong mang");
        
        int max = TimSoLonNhat(n);
        System.out.print("\nSo co gia tri lon nhat trong mang: " +max);
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
    public static int TongMang(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static int DemDuongLe(int[] a){
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0 && a[i] % 2 != 0){
                index++;
            }
        }
        return index;
    }
    public static int TimSoLonNhat(int[] a){
        int max = a[0];
        for (int i : a) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}

