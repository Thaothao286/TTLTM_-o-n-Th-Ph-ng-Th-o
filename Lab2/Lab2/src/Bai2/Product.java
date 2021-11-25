/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Product {
    private String ma;
    private String ten;
    private int sl;
    private float gia;

    Scanner sc=new Scanner(System.in);
    public Product() {
    }

    public Product(String ma, String ten, int sl, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public void input()
    {   
        System.out.println("Nhập mã sản phẩm");
        this.ma=sc.nextLine();
        System.out.println("Nhập tên sản phẩm");
        this.ten=sc.nextLine();
        System.out.println("Nhập số lượng");
        this.sl=sc.nextInt();
        System.out.println("Nhập giá sản phẩm");
        this.gia=sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Mã: "+this.ma);
        System.out.println("Tên: "+this.ten);
        System.out.println("Số lượng: "+this.sl);
        System.out.println("Giá bán: "+this.gia);
    }
}
