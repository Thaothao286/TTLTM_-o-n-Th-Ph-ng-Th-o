/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Thang
 */
public class Lab5 extends Thread
{

    /**
     * @param args the command line arguments
     */
          
       public void run()
       {    
           while(true)
           {
               try
               {
                   System.out.println("This is child Thread");
                   sleep(1000);
               }
               catch(Exception ex)
               {
                   System.out.println(ex);
               }
           }
       }
       
    public static void main(String[] args) {
        Lab5 th= new Lab5();
        th.start();
        System.out.println("This is main Thread");
    }
   
   
   
   
}
