/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2");
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2,delta;
        System.out.println("Nhap a");
        a = sc.nextDouble();
        System.out.println("Nhap b");
        b = sc.nextDouble();
        System.out.println("Nhap c");
        c = sc.nextDouble();
        if ( a==0) {
            if (b==0) {
            if (c!=0)
            {System.out.println("Phuong trinh vo nghiem");}
            else {System.out.println("Phuong trinh co vo so nghiem");}
            }
            else {x1=x2=-c/b;
            System.out.println("phuong trinh co nghiem x="+x1);}
        }
        else {delta=b*b-4*a*c;
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");}
        else if (delta == 0)
        { x1=x2= - b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x1=x2="+x1);}
        else { x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);}
        }
        }
            
    }

