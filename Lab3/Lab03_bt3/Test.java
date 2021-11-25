/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03_bt3;

/**
 *
 * @author KyThuat88
 */
public class Test {
    public static void main(String[] args) {
        Employee[] arr=new Employee[3];
        System.out.println("Nhap Thong tin boss");
        arr[0]=new Boss();
        arr[0].nhap();
        System.out.println("Nhap Thong tin PieceWorked ");
        arr[1]=new PieceWorker();
        arr[1].nhap();
        System.out.println("Nhap Thong tin CommisstionWorked ");
        arr[2]=new CommisionWorker();
        arr[2].nhap();
        System.out.println("Thong tin boss");
        arr[0].display();
        System.out.println("Thong tin PieceWorked");
        arr[1].display();
        System.out.println("Thong tin CommisstionWorked");
        arr[2].display();
    }
}
