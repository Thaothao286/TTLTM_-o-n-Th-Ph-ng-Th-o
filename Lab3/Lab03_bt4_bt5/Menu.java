/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt4_bt5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laptop NamAnh
 */
class Menu{
    static int menu(){
    System.out.println("*******MENU*********");
    System.out.println("1.Nhap danh sach sinh vien");
    System.out.println("2.Hien thi thong tin sinh vien");
    System.out.println("3.Thong tin sinh vien gioi");
    System.out.println("4.Sap xep theo diem");
    System.out.println("5.Ket thuc");
    int chon;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("HAY CHON YEU CAU !");
        chon=sc.nextInt();
    }while(chon<1||chon>4);
       return chon;
}
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        ArrayList <SinhVienPoly> arr = new ArrayList<>();
        int n = 0;
        int chon;
        do{
            chon = menu();
            switch(chon){
                case 1:
                    System.out.print("Nhập vào số lượng sinh vien: ");
                     n = sc.nextInt();
                   for (int i = 0; i < n; i++){
                    System.out.println("Nhập thông tin cho sinh vien thứ : "+(i+1));
                    System.out.println("Bạn muốn nhập tt SV ngành nào: ");
                    System.out.println("1.IT");
                    System.out.println("2.Biz");
                    String tt=sb.nextLine();
                    if(tt.equals("1"))
                    {
                        SinhVienIT a= new  SinhVienIT();
                         a.Nhap();
                         arr.add(a);
                    }
                    if(tt.equals("2"))
                         {
                        SinhVienBiz a= new  SinhVienBiz();
                         a.Nhap();
                         arr.add(a);
                    }
                   }
                   break;
              
                case 2:for (int i = 0; i < n; i++){
                    if(arr.get(i).nganh.equals("IT"))
                    {
                      SinhVienIT a =  (SinhVienIT) arr.get(i);
                      a.xuat();}
                     if(arr.get(i).nganh.equals("Biz"))
                    {
                        SinhVienBiz a =  (SinhVienBiz) arr.get(i);
                      a.xuat();}
                }
                         break;
                case 3: 
                       for (int i = 0; i < n; i++){
                           if(arr.get(i).hocluc().equals("Gioi"))
                           {
                    if(arr.get(i).nganh.equals("IT"))
                    {
                      SinhVienIT a =  (SinhVienIT) arr.get(i);
                      a.xuat();}
                     if(arr.get(i).nganh.equals("Biz"))
                    {
                        SinhVienBiz a =  (SinhVienBiz) arr.get(i);
                      a.xuat();}
                }}
                         break;
                case 4:  for(int i=0;i< n-1;i++)
                         for(int j=i+1;j<n;j++)
                         {
                            if(arr.get(i).getdiem()<arr.get(j).getdiem())
                            {
                                SinhVienPoly tg=new SinhVienPoly() {
                                    @Override
                                    public double getdiem() {
                                    return 0;}
                                };
                                tg=arr.get(i);
                                arr.set(i, arr.get(j));
                                arr.set(j, tg);
                             
                            }
                         }
                System.out.println("Sap xep sinh vien giam dan theo diem");
                    for (int i = 0; i < n; i++){
                         if(arr.get(i).nganh.equals("IT"))
                    {
                      SinhVienIT a =  (SinhVienIT) arr.get(i);
                      a.xuat();}
                     if(arr.get(i).nganh.equals("Biz"))
                    {
                        SinhVienBiz a =  (SinhVienBiz) arr.get(i);
                      a.xuat();}
                  }
                    break;
                          
    }
        }while(chon!=4);
}  
}