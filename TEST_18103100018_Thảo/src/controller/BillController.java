/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import entity.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dao Van Do
 */
public class BillController {

    Connection conn;

    public static void createBill(Bill bill) {
        try (Connection connect = DBConnect.getConnection()) {
            String sql = "insert into hoadon (hdso,ngay, makh,trigia, status)\n"
                    + "values (?,?,?,?,?)";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, bill.getHdSo());
            ps.setString(2, bill.getNgay());
            ps.setString(3, bill.getMaKH());
            ps.setString(4, bill.getTriGia());
            ps.setInt(5, 0);
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Bill> getListBill() {
        List<Bill> bills = new ArrayList<>();
        try (Connection connect = DBConnect.getConnection()) {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from hoadon where status = 0 ");
            while (rs.next()) {
                bills.add(new Bill(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
        }
        return bills;
    }

    public static void updateBill(int id) {
        try (Connection connect = DBConnect.getConnection()) {
            String sql = "UPDATE hoadon\n"
                    + "SET status = 1\n"
                    + "WHERE id = ?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
