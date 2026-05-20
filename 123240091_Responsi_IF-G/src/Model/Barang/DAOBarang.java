/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Barang;
import Model.Barang.ModelBarang;
import Model.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public class DAOBarang implements InterfaceDAOBarang{
    @Override
    public void insert(ModelBarang barang){
        try {
            Connector connector = new Connector();
            String query = "INSERT INTO barang(nama, kategori, stok, status) "
                    + "VALUES(?,?,?,?)";
            PreparedStatement ps = Connector.connection.prepareStatement(query); 
            ps.setString(1, barang.getnama());
            ps.setString(2, barang.getkategori());
            ps.setString(3, barang.getstok());
            ps.setString(4,barang.getstatus());            
        } catch {
            
        }
    }
}
