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
public class QuanLiSinhVien {
    static SinhVienIT[] ITArr;
    static SinhVienBiz[] BIZArr;
    static SinhVienPoly[] PolyArr;
    
    static SinhVienBiz sinhVienBiz = new SinhVienBiz();
    static SinhVienIT sinhVienIT = new SinhVienIT();
    
    
    public static void menu(){
        System.out.println("1: Nhập danh sách sinh viên");
        System.out.println("2: Xuất thông tin sinh viên");
        System.out.println("3: Xuất danh sách sinh viên giỏi");
        System.out.println("4: Sắp xếp danh sach sinh viên theo điểm");
        System.out.println("5: Thoát");
    }
    
    public static void main(String[] args) {
        int se = 0;
        Scanner sc = new Scanner(System.in);
        do {  
            menu();
            se = sc.nextInt();
            switch(se){
                case 1:
                    System.out.println("Nhập số lượng sinh viên");
                    int n = sc.nextInt();
                    PolyArr = new SinhVienPoly[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("1: Nhập SVIT \n2: Nhập SVBIZ");
                        int nhap = sc.nextInt();
                        if(nhap == 1){
                            PolyArr[i] = new SinhVienIT();
                        }else if(nhap == 2){
                            PolyArr[i] = new SinhVienBiz();
                        }
                        PolyArr[i].input();
                    }
                break;
                case 2:
                    System.out.println("Xuất thông tin danh sách");
                    for (int i = 0; i < PolyArr.length; i++) {
                        PolyArr[i].xuat();
                    }
                    System.out.println("------------------------");
                break;
                case 3:
                    System.out.println("Xuất thông tin sinh viên giỏi");
                    for (int i = 0; i < PolyArr.length; i++) {
                        if(PolyArr[i].getHocLuc().equals("Giỏi")){
                            PolyArr[i].xuat();
                        }
                    }
                break;
                case 4:
                    for (int i = 0; i < PolyArr.length; i++) {
                        for (int j = i+1; j < PolyArr.length; j++) {
                            if(PolyArr[i].getDiem() < PolyArr[j].getDiem()){
                                SinhVienPoly temp = PolyArr[i];
                                PolyArr[i] = PolyArr[j];
                                PolyArr[j] = temp; 
                            }
                        }
                    }
                    System.out.println("Danh sách sắp xếp theo điểm");
                    for (int i = 0; i < PolyArr.length; i++) {
                        PolyArr[i].xuat();
                    }
                break;
                case 5:
                break;
                default :
                    System.out.println("Không có lựa chọn");
                break;
            }
        } while (se !=5);
    }
}
