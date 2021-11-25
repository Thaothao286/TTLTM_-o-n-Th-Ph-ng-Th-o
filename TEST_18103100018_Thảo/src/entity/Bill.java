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
public class Bill {
    private int ID;
    private String hdSo;
    private String ngay;
    private String maKH;
    private String triGia;

    public Bill() {
    }

    public Bill(int ID, String hdSo, String ngay, String maKH, String triGia) {
        this.ID = ID;
        this.hdSo = hdSo;
        this.ngay = ngay;
        this.maKH = maKH;
        this.triGia = triGia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHdSo() {
        return hdSo;
    }

    public void setHdSo(String hdSo) {
        this.hdSo = hdSo;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTriGia() {
        return triGia;
    }

    public void setTriGia(String triGia) {
        this.triGia = triGia;
    }
    
    
    
}
