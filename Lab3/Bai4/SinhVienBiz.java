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
public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    

    public SinhVienBiz() {

    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm marketing:");
        this.diemMarketing = sc.nextDouble();
        System.out.println("Nhập điểm sales:");
        this.diemSales = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Điểm marketing: "+this.diemMarketing);
        System.out.println("Điểm sales: "+this.diemSales);
        System.out.println("Điểm tb: "+getDiem());
    }
    
    @Override
    public double getDiem() {
      return (2*diemMarketing+diemSales)/3;
    }

    
    
    
}
