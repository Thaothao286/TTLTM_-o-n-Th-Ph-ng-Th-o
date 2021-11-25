/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Thang
 */
public class Book {
        private String ten;
        private String tg;
        private String nxb;
        private int nam;
        private float gia;
        
        Scanner sc=new Scanner(System.in);
    public Book() {
    }

    public Book(String ten, String tg, String nxb, int nam, float gia) {
        this.ten = ten;
        this.tg = tg;
        this.nxb = nxb;
        this.nam = nam;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

        public void input()
        {   
            
            System.out.println("Nhập tên sách: ");
            this.ten=sc.nextLine();
            System.out.println("Nhập tên tác giả: ");
            this.tg=sc.nextLine();
            System.out.println("Nhập nhà xuất bản: ");
            this.nxb=sc.nextLine(); 
            System.out.println("Nhập năm xuất bản: ");   
            this.nam=Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá bán: ");         
                this.gia=Float.parseFloat(sc.nextLine());              
        }
        public void output()
        {
            System.out.println("Tên: "+this.ten);
            System.out.println("Tên tác giả: "+this.tg);
            System.out.println("Nhà xuất bản: "+this.nxb);
            System.out.println("Năm xuất bản: "+this.nam);
            System.out.println("Giá: "+this.gia);
        }
}
