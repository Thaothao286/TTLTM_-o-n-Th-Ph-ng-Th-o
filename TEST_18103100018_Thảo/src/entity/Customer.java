/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Dao Van Do
 */
public class Customer {

    private int ID;
    private String maKH;
    private String tenKH;
    private String soDT;

    public Customer(int ID, String maKH, String tenKH, String soDT) {
        this.ID = ID;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDT = soDT;
    }

    public Customer() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

}
