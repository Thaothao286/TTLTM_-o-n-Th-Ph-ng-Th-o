/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai6;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class GiangVienThinhGiang extends GiangVien{
    private String coQuanLamViec;

    @Override
    public GiangVien inputq() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nơi làm việc");
        this.coQuanLamViec = sc.nextLine();
        return this;
    }

    @Override
    public void displayq() {
        super.display();
        System.out.println("Cơ quan làm việc: "+this.coQuanLamViec);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tinhluong() {
        float luong;
        luong=this.getSoGioGiang()*200000;
        this.setTongLuong(luong); //To change body of generated methods, choose Tools | Templates.
    }
}
