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
public class SinhVienIT extends SinhVienPoly{
    public double java;
    public double html;
    public double css;
    public  SinhVienIT(){};
    public SinhVienIT(double java, double html, double css, String hoten, String nganh) {
        super(hoten, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getdiem() {
        return(2*this.java+this.html+this.css)/4;
    }
    @Override
    void Nhap(){
    super.Nhap();
    Scanner sc=new Scanner(System.in);
        nganh="IT";
        System.out.println("Nhap diem java: ");
        java=sc.nextDouble();
        System.out.println("Nhap diem html: ");
        html=sc.nextDouble();
        System.out.println("Nhap diem css: ");
        css=sc.nextDouble();
        
    }
    void xuat()
    {
        super.Xuat();
        Double tb=getdiem();
        String hl=hocluc();
         System.out.println("Diem java: "+this.java+"Diem html: "+this.html+"Diem css: "+this.css
         +"Diem TB: "+tb+"Hoc luc: "+hl);
    }

  
}
