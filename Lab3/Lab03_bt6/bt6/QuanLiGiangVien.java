/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03.bt6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class QuanLiGiangVien {
    
    public static void main(String[] args) {
        int n = 0;
        ArrayList<GiangVien> giangvienList = new ArrayList<GiangVien>();
        do {
            menu();
            Scanner sc = new Scanner(System.in);             
            System.out.println("Nhập lựa chọn");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Nhập thông tin gv cơ hưu");
                    GiangVienCoHuu gvch = new GiangVienCoHuu();
                    gvch.inputq();
                    giangvienList.add(gvch);
                break;
                case 2:
                    System.out.println("Nhập thông tin gv thinh giang");
                    GiangVienThinhGiang gvtg = new GiangVienThinhGiang();
                    gvtg.inputq();
                    giangvienList.add(gvtg);
                break;
                case 3:
                    System.out.println("Danh sách gv đã nhập");
                    for (GiangVien giangVien : giangvienList) {
                        giangVien.displayq();
                    }
                break;
                case 4:
                    System.out.println("Thông tin gv co huu");
                    for (GiangVien giangVien : giangvienList) {
                        if (giangVien instanceof GiangVienCoHuu) {
                            giangVien.displayq();
                        }else{
                            System.out.println("Không tồn tại gv co huu");
                        }
                    }
                break;
                case 5:
                    System.out.println("Thông tin gv thinh giang");
                    for (GiangVien giangVien : giangvienList) {
                        if (giangVien instanceof GiangVienThinhGiang) {
                            giangVien.displayq();
                        }else{
                            System.out.println("Không tồn tại gv thinh giang");
                        }
                    }
                break;
                case 6:
                    System.out.println("Tổng lương toàn bộ gv");
                    float tongLuong = 0;
                    for (int i = 0; i < giangvienList.size(); i++) {
                        giangvienList.get(i).tinhluong();
                        tongLuong += giangvienList.get(i).getTongLuong();
                    }
                    System.out.println(tongLuong);
                break;
                case 7:
                    System.out.println("Gv luong cao nhất");
                    GiangVien max = giangvienList.get(0);
                    for (int i = 0; i < giangvienList.size(); i++) {
                        if(giangvienList.get(i).getTongLuong()> max.getTongLuong()){
                            max = giangvienList.get(i);
                        }
                    }
                    max.displayq();
                break;
                case 8:
                break;
                default:
                    System.out.println("Không có lựa chọn này");
                break;
            }
        } while (n != 8);
    }
    
    public static void menu(){
        System.out.println("1 Nhap thong tin giang vien co huu");
        System.out.println("2 Nhap thong tin giang vien thinhg giang");
        System.out.println("3 Hien thi toan bo thong tin");
        System.out.println("4 Hien thi thong tin giang vien co huu");
        System.out.println("5 Hien thi thong tin GV thing giang");
        System.out.println("6 Tong luong cua toan bo giang vien");
        System.out.println("7 Luong cao nhat");
        System.out.println("8 thoat");
    }
}
