
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai21 {
    public static void main(String[] args) {
        System.out.println("Bai Tap o lop");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ho va ten");
        String hovaten = sc.nextLine();
        // Nguyen Minh Tri
        System.out.println("Ho: " + hovaten.substring(0, 7));
        System.out.println("tenlot: " + hovaten.substring(7, 12));
        System.out.println("ten: " + hovaten.substring(12));
        System.out.println("HovaTen in HOA: "+hovaten.toUpperCase());
        System.out.println("Dodai :" + hovaten.length());
    }
    
}
