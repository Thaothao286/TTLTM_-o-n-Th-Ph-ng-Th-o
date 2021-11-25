/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Thang
 */
public class ProductMenu {

    /**
     * @param args the command line arguments
     */
    static void menu()
    {
        System.out.println("1.Nhập thông tin cho n sản phầm \n2.Hiển thị thông tin vừa nhập \n3.Sắp xếp thông tin giảm dần theo giá và hiển thị \n4.Thoát");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 0,m;
        Product[] a=new Product[50];
        Product b=new Product();
        
        do
        {
            menu();
            System.out.println("Nhập lựa chọn ");
            m=sc.nextInt();
            switch(m)
            {
                case 1:
                {
                    System.out.println("Nhập số sản phầm ");
                    n=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {   
                        a[i]=new Product();
                        System.out.println("Nhập thông tin sản phẩm ");
                       try
                       {
                        a[i].input();
                       }
                       catch(Exception e)
                       {  
                           System.out.println("Nhập sai kiểu dữ liệu yêu cầu nhập lại ");
                           a[i].input();
                       }
                        System.out.println("---------------");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Thông tin các sản phẩm vừa nhập là ");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println("-----------------");    
                    a[i].output();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Sắp xếp theo giá gairm dần là ");
                    b.sx(a,n);
                      for(int i=0;i<n;i++)
                    {
                    System.out.println("-----------------");    
                    a[i].output();
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
