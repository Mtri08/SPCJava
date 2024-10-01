/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class De1KT {
    public static void main(String[] args) {
        System.out.println("Cau2");
        Scanner sc = new Scanner(System.in);
        double s, nuachuvi, canha ,canhb, canhc , dientich;
        System.out.println("Nhap canha : ");
        canha =sc.nextInt();
        System.out.println("Nhap canhb : ");
        canhb =sc.nextInt();
        System.out.println("Nhap canhc : ");
        canhc =sc.nextInt();
        s = (canha  + canhb + canhc)/2;
        dientich = Math.sqrt(s * (s - canha) * (s - canhb) * (s - canhc));
        nuachuvi = s * 2;
        System.out.println("Chu vi hinh tam giac: " + nuachuvi);
        System.out.println("Chu vi hinh tam giac: " + dientich);
         
    }
        
}
