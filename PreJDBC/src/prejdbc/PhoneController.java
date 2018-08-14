/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prejdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Windows10
 */
public class PhoneController {
    private Connection con;
    public PhoneController(String user,String psw) throws ClassNotFoundException, SQLException{
          String url = null;
          con =ConnectionManager.createConnection(url, user, psw);
          System.out.println("Connection create sucessful");
    }
    public void CloseConnection() throws SQLException {
      ConnectionManager.closeConnection(con);
        System.out.println("close connection sucessfull");
    }
    public void addPhoneNumber(String phonenumber,String nickname,int gen) throws SQLException{
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO PHONEBOOK(telephone,nickname,gen)\n" +
        "VALUES ('"+phonenumber+" , "+nickname+" , "+gen+" ) " ;
        stmt.executeUpdate(sql);
    }
}
