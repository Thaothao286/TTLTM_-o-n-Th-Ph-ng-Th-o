/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai1;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class XeMay implements  IXE{
    String bienSo;
    String loaiXe;
    String mauXe;
    float giaTien;

    public XeMay(String bienSo, String loaiXe, String mauXe, float giaTien) {
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.mauXe = mauXe;
        this.giaTien = giaTien;
    }

    public XeMay() {
    }


    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
    
    
    

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe");
        this.bienSo = sc.nextLine();
        System.out.println("Nhập loại xe");
        this.loaiXe = sc.nextLine();
        System.out.println("Nhập màu xe");
        this.mauXe = sc.nextLine();
        System.out.println("Nhập giá xe");
        this.giaTien = sc.nextFloat();
    }

    @Override
    public void hienthi() {
        System.out.println("Biển số: "+this.bienSo);
        System.out.println("Loại xe: "+this.loaiXe);
        System.out.println("Màu xe: "+this.mauXe);
        System.out.println("Giá xe: "+this.giaTien);
    }
    
}
