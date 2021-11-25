/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Thang
 */
public class Main {
    static void menu()
    {
        System.out.println("1.Nhập danh sách\n2.Xuất danh sách\n3.Xuất danh sách ngẫu nhiên\n4.Sắp xếp giảm dần theo giá\n5.Xóa sản phẩm\n6.Thoát");
    }
    public static void main(String[] args) {
        ArrayList<SanPham> a= new ArrayList<SanPham>();
        int x;
        Scanner sc= new Scanner(System.in);
        do
        {   
            menu();
            System.out.println("Nhập lựa chọn: ");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {
                int n;
                    System.out.println("Nhập số sản phẩm ");
                    n=sc.nextInt();
                    for(int i =0;i<n;i++)
                    {   
                        System.out.println("--------Mời nhập thông tin--------");
                        SanPham sp = new SanPham();
                        sp.nhap();
                        a.add(sp);
                    }
                    break;
                }
                case 2:
                {   System.out.println("DANH SÁCH SẢN PHẨM");
                    for (SanPham sp : a) {
                        sp.xuat();
                        System.out.println("-----------------");
                        
                    }
                    break;
                }
                case 3:
                {   
                    Collections.shuffle(a);
                    System.out.println("DANH SÁCH SẢN PHẨM SAU KHI ĐÃ SẮP XẾP NGẪU NHIÊN");
                     for (SanPham sp : a) {
                        sp.xuat();
                        System.out.println("-----------------");
                        
                    }
                    break;
                }
                case 4:
                {   
               Collections.sort(a,new Comparator<SanPham>() 
      { 
            @Override
          public int compare(SanPham sp1,SanPham sp2)
          {
              if(sp1.getGia()>sp2.getGia())
              {
                  return -1; //trả về dương là số to đứng trc r đến bé 
              }
              else 
                  if(sp1.getGia()==sp2.getGia())
                  {
                      return 0; //không thay đổi
                  }
                    else 
                     {
                         return 1; //trả về âm thì là số bé đứng trc r đến lớn 
                     }
          }
       });
               
                System.out.println("DANH SÁCH SẢN PHẨM SAU KHI SẮP XẾP THEO CHIỀU GIÁ GIẢM DẦN");
                    for (SanPham sp : a) {
                        sp.xuat();
                        System.out.println("-----------------");
                        
                    }
                    break;
                }
            }
        }while(x!=6);
        
    }
    
}
