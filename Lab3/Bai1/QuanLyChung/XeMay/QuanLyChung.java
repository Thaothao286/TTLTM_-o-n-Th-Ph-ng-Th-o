/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai1.QuanLyChung.XeMay;

import Lab3.Bai1.HaNoi.XeMay.XeMayHaNoi;
import Lab3.Bai1.HoaBinh.XeMay.XeMayHoaBinh;
import Lab3.Bai1.XeMay;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class QuanLyChung {
    static XeMayHaNoi hnHaNoi = new XeMayHaNoi();
    static XeMayHoaBinh bhHoaBinh = new XeMayHoaBinh();
    static XeMay xm = new XeMay();
    static XeMay[] xeMay;
            
    
    public static void menu(){
        System.out.println("1: Nhập thông tin n xe máy Hòa Bình");
        System.out.println("2: Nhập thông tin n xe may Hà Nội");
        System.out.println("3: Sắp xếp tăng dần biển số");
        System.out.println("4: Tìm kiếm theo biển số");
        System.out.println("5: Thống kê số lượng đang quản lý");
        System.out.println("6: Thoát");
    }
    
    public static void main(String[] args) {
        int n = 0;
        do {
            menu();
            System.out.println("Nhập lựa chọn :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    bhHoaBinh.nhap();
                    System.out.println("ok"+bhHoaBinh.getArr().length);
                    break;
                }
                case 2: {
                    hnHaNoi.nhap();
                    break;
                }
                case 3: {
                    
//                    XeMay[] xe = new XeMay[bhHoaBinh.getArr().length+hnHaNoi.getArrHn().length];
//                XeMay[] c = (XeMay[]) Array.newInstance(bhHoaBinh.getArr().getClass().getComponentType(), bhHoaBinh.getArr().length+hnHaNoi.getArrHn().length);
//                System.arraycopy(bhHoaBinh.getArr(), 0, c, 0, bhHoaBinh.getArr().length);
//                System.arraycopy(hnHaNoi.getArrHn(), 0, c, bhHoaBinh.getArr().length, hnHaNoi.getArrHn().length);
//                System.out.println(c.length);
                    XeMay[] newXeMay =  Merge(hnHaNoi, bhHoaBinh);
                    System.out.println("Sắp xếp tăng dần theo biển số");
                    System.out.println("------------------------");
                    for (int i = 0; i < newXeMay.length; i++) {
                        for (int j = i+1; j < newXeMay.length; j++) {
                            if(newXeMay[i].getGiaTien() > newXeMay[j].getGiaTien()){
                                    XeMay d = newXeMay[i];
                                    newXeMay[i] = newXeMay[j];
                                    newXeMay[j] = d;
                            }
                        }
                    }
                    for (int i = 0; i < newXeMay.length; i++) {
                        newXeMay[i].hienthi();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập biển số xe: ");
                    String name = sc.nextLine();
                    XeMay[] newXeMay = Merge(hnHaNoi, bhHoaBinh);
                    System.out.println("Thông tin xe tìm theo biển số là: ");
                    System.out.println(name);
                    for (int i = 0; i < newXeMay.length; i++) {
                        if(newXeMay[i].getBienSo().equals(name)){
                            newXeMay[i].hienthi();
                        }
                    }
                    System.out.println("---------------------------------");
                    break;
                }
                case 5: {                
                    XeMay[] newXeMay =  Merge(hnHaNoi, bhHoaBinh);
                    System.out.println("Số lượng xe máy: "+newXeMay.length+" xe");
                    break;
                }
                case 6:
                    break;
                default:{
                    
                    break;
                }
            }
        } while (n != 6);
    }
    
    public static XeMay[] Merge(XeMayHaNoi hn, XeMayHoaBinh hb){
        XeMay[] c = (XeMay[]) Array.newInstance(hb.getArr().getClass().getComponentType(), hb.getArr().length+hn.getArrHn().length);
        System.arraycopy(hb.getArr(), 0, c, 0, hb.getArr().length);
        System.arraycopy(hn.getArrHn(), 0, c, hb.getArr().length, hn.getArrHn().length);
        return c;
    }
    
//    public static XeMay SearchByName(XeMay[] xemay,String name){
//        XeMay c = xeMay[0];
//        for (int i = 0; i < xeMay.length; i++) {
//            if(xeMay[i].getBienSo().equalsIgnoreCase(name)){
//                c = xeMay[i];
//            }
//        }
//        return c;
//    }
}
