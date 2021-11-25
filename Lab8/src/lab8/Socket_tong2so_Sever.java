/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.net.*;
import java.io.*;
/**
 *
 * @author Thang
 */
public class Socket_tong2so_Sever {
    public static void main(String[] args) throws IOException{
        System.out.println("Sever đang khởi động...");
       ServerSocket server= new ServerSocket(2212); //tạo server socket có cổng 2212 để server lắng nghe 
        System.out.println("Đã sẵn sàng");
        while(true)
        {
       Socket CnnSocket=server.accept(); // tạo 1 socket để kết nối từ client tới server
       DataInputStream inFromClient=new DataInputStream(CnnSocket.getInputStream()); // tạo luồng nhận dữ liệu từ Client
       DataOutputStream outtoClient=new DataOutputStream(CnnSocket.getOutputStream());//tạo luồng gửi dữ liệu cho Client
       while(true)
       {
           //truyền dữ liệu nhận đc từ Client vào 2 biến số
       String so1,so2;
       so1=inFromClient.readLine();
       so2=inFromClient.readLine();
       if(so1.equalsIgnoreCase("quit")||so2.equalsIgnoreCase("quit"))
       {
           break;
       }
       //ép kiểu String sang int
       int a=Integer.parseInt(so1);
       int b=Integer.parseInt(so2);
       int tong = a+b;
       //ép sang kiểu String mới gửi đc sang bên Client
       String so3=String.valueOf(tong);
       //gửi so3 về cho Client
       outtoClient.writeBytes(so3+'\n');
       }
        }
    }
    
}
