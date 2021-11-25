/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai4;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    public abstract double getDiem();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }
    
    public String getHocLuc(){
        String a = "";
        if(getDiem()<5){
            a =  "Yếu";
        }else if(5<= getDiem() && getDiem()<=7){
            a =  "Trung bình";
        }else if(7<getDiem() && getDiem()<8){
            a =  "Khá";
        }else if(8 <= getDiem()){
            a =  "Giỏi";
        }
        return a;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên:");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập ngành:");
        this.nganh = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Ngành: "+nganh);
    }
    
}
