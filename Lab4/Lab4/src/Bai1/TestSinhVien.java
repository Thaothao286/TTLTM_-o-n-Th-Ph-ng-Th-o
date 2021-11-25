/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Thang
 */
public class TestSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        // TODO code application logic here
        int n,x;
        ArrayList<SinhVien> sv=new ArrayList<SinhVien>();
        do
        {   
            System.out.println("1.Lập danh sách\n2.Add sinh viên\n3.Hiển thị danh sách\n4.Xóa sinh viên\n5.Sửa sinh viên\n6.Xuất ra danh sách sinh viên ở 1 lớp bất kỳ\n7.Thoát");
            System.out.println("Nhập lửa chọn: ");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {   System.out.println("Nhập số sinh viên: ");
                    n=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {   
                        System.out.println("Mời nhập thông tin: ");
                        SinhVien b= new SinhVien();
                        b.nhap();
                        sv.add(b);
                    }
                break;
                }
                case 2:
                {
                    SinhVien a= new SinhVien();  
                      a.nhap();
                      sv.add(a);
                    
                    break;
                }
                case 3:
                {   
                    System.out.println("----------Hiển thị---------- ");
                    for(SinhVien a : sv)
                    {
                        
                        a.xuat();
                        System.out.println("----------------------");
                    }
                    break;
                }
                case 4:
                {   
                    int y;
                   do
                   {
                       System.out.println("Nhập vị trí cần xóa: ");
                        y=sc.nextInt();
                   }
                   while(y>sv.size()-1);  
                    sv.remove(y);
                    break;
                    
                }
                case 5:
                {   
                       int y;
                   do
                   {
                       System.out.println("Nhập vị trí cần sửa: ");
                        y=sc.nextInt();
                   }
                   while(y>sv.size()-1); 
                    System.out.println("Mã sinh viên: ");
                    sc.nextLine();
                    String ma=sc.nextLine();
                    System.out.println("Tên sinh viên: ");
                    String ten=sc.nextLine();
                    System.out.println("Năm sinh: ");
                    int ns=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Địa chỉ: ");
                    String dc=sc.nextLine();
                    System.out.println("Lớp: ");
                    String lop=sc.nextLine();
                    
                    sv.get(y).setMa(ma);
                    sv.get(y).setTen(ten);
                    sv.get(y).setNs(ns);
                    sv.get(y).setDc(dc);
                    sv.get(y).setLop(lop);
                    break;
                }
                case 6:
                {       String c;
                    sc.nextLine();
                    System.out.println("Nhập 1 lớp bất kỳ");
                    c=sc.nextLine();
                    for (SinhVien s : sv) 
                    {
                        if(s.getLop().equalsIgnoreCase(c))
                        {   
                            s.xuat();
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                }
            }
        }
        while(x!=7);
    }
    
}
