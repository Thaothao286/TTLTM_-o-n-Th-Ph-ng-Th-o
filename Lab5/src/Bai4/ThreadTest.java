/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.Random;
/**
 *
 * @author Thang
 */
public class ThreadTest {
    public static int[] mang =new  int[1000];
    
    public static void gan()
    {
        for (int i=0; i<mang.length;i++)
        {
            int random = new Random().nextInt(1000);
            mang[i]=random;
        }
    }
    public static void main(String[] args) {
        gan();
        ThreadUtils a= new ThreadUtils(0,500,mang);
        Thread t1= new Thread(a);
        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        long tong1=a.getTong();
        
        
        ThreadUtils b= new ThreadUtils(501,999,mang);
        Thread t2= new Thread(b);
        t2.start();
        try
        {
            t2.join();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        long tong2=b.getTong();
        
        System.out.println("Tong mang 1: " + tong1);
        System.out.println("Tong mang 2: " + tong2);
        System.out.println("Tong hai gia tri: " + tong1 + tong2); 
        
       
    }
    
}
