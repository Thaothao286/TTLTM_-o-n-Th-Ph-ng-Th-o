/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Bai1 {
                        //nhập số nguyên,thực,long,double,char,string
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        float b;
        double d;
        long l;
        char ch;
        String str;
        
        //nhap du lieu
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        a=nhap.nextInt();
        System.out.println("Nhap 1 so thuc:");
        b=nhap.nextFloat();
        System.out.println("Nhap 1 so double:");
        d=nhap.nextDouble();
        System.out.println("Nhap 1 so long:");
        l=nhap.nextLong();
        System.out.println("Nhap 1 ky tu:");
        nhap.nextLine();
        ch= nhap.nextLine().charAt(0);
        System.out.println("Nhap 1 chuoi:");
        str=nhap.nextLine();
        
        //xuat du lieu
        System.out.println("Du lieu vua nhap la:");
        System.out.println("So nguyen: "+a);
        System.out.println("So thuc: "+b);
        System.out.println("So double: "+d);
        System.out.println("So long: "+l);
        System.out.println("1 ky tu: "+ch);
        System.out.println("! chuoi: "+str);
        
    }
    
}
