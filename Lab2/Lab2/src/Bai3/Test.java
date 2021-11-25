/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Thang
 */
public class Test {
     static void menu()
    {
        System.out.println("1.Nhập thông tin\n2.Hiển thị thông tin\n3.Sắp xếp giảm dần theo năm sản xuất\n4.Tìm kiếm theo tên\n5.Tìm kiếm theo tên tác giả\n6.Thoát\n------------------");
    }
    public static void main(String[] args)
    {   
    
    Scanner sc= new Scanner(System.in);  
    ArrayList<UnetiBook> a= new ArrayList<UnetiBook>();
    int x;
    do
    {
        menu();
        System.out.println("Nhập lựa chọn: ");
        x=sc.nextInt();
        switch(x)
        {  case 1:
            {   
                System.out.println("Nhập số sản phẩm ");
                   int n=sc.nextInt();

                    for (int i=0;i<n;i++) 
                      {
                        System.out.println("----Nhập thông tin sách----");
                        UnetiBook t =new UnetiBook();
                        try
                        {
                        t.input();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Sai kiểu dữ liệu");
                            t.input();
                        }
                        a.add(t);
                      }
                break;
            }
            case 2:
            {   
                 System.out.println("Danh sách sản phẩm vừa nhập: ");
                    for (UnetiBook b : a) 
                    {   
                        b.output();
                        System.out.println("----------");
                    }
                   
                break;
            }
            case 3:
            {   
                                   Collections.sort(a,new Comparator<UnetiBook>() 
                            { 
                                  @Override
                                public int compare(UnetiBook b1,UnetiBook b2)
                                {
                                    if(b1.getNam()<b2.getNam())
                                    {
                                        return 1; //trả về dương là số to đứng trc r đến bé 
                                    }
                                    else 
                                        if(b1.getNam()==b2.getNam())
                                        {
                                            return 0; //không thay đổi
                                        }
                                          else 
                                           {
                                               return -1; //trả về âm thì là số bé đứng trc r đến lớn 
                                           }
                                }
                            });
                                    System.out.println("Danh sách sau khi sắp xếp giảm dần theo năm sản xuất");
                              for (UnetiBook t : a) 
                              {
                                  t.output();
                                  System.out.println("--------------");
                              }
                break;
            }
            case 4:
            {   
                sc.nextLine();
                System.out.println("Nhập tên sách cần tìm kiếm: ");
                String c=sc.nextLine();
                int dem=0;
                for(int i=0;i<a.size();i++)
                {
                    if(a.get(i).getTen().equals(c))
                    {  
                        System.out.println("-------------------");
                        a.get(i).output();
                        dem++;
                    }
                    
                }
                if(dem==0)
                {
                    System.out.println("Không tìm thấy: ");
                    System.out.println("-----------------------");
                }
                break;
            }
            case 5:
            {
                 sc.nextLine();
                System.out.println("Nhập tên tác giả cần tìm kiếm: ");
                String c=sc.nextLine();
                int dem=0;
                for(int i=0;i<a.size();i++)
                {
                    if(a.get(i).getTg().equals(c))
                    {  
                        System.out.println("-------------------");
                        a.get(i).output();
                        dem++;
                    }
                    
                }
                if(dem==0)
                {
                    System.out.println("Không tìm thấy: ");
                    System.out.println("-----------------------");
                }
                break;
            }
        }
    }while(x!=6);
    
    }
}
