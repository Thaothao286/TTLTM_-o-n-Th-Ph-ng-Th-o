/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.net.ServerSocket;
import javax.swing.JTextArea;

/**
 *
 * @author Thang
 */
//Lớp này khởi động Server trong 1 thread khác để tránh giao diện bị treo khi Server đang đợi kết nối
public class TCPServer_Thread extends Thread{

    /**
     * @param args the command line arguments
     */
    ServerSocket mServer;
   JTextArea mTxaStatus; // để lưu status của sever(những gì hiện ở trong text)
   public TCPServer_Thread(JTextArea txt)
   {
       mTxaStatus=txt;
   }

    @Override
    public void run()
    {
        try
        {
            String a,b,c;
                int tong;
                
        }
        catch(Exception ex)
        {
        }
    }
   public void StopServer()
   {
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
