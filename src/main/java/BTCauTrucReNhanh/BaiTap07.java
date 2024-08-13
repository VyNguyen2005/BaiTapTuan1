/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTCauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap07 {
    public static void main(String[] args) {
        int thang;
        int nam;
        String kq = "";
        System.out.println("Nhap thang trong nam. In ra ngay thang do");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                kq = "Thang co 31 ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                kq = "Thang co 30 ngay";
                break;
            case 2:
                if(nam % 4 == 0){
                    kq = "Thang co 29 ngay";
                }
                else{
                    kq = "Thang co 28 ngay";
                }
                break;
            default:
                kq = "Thang khong hop le!";
                break;
        }
        System.out.println(kq);
    }
}
