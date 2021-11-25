/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
/**
 *
 * @author Thang
 */
import java.util.Date;
public class SinhVien {
        private String ma;
        private String ten;
        private int ns;
        private String dc;
        private String lop;
        
        Scanner nhap=new Scanner(System.in);
    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int ns, String dc, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        this.dc = dc;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
        
        public void nhap()
        {
            System.out.println("Mã sinh viên: ");
            this.ma=nhap.nextLine();
            System.out.println("Tên sinh viên: ");
            this.ten=nhap.nextLine();
            System.out.println("Năm sinh: ");
            this.ns=nhap.nextInt();
            nhap.nextLine();
            System.out.println("Địa chỉ: ");
            this.dc=nhap.nextLine();
            System.out.println("Lớp: ");
            this.lop=nhap.nextLine();
        }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", ns=" + ns + ", dc=" + dc + ", lop=" + lop + ", nhap=" + nhap + '}';
    }
    public void xuat()
    {
        System.out.println("Mã: "+this.ma);
        System.out.println("Tên: "+this.ten);
        System.out.println("Năm sinh: "+this.ns);
        System.out.println("Địa chỉ: "+this.dc);
        System.out.println("Lớp: "+this.lop);
    }
        
}
