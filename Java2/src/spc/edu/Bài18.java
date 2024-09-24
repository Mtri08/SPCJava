
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bài18 {
    public static void main(String[] args) {
        System.out.println("HỌC VỀ ARRYLIST");
        ArrayList ds = new ArrayList();
        ArrayList b = new ArrayList();
        
        for (int i = 1; i<10;i++){
            ds.add(i);
        }
        
            ds.add("haha");
            ds.removeFirst();
                    ds.removeLast();
            System.out.println("ArrayList a"+ ds);
             for (int i = 0; i<ds.size();i++){
            {
            System.out.println(ds.get(i)+"");
            }
            
             }
    }
}
               
    


