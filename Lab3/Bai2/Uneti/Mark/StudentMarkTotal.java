/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai2.Uneti.Mark;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal() {
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
        
    public int getTotalExamSubject(StudentMarkTotal[] list){
        return list.length;
    }
    
    public void calculateEverageMark(StudentMarkTotal[] list){
        for (int i = 0; i < list.length; i++) {
            everageMark += list[i].getMark();
        }
    }
    
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        
        
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
