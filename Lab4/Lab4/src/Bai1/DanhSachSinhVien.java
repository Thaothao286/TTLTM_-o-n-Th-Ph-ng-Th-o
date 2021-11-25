/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class DanhSachSinhVien {
    ArrayList<SinhVien> a = new ArrayList<SinhVien>();
    Scanner sc=new Scanner(System.in);
   
    public boolean ktraMa(String ma) // hàm kiểm tra mã sinh viên để ktra xem có bị trùng mã sinh viên khi thêm,sửa k 
    {
        for(SinhVien sv : a)
        {
            if(sv.getMa().equalsIgnoreCase(ma))
                return true;
        }
    return false;
    }
    /* public void xoa(ArrayList<SinhVien> b ,int n)
     {
         for(int i=0;i<b.size();i++)
         {                                                  //hỏng
             if(i==n)
             {
                 b.remove(i);
                 break;
             }
         }
     }*/
    
}
