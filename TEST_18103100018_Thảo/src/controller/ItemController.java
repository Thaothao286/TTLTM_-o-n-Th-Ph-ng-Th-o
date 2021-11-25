/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import entity.Customer;
import entity.Item;
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
public class ItemController {

    Connection conn;

    public static List<Item> getListItem() {
        List<Item> items = new ArrayList<>();
        try (Connection connect = DBConnect.getConnection()) {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Hanghoa");
            while (rs.next()) {
                items.add(new Item(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
        }
        return items;
    }

    public static Item getItemByMaHH(String maHH) {
        Item item = new Item();
        try (Connection connect = DBConnect.getConnection()) {
            String sql = "select * from Hanghoa where mahh = ? ";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, maHH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Item(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException ex) {
        }
        return item;
    }
}
