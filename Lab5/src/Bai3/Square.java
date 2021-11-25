/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Thang
 */
public class Square implements Runnable,Listener {
    Thread t;
    int so;
    boolean flag =false;
    
    @Override
    public void addSo(int so) {
        this.so = so;
        this.flag=true; // khi nhận đc 1 số mới tạo 
    }
    
    @Override
    public void run() {
            try
            {
                while(true)
                {
                    if(this.flag)
                    {
                        System.out.println("Bình phương: "+so*so);
                        this.flag=false;
                    }
                    t.sleep(1000);
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
    }

    
    
    public void start()
    {
        if(t==null)
            t=new Thread(this,"square");
        t.start();
    }
    
}
