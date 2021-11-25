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
public class SinhVienIT extends SinhVienPoly{

    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public SinhVienIT() {
    }
    
    

    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }    

    @Override
    public double getDiem() {
       return (2*diemJava+diemHtml+diemCss)/4; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm java:");
        this.diemJava = sc.nextDouble();
        System.out.println("Nhập điểm html:");
        this.diemHtml = sc.nextDouble();
        System.out.println("Nhập điểm css:");
        this.diemCss = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Điểm java: "+this.diemJava);
        System.out.println("Điểm html: "+this.diemHtml);
        System.out.println("Điểm css: "+this.diemCss);
        System.out.println("Điểm tb: "+getDiem());
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
