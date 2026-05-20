/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Connector {
    public static Connection connection;
    public Connector(){
        try {
            String url = "jdbc:mysql://localhost:3306/inventory_db";
            String user = "root";
            String pass = "";
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e){
            System.out.println("Koneksi Gagal");
            System.out.println("e.getMessage");
        }
    }
}
