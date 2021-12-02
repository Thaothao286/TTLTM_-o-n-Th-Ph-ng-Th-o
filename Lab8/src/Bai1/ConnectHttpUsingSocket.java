/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.io.*;
import java.net.Socket;
/**
 *
 * @author Thang
 */
//Viết ứng dụng phía Client truy xuất đến một trang web sử dụng class Socket
public class ConnectHttpUsingSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",80); // tạo socket kết nối vs  localhost cổng 80
        OutputStream os =socket.getOutputStream(); // gửi yêu cầu
        
    }
}
