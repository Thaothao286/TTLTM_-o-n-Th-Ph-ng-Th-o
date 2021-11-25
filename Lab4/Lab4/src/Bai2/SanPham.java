/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class SanPham {
        String ten;
        int gia;
        Scanner sc= new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
        
        public void nhap()
        {
            System.out.println("Tên sản phẩm: ");
            this.ten=sc.nextLine();
            System.out.println("Giá sản phẩm: ");
            this.gia=sc.nextInt();
        }
        public void xuat()
        {
            System.out.println("Tên: "+this.ten);
            System.out.println("Giá: "+this.gia);
        }
        public boolean findname(ArrayList<SanPham> b,int n)
        {
        return true;
        }
}
