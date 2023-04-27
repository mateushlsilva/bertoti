package model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectaBd(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql//172.17.0.2:3306/escola?user=root&password=fatec";
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }

}
