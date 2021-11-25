/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Thang
 */
public class ThreadUtils implements Runnable {
    
      static int arr[]=new int[1000];
      private int sd;
      private int sc;
      private long tong;

    public ThreadUtils() {
    }

    public ThreadUtils(int sd, int sc, int arr[]) {
        this.sd = sd;
        this.sc = sc;
        this.arr=arr;
    }
      
    public void run()
    {
        for (int i=sd;i<sc;i++)
        {
           tong = tong+arr[i];
        }
    }

    public long getTong() {
        return tong;
    }
    
    
}
