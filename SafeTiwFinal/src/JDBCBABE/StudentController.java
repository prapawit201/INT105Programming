/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCBABE;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class StudentController {
    private Connection con;

    public StudentController(String user,String psw) throws ClassNotFoundException, SQLException {
        String url = "jdbc:derby://localhost:1527/SitStudent";
        con = ConnectionManager.createConnection(url,user,psw);
        System.out.println("Log in Success");
    }
    public void Closeconnection() throws SQLException{
           ConnectionManager.closeConnection(con);
           System.out.println("Close Success");
    }
    public int addStudent(String name,int number, String faculty) throws SQLException{
       Statement stmt = con.createStatement();
        String sql = "INSERT INTO SitStudent(NAME,NUMBER,FACULTY) "
                + "VALUES ('"+name+"',"+number+",'"+faculty+"')";
        int numRec = stmt.executeUpdate(sql);
        return numRec;
        
    }
    public void findFaculty(String name) throws SQLException{
        ArrayList<SitStudent> sitt = new ArrayList<SitStudent>();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM SitStudent WHERE name LIKE '"+name+"%'";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String Name = rs.getString("name");
            String faculty = rs.getString("faculty");
            int number = rs.getInt("number");
            SitStudent st = new SitStudent(Name, number, faculty);
            sitt.add(st);
        }
        for(SitStudent show:sitt){
            System.out.println(show);
        }
    }
    
}
