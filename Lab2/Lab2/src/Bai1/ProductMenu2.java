/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class ProductMenu2 {
    
    static void menu()
    {
        System.out.println("1.Nhập thông tin cho n sản phầm \n2.Hiển thị thông tin vừa nhập \n3.Sắp xếp thông tin giảm dần theo giá và hiển thị \n4.Thoát");
    }
    public static void main(String[] args) {
            Scanner nhap= new Scanner(System.in);
            ArrayList<Product> a= new ArrayList<Product>();
            int n,m;
            
            do
            {
                menu();
                System.out.println("Nhập lựa chọn ");
                m=nhap.nextInt();
                switch(m)
                {
                    case 1:
                    {
                        System.out.println("Nhập số sản phẩm ");
                        n=nhap.nextInt();
                        for(int i=0;i<n;i++)
                        {
                            System.out.println("-----Nhập thông tin sản phẩm-----");
                            Product b=new Product();
                            b.input();
                            a.add(b);
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Danh sách vừa nhập là");
                        for (Product product : a) 
                        {   
                            product.output();
                            System.out.println("--------------");
                        }
                        break;
                    }
                    case 3:
                    {
                         Collections.sort(a,new Comparator<Product>() 
      { 
            @Override
          public int compare(Product pr1,Product pr2)
          {
              if(pr1.getGia()<pr2.getGia())
              {
                  return 1;
              }
              else 
                  if(pr1.getGia()==pr2.getGia())
                  {
                      return 0;
                  }
                    else 
                     {
                         return -1;
                     }
          }
                    });
                         System.out.println("Sắp xếp theo chiều giá giảm dần ");
                         for (Product product : a) 
                         {
                          product.output();
                             System.out.println("--------------");
                        }
 
                         break;
                    }
                    case 4:
                    {
                        break;
                    }
                }
            }
            while(m!=4);
    }
    
}
