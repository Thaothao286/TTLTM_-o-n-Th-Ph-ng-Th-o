/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.Bai3;

/**
 *
 * @author KyThuat88
 */
public class CommisionWorker extends Employee{

    float luong;
    @Override
    public float earnings() {
        return luong=new Boss().earnings()+new PieceWorker().earnings();
    }
    @Override
    public void hienthi() {
        System.out.println("luong :"+luong);
    }
}
