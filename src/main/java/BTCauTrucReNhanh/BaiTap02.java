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
public class BaiTap02 {
    public static void main(String[] args) {
        double diemtoan, diemanh, diemvan;
        double avg;
        String kq = "";
        System.out.println("Xep loai hoc sinh theo diem trung binh");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem mon toan: ");
        diemtoan = sc.nextDouble();
        System.out.print("Nhap diem mon van: ");
        diemvan = sc.nextDouble();
        System.out.print("Nhap diem mon anh: ");
        diemanh = sc.nextDouble();
        
        avg = (diemtoan + diemvan + diemanh) / 3;
        
        if (avg >= 0 && avg < 4) {
            kq = "Yeu";
        } else if(avg >= 4 && avg < 6.5){
            kq = "Trung binh";
        }
        else if(avg >= 6.5 && avg < 8){
            kq = "Kha";
        }
        else{
            kq = "Gioi";
        }
        
        System.out.println("Diem trung binh: " +avg + " - " + "Xep loai: " +kq);
    }
    
}
