/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Product {
    String ten;
    String nxs;
    int gia;

    public Product() {
    }

    public Product(String ten, String nxs, int gia) {
        this.ten = ten;
        this.nxs = nxs;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNxs() {
        return nxs;
    }

    public void setNxs(String nxs) {
        this.nxs = nxs;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
public void input()
{
Scanner sc= new Scanner(System.in);
    System.out.println("Nhập tên sản phẩm: ");
    this.ten= sc.nextLine();
    System.out.println("Nhập tên nhà sản xuất: ");
    this.nxs=sc.nextLine();
    System.out.println("Nhập giá bán: ");
    this.gia=sc.nextInt();
}
public void output()
{
    System.out.println("Tên sản phẩm: "+this.ten);
    System.out.println("Tên nhà sản xuất: "+this.nxs);
    System.out.println("Giá bán: "+this.gia);
}
 public void sx(Product[] a,int n)
 {
     for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
                {
                    if(a[i].gia<a[j].gia)
                        {
                            Product tem= a[i];
                            a[i]=a[j];
                            a[j]=tem;
                        }
                }
        }
 }
    

}
