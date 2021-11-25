/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai2.Uneti;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class StudentUneti implements Imark{
    private String StuId;
    private String StuName;
    private String gender;
    private String birthday;
    private String nativePlace;

    public StudentUneti(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public StudentUneti() {
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    
    
    

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID student:");
        this.StuId = sc.nextLine();
        System.out.println("Nhập tên student:");
        this.StuName = sc.nextLine();
        System.out.println("Nhập giới tính:");
        this.gender = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        this.birthday = sc.nextLine();
        System.out.println("Nhập nơi ở:");
        this.nativePlace = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("ID student: "+this.StuId);
        System.out.println("Tên: "+this.StuName);
        System.out.println("Giới tính: "+this.gender);
        System.out.println("Ngày sinh: "+this.birthday);
        System.out.println("Nơi ở: "+this.nativePlace);
    }
}
