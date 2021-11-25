/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import entity.Customer;
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
public class CustomerController {

    Connection conn;

    public static List<Customer> getListCustomer() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connect = DBConnect.getConnection()) {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Khachhang");
            while (rs.next()) {
                customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
        }
        return customers;
    }

    public static Customer getCustomerByMaKH(String maKH) {
        Customer customer = new Customer();
        try (Connection connect = DBConnect.getConnection()) {
            String sql = "select * from Khachhang where makh = ? ";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, maKH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
        }
        return customer;
    }
}
