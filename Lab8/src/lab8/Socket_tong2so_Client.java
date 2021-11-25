/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
/**
 *
 * @author Thang
 */
public class Socket_tong2so_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        System.out.println("Client đang kết nối vs Server....");
        Socket ClientSocket= new Socket("127.0.0.1",2212); // tạo socket để kết nối vs server 
        // 127.0.0.1 hoặc Localhost
        System.out.println("Kết nối thành công");
        
        DataInputStream inFromUser= new DataInputStream(System.in);// tạo luông nhập dữ liệu từ bàn phím
        
        DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); //tạo luồng nhận dữ liệu từ Server
        
        DataOutputStream outtoServer=new DataOutputStream(ClientSocket.getOutputStream());//tạo luông gửi dữ liệu lên Server
        //nhập dữ liệu từ bàn phím
        String a,b,tong;
        while(true)
        {   
            System.out.println("Nhập 'quit' nếu muốn dừng");
            System.out.println("Nhập a ");
            a=inFromUser.readLine();
            System.out.println("Nhập b ");
            b=inFromUser.readLine();
            //gửi dữ liệu lên server
            outtoServer.writeBytes(a+'\n');
            outtoServer.writeBytes(b+'\n');
            if(a.equalsIgnoreCase("quit")||b.equalsIgnoreCase("quit"))
            {
                break;
            }
        tong=inFromServer.readLine();
        System.out.println("Kết quả là "+tong);
        }
        
        ClientSocket.close(); // đóng kết nối
        
    }

    
}
