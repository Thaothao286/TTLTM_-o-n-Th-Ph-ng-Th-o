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
public abstract class GiangVien {
    private String tenGiangVien;
    private String email;
    private String diachi;
    private String dienThoai;
    private float tongLuong;
    private int soGioGiang;
    
    public abstract GiangVien inputq();
    public abstract void displayq();
    public abstract void tinhluong();
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên giảng viên");
        this.tenGiangVien = sc.nextLine();
        System.out.println("Nhập Email");
        this.email = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        this.diachi = sc.nextLine();
        System.out.println("Nhập điện thoại");
        this.dienThoai = sc.nextLine();
        System.out.println("Nhập số giờ giảng");
        this.soGioGiang = sc.nextInt();
    }
    
    public void display(){
        System.out.println("Tên gv: "+this.tenGiangVien);
        System.out.println("Email gv: "+this.email);
        System.out.println("Địa chỉ gv: "+this.diachi);
        System.out.println("Điện thoại gv: "+this.dienThoai);
        System.out.println("Số giờ giảng: "+this.soGioGiang);
        tinhluong();
        System.out.println("Tổng lương: "+this.getTongLuong());
    }

    public GiangVien(String tenGiangVien, String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diachi = diachi;
        this.dienThoai = dienThoai;
        this.tongLuong = tongLuong;
        this.soGioGiang = soGioGiang;
    }

    public GiangVien() {
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }
    
    

}
