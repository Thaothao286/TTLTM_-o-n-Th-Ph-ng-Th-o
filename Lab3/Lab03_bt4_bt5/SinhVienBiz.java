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
public class SinhVienBiz extends SinhVienPoly{
    public double mar;
    public double sale;

    public SinhVienBiz(double mar, double sale, String hoten, String nganh) {
        super(hoten, nganh);
        this.mar = mar;
        this.sale = sale;
    }

    public SinhVienBiz() {
    }

    @Override
    public double getdiem() {
        return(2*this.mar+this.sale)/3;
    }
    @Override
   void Nhap(){
           super.Nhap();
        Scanner sc=new Scanner(System.in);
        nganh="Biz";
        System.out.println("Nhap diem marketing: ");
        mar=sc.nextDouble();
        System.out.println("Nhap diem sale: ");
        sale=sc.nextDouble();
   }
       void xuat()
    {
        super.Xuat();
        Double tb=getdiem();
        String hl=hocluc();
         System.out.println("Diem Marketing: "+this.mar+"Diem Sale: "+this.sale
         +"Diem TB: "+tb+"Hoc luc: "+hl);
    }

   
}
