/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.rizal;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author RizalZ
 */
class connection {
    public static void main(String[] data)
    {
        Connection conn = null;
        String uname = "";
        String pword = "";
        String dbUrl = "jdbc:odbc:koneksi";
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(dbUrl, uname, pword);
            JOptionPane.showMessageDialog(null, "Koneksi ke database berhasil");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        finally
        {
            System.exit(0);
        }
    }
}
