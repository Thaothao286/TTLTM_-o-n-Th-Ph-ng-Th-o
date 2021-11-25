/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import static java.lang.Thread.sleep;

/**
 *
 * @author Thang
 */
public class MyThread2 implements Runnable
{
    public static void main(String[] args) {
            MyThread2 myRunnable = new MyThread2();
            Thread thread = new Thread(myRunnable);
            thread.start();
            System.out.println("This is the main thread");

    }
    public void run() 
    {
        
           while(true)
           {
               try
               {
                   System.out.println("This is my Thread");
                   sleep(2000);
               }
               catch(Exception ex)
               {
                   System.out.println(ex);
               }
           }
    }
    
}
