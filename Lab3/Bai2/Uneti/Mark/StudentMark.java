 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai2.Uneti.Mark;

import Lab3.Bai2.Uneti.Imark;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class StudentMark implements Imark{
    private String StuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public StudentMark() {
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID student:");
        this.StuId = sc.nextLine();
        System.out.println("Nhập tên lớp:");
        this.className = sc.nextLine();
        System.out.println("Nhập môn học:");
        this.subjectName = sc.nextLine();
        System.out.println("Nhập học kỳ:");
        this.semester = sc.nextInt();
        System.out.println("Nhập điểm:");
        this.mark = sc.nextFloat();
    }

    @Override
    public void display() {
//        System.out.println("ID: "+this.StuId);
        System.out.println("Tên lớp: "+this.className);
        System.out.println("Môn học: "+this.subjectName);
        System.out.println("Học kỳ: "+this.semester);
        System.out.println("Điểm: "+this.mark);
    }
}
