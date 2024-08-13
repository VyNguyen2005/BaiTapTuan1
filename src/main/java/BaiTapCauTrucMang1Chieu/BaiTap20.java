
package BaiTapCauTrucMang1Chieu;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ADMIN
 */
public class BaiTap20 {
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
        
        String kq = TimKiemX(n, sc);
        System.out.print("\n" +kq);
        
        System.out.print("\nMang co tinh tang dan: " +KiemTraTinhTang(n));
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
    public static String TimKiemX(int[] a, Scanner sc){
        String kq = "Khong xuat hien trong mang";
        System.out.print("\nNhap so nguyen x: ");
        int x = sc.nextInt();
        for (int i = 0; i <a.length; i++) {
            if(a[i] == x){
                kq = "Vi tri cua x trong mang la: " +i;
                break;
            }
        }
        return kq;
    }
    public static Boolean KiemTraTinhTang(int[] a){
        if (a.length == 0 || a.length == 1) {
            return true;
        }
        
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
}

