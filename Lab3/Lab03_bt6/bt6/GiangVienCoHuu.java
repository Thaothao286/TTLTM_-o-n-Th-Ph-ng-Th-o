/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03.bt6;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class GiangVienCoHuu extends GiangVien{
    private float luongThoaThuan;
    private int soGioQuyDinh;
    
    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh, String tenGiangVien, String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        super(tenGiangVien, email, diachi, dienThoai, tongLuong, soGioGiang);
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public float getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(float luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }

    public void setSoGioQuyDinh(int soGioQuyDinh) {
        this.soGioQuyDinh = soGioQuyDinh;
    }

    
    @Override
    public GiangVien inputq() {
       super.input();//To change body of generated methods, choose Tools | Templates.
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập lương thỏa thuận");
       this.luongThoaThuan = sc.nextFloat();
       this.soGioQuyDinh = 40;
        do {            
            System.out.println("Nhập số giờ quy định");
            this.soGioQuyDinh = sc.nextInt();
        } while (this.soGioQuyDinh <=40);
       return this;
    }

    @Override
    public void displayq() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Lương thỏa thuận: "+this.luongThoaThuan);
        System.out.println("Số giờ quy định:"+this.soGioQuyDinh);
        
    }

    @Override
    public void tinhluong() {
         //To change body of generated methods, choose Tools | Templates.
        float luong;
        luong=luongThoaThuan+(this.getSoGioGiang()-40)*200000;
        this.setTongLuong(luong);
    }
    
}
