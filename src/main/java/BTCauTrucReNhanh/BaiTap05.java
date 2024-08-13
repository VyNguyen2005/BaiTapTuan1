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
public class BaiTap05 {
    public static void main(String[] args) {
        int sokm;
        float sotien = 0;
        System.out.println("Tinh tien di taxi tu so km nhap vao");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so km xe taxi di duoc: ");
        sokm = sc.nextInt();
        
        if (sokm == 1) {
            sotien = sokm * 15000;
        } else if(sokm > 1 && sokm <= 5){
            sotien = (1 * 15000) + ((sokm - 1) * 13500);
        }
        else if(sokm > 5 && sokm <= 120){
            sotien = (1 * 15000) + (4 * 13500) + ((sokm - 5) * 11000);
        }
        else{
            sotien = (1 * 15000) + (4 * 13500) + (115 * 11000);
            sotien += (sokm - 120) * 11000;
            sotien *= 0.9f;
        }
        
        System.out.println("So tien di taxi la: "+sotien);
    }
}
