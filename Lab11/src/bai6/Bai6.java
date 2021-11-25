/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;





/**
 *
 * @author minhm
 */
public class Bai6 {

    public static void main(String[] args) {
        String remoteUrl="http://c3batbat.edu.vn/uploads/photos/images/2019/11/anh-nen-dep/40-wallpapers-landscapes-pack-003.jpg";
        String filename = "abc.jpg";
        
        try {
            URL url = new URL(remoteUrl);
            
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream(filename);
            
            byte[] buffer = new byte[2048];
            int length = 0;
            
            System.out.println("Downloading from url :"+remoteUrl);
            
            while ((length= inputStream.read(buffer))!= -1) 
            {                
                System.out.println("Buffer Read length :"+length);
                outputStream.write(buffer,0,length);
            }
            System.out.println("Download finished :"+filename);
            
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
    }
}
