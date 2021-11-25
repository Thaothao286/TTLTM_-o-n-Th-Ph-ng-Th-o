/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author Thang
 */
public class KetNoiCSDL {

    /**
     * @param args the command line arguments
     */
    Connection cn= null;
    public KetNoiCSDL() throws SQLException 
    {
    String url="jdbc:mysql://localhost:3306/csdl1";
    this.cn=(Connection) DriverManager.getConnection(url,"root","");
    }
    
    public ResultSet LayDL (String tenbang) throws SQLException 
    {
            ResultSet kq=null;
          try
          {
            Statement st = (Statement) this.cn.createStatement();
            String sql= "select * from taikhoan";
            kq=st.executeQuery(sql);
          }
          catch(SQLException ex)
          {
              
          }
          
            return kq; 
    }
  
    public static void main(String[] args) throws SQLException {
     /* try
      {
          String url="jdbc:mysql://localhost:81/csdl1";
        String user ="root";
        String password="";    // cách 2 
         Connection cn=(Connection) DriverManager.getConnection(url,user,password);
       // Connection cn=  (Connection) DriverManager.getConnection(url,"root",""); //cách 1 mật khẩu mặc định là rông và user mặc định là root
        System.out.println("kết nối THÀNH CÔNG");
      }
      catch(SQLException ex)
      { 
          
          Logger.getLogger(KetNoiCSDL.class.getName()).log(Level.SEVERE,null,ex);
      } */
                KetNoiCSDL a= new KetNoiCSDL();
               ResultSet rs=a.LayDL("taikhoan");
               while(rs.next())
               {
               System.out.println(rs.getString(1)); 
               }
    }
}
