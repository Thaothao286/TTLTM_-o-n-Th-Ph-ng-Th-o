/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Thang
 */
public class UnetiBook extends Book
{   private String nn; //Hai thuộc tính riêng của lớp UnetiBook
    private int hk;
    
    Scanner sc= new Scanner(System.in);
    
    public UnetiBook() {
    }

    public UnetiBook(String nn, int hk) {
        this.nn = nn;
        this.hk = hk;
    }

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public int getHk() {
        return hk;
    }

    public void setHk(int hk) {
        this.hk = hk;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Ngôn ngữ: ");
        this.nn=sc.nextLine();
        System.out.println("Học kỳ: ");
        this.hk=sc.nextInt();
    }

    @Override
    public void output() {
        super.output(); 
        System.out.println("Ngôn ngữ: "+this.nn);
        System.out.println("Học kỳ: "+this.hk);
    }
    
    
    
}
