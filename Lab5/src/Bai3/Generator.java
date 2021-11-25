/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Random;

/**
 *
 * @author Thang
 */
public class Generator implements Runnable{
    Thread t;
    Listener a;

    public Generator() {
        
    }

    public Generator(Listener a) {
        this.a = a;
    }
    
    public void run()
    {
        try
        {
            int so= new Random().nextInt(20);
            System.out.println("Số ngẫu nhiên: "+so);
            a.addSo(so);
            t.sleep(1000);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    public void start()
    {
        if(t==null)
        {
            t= new Thread(this,"Generator");
            t.start();
        }
    }

    
    
    
}
