/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt2.Uneti.Mark;

import Lab03_bt2.Uneti.StudentUneti;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Manager {
    static StudentUneti uneti = new StudentUneti();
    static StudentMark mark = new StudentMark();
    static StudentUneti[] unetiArr;
    static StudentMark[] markArr;
    
    public static void main(String[] args) {
        int n = 0;
        
        Scanner sc = new Scanner(System.in);
        do {        
            menu();    
            System.out.println("Nhập lựa chọn của bạn:");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Nhập số lượng sinh viên:");
                    int m = sc.nextInt();
                    unetiArr = new StudentUneti[m];
                    for (int i = 0; i < unetiArr.length; i++) {
                        System.out.println("Nhập thông tin sinh viên uneti thứ: "+(i+1));
                        unetiArr[i] = new StudentUneti();
                        unetiArr[i].input();
                    }
                break;
                case 2:
                    if(unetiArr != null){
                        boolean ck = true;
                        System.out.println("Nhập số lượng điểm muốn nhập");
                        int q = sc.nextInt();
                        markArr = new StudentMark[q];
                        //test
                        boolean nhap = true;
                        do {                        
                            System.out.println("Nhập id student muốn nhập điểm");
                            String idString;
                            sc.nextLine();
                            idString = sc.nextLine();
                            for (int i = 0; i < unetiArr.length; i++) {
                                if(unetiArr[i].getStuId().equals(idString)){
                                    ck = true;
                                    System.out.println("Check đsung");
                                    nhap = false;
                                }else{
                                    System.out.println("Không tồn tại id student muốn nhập");
                                    ck = false;
                                    nhap = true;
                                }
                                if(ck == true){ 
                                    for (int j = 0; j < markArr.length; j++) {
                                        markArr[j] = new StudentMark();
                                        markArr[j].input();
                                        ck =true;
                                        nhap = true;
                                    }

                                }
                            }
                        } while (nhap != true);
                    }else{
                        System.out.println("Bạn phải nhập trước");
                    }
                    
                    
                    
                    //test2
//                    System.out.println("Nhập id student:");
//                    String idfind;
//                    sc.nextLine();
//                    idfind = sc.nextLine();
//                    boolean ck = false;
//                    do {                        
//                        for (int i = 0; i < unetiArr.length; i++) {
//                        if(unetiArr[i].getStuId().equals(idfind)){
//                            System.out.println("Tồn tại id");
//                            ck = true;
//                            for (int j = 0; j < markArr.length; j++) {
//                                    markArr[j] = new StudentMark();
//                                    markArr[j].input();
//                                }
//                        }else{
//                            System.out.println("Kkhông tồn tại id");
//                            ck = false;
//                        }
//                    }
//                    } while (ck);
//                    
                     
                        
                        
                 
                    
                    //endtest
//                    for (int i = 0; i < markArr.length; i++) {
//                        markArr[i]=new StudentMark();
//                        boolean ck = false;
//                        do {                            
//                            markArr[i].input();
//                            for (int j = 0; j < unetiArr.length; j++) {
//                                System.out.println(unetiArr[j].getStuId());
//                                System.out.println("----------------------");
//                                System.out.println(markArr[i].getStuId());
//                                if(unetiArr[j].getStuId().equals(markArr[i].getStuId())){
//                                    ck = true;
//                                    System.out.println("Đã thêm");
//                                }else{
//                                    System.out.println("Chưa thêm ");
//                                    System.out.println("------------");
//                                    unetiArr[j].getStuId();
//                                    markArr[i].getStuId();
//                                    ck = false;
//                                }
//                                
//                            }
//                        } while (ck != true);
//                            
//                       
//                    }
                break;
                case 3:
                    if(unetiArr != null){
                        for (int i = 0; i < unetiArr.length- 1; i++) {
                            for (int j = i + 1; j <unetiArr.length; j++) {
                                if(unetiArr[i].getStuName().compareTo(unetiArr[j].getStuName())>0){
                                    StudentUneti tg=unetiArr[i];
                                    unetiArr[i]= unetiArr[j];
                                    unetiArr[j]=tg;
                                }
                            }
                        }
                        for (int i = 0; i < unetiArr.length; i++) {
                            System.out.println("thong tin sinh vien thu "+(i+1));
                            unetiArr[i].display();
                        }
                    }else{
                        System.out.println("Bạn phải nhập trước");
                    }
                    
                break;
                case 4:
                    if(unetiArr != null){
                        String id;
                        System.out.println("Nhap vao id ban muon tim:");
                        sc.nextLine();
                        id = sc.nextLine();
                        System.out.println(id);
                        System.out.println("Thong tin sinh vien ");
                            for (int i = 0; i < unetiArr.length; i++) {
                                if(id.equals(unetiArr[i].getStuId())){
                                    unetiArr[i].display();
                                }
                            }
                            for (int i = 0; i < markArr.length; i++) {
                                if(id.equals(markArr[i].getStuId())){
                                    markArr[i].display();
                                }
                            } 
                    }else{
                        System.out.println("Bạn phải nhập trước");
                    }
                    
                break;
                case 5:
                break;
                default :
                    System.out.println("Không có lựa chọn");
                break;    
            }
        } while (n != 5);
    }
    
    
    public static void menu(){
        System.out.println("1: Nhập thông tin n sinh viên UNETI");
        System.out.println("2: Nhập m điểm thi cho các sinh viên này");
        System.out.println("3: Sắp xếp sinh viên theo tên và hiển thị");
        System.out.println("4: Tìm thông tin sinh viên theo id");
        System.out.println("5: Thoát");
    }
}
