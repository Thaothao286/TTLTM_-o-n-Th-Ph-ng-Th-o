/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class TestProduct {
    static void menu()
    {
        System.out.println("1.Nhập thông tin\n2.Hiển thị\n3.Sản phẩm có giá cao nhất\n4.Sắp xếp giảm dần theo giá\n5.Sản phẩm có chứ 'sữa'\n6.Thoát");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        Product b= new Product();
        ArrayList<Product> t= new ArrayList<Product>();
       do{
       menu();
           System.out.println("Nhập lựa chọn: ");
           m=sc.nextInt();
           switch(m)
           {
               case 1:
               {    
                    System.out.println("Nhập số sản phẩm ");
                    n=sc.nextInt();

                    for (int i=0;i<n;i++) 
                      {
                        System.out.println("----Nhập thông tin hàng----");
                        Product p=new Product();
                        p.input();
                        t.add(p);
                      }
                   break;
               }
               case 2:
               {    
                    System.out.println("Danh sách sản phẩm vừa nhập: ");
                    for (Product a : t) 
                    {   
                        a.display();
                        System.out.println("----------");
                    }
                   break;
               }
               case 3:
               {    
                   float max=0;
                        for (Product a : t) {
                            if(max<a.getGia())
                            {
                            max=a.getGia();
                            }
                        }
                        System.out.println("Sản phẩm có giá bán cao nhất ");
                        for (Product a : t) 
                        {   
                            if(a.getGia()==max)
                            {
                            a.display();
                            }

                        }
                   break;
               }
               case 4:
               {
                                Collections.sort(t,new Comparator<Product>() 
                            { 
                                  @Override
                                public int compare(Product pr1,Product pr2)
                                {
                                    if(pr1.getGia()<pr2.getGia())
                                    {
                                        return 1; //trả về dương là số to đứng trc r đến bé 
                                    }
                                    else 
                                        if(pr1.getGia()==pr2.getGia())
                                        {
                                            return 0; //không thay đổi
                                        }
                                          else 
                                           {
                                               return -1; //trả về âm thì là số bé đứng trc r đến lớn 
                                           }
                                }
                            });
                              System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá");
                              for (Product a : t) 
                              {
                                  a.display();
                                  System.out.println("--------------");
                              }
                              break;
               }
               case 5:
               {    

                        System.out.println("Những sản phẩm có chữ 'sữa' ");
                        for (Product product : t) 
                        {
                          if(product.getTen().equals("sữa")||product.getTen().equals("Sữa")||product.getTen().equals("SỮA"));
                          {
                              product.display();
                              System.out.println("------------");
                          }
                        }

                   break;
               }
           }
       }while(m!=6);
       
       
        
      
          }
    
}
