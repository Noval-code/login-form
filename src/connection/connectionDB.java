/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author muhammad noval aula
 */
public class connectionDB {
     public static Connection openKonn() {
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setDatabaseName("login");
            mds.setUser("root");
            mds.setPassword("");
            mds.setServerName("localhost");
            mds.setPort(8111);
            mds.setServerTimezone("Asia/Jakarta");
            Connection con = mds.getConnection();
            return con;
        } catch (Exception e) {
            System.out.println("e");
        }
        return null;
    }
}
