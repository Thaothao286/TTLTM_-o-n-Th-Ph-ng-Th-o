/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt4_bt5;

import java.util.Scanner;

/**
 *
 * @author Laptop NamAnh
 */
abstract public class SinhVienPoly{
    public String hoten;
    public String nganh;

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    public SinhVienPoly(){}
    abstract public double getdiem();
    public String hocluc(){
        if(getdiem()<5) return "Yeu";
        else if(getdiem()>=5&&getdiem()<=7)
               return "Trung binh";
        else if(getdiem()>7&&getdiem()<8)
              return "Kha";
        else return "Gioi";
      
      
    }
    void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten=sc.nextLine();
        
    }
    void Xuat(){
        System.out.println("Ho ten: "+hoten+"Nganh: "+nganh);
      }

 


    
}


