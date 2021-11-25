/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt1.HoaBinh.XeMay;

import Lab03_bt1.XeMay;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class XeMayHoaBinh extends XeMay{
    private int soLuongXe;
    XeMay[] arr;

    public XeMayHoaBinh(int soLuongXe, XeMay[] arr, String bienSo, String loaiXe, String mauXe, float giaTien) {
        super(bienSo, loaiXe, mauXe, giaTien);
        this.soLuongXe = soLuongXe;
        this.arr = arr;
    }

    public XeMayHoaBinh() {
    }

    public int getSoLuongXe() {
        return soLuongXe;
    }

    public void setSoLuongXe(int soLuongXe) {
        this.soLuongXe = soLuongXe;
    }

    public XeMay[] getArr() {
        return arr;
    }

    public void setArr(XeMay[] arr) {
        this.arr = arr;
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so luong xe may o hoa binh");
        soLuongXe=Integer.parseInt(sc.nextLine());
        arr = new XeMay[soLuongXe];
        for(int i=0;i<soLuongXe;i++) {
            System.out.println("Nhap thong tin xe may thu :"+(i+1));
            arr[i]=new XeMay();
            arr[i].nhap();
        }
    }

    @Override
    public void hienthi() {
//        super.hienthi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số lượng xe: "+this.soLuongXe);
        System.out.println("Danh sách xe Hòa Bình: ");
        for (int i = 0; i < this.soLuongXe; i++) {
            arr[i].hienthi();
        }
    }
    
    
    
    public static void main(String[] args) {
        XeMayHoaBinh xeMayHoaBinh = new XeMayHoaBinh();
        xeMayHoaBinh.nhap();
        xeMayHoaBinh.hienthi();
    }
    
    
   
    
    
}
