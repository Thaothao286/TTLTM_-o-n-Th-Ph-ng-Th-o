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
public class Boss extends Employee{
    private float luong;

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
    @Override
    public float earnings() {
        return luong = 4500;
    }

    @Override
    public void hienthi() {
        System.out.println("Lương" +luong);
    }
    
}
