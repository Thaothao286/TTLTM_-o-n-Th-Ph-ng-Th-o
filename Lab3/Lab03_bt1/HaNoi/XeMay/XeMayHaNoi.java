/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt1.HaNoi.XeMay;

import Lab03_bt1.XeMay;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class XeMayHaNoi extends XeMay{
    private int soLuongXe;
    XeMay[] arrHn;

    public XeMayHaNoi(int soLuongXe, XeMay[] arrHn, String bienSo, String loaiXe, String mauXe, float giaTien) {
        super(bienSo, loaiXe, mauXe, giaTien);
        this.soLuongXe = soLuongXe;
        this.arrHn = arrHn;
    }

    public XeMayHaNoi() {
    }

    public int getSoLuongXe() {
        return soLuongXe;
    }

    public void setSoLuongXe(int soLuongXe) {
        this.soLuongXe = soLuongXe;
    }

    public XeMay[] getArrHn() {
        return arrHn;
    }

    public void setArrHn(XeMay[] arrHn) {
        this.arrHn = arrHn;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng xe:");
        this.soLuongXe = sc.nextInt();
        arrHn = new XeMay[soLuongXe];
        for(int i=0;i<arrHn.length;i++) {
            System.out.println("Nhap thong tin xe may thu :"+(i+1));
            arrHn[i]=new XeMay();
            arrHn[i].nhap();
        }
        }

    @Override
    public void hienthi() {
        super.hienthi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số luongj xe: "+this.soLuongXe);
        System.out.println("Danh sach xe Hà Nội:");
        for (int i = 0; i < this.soLuongXe; i++) {
            arrHn[i].hienthi();
        }
    }
    
    
}
