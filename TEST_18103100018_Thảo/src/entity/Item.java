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
public class Item {

    private int id;
    private String maHH;
    private String tenHH;
    private String quiCach;
    private String donViTinh;
    private String donGia;

    public Item(int id, String maHH, String tenHH, String quiCach, String donViTinh, String donGia) {
        this.id = id;
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.quiCach = quiCach;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public Item() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public String getQuiCach() {
        return quiCach;
    }

    public void setQuiCach(String quiCach) {
        this.quiCach = quiCach;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
    
    

}
