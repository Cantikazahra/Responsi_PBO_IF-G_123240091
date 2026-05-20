/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;
import Model.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public class DAOSupplier implements InterfaceDAOSupplier{
    @Override
    public void insert(ModelSupplier supplier){
        try {
            Connector connector = new Connector();
            String query = "INSERT INTO supplier(nama, kontak, alamat)VALUES(?,?,?)";
            PreparedStatement ps = Connector.connection.prepareStatement(query);
            ps.setString(1, supplier.getNama());
            ps.setString(2, supplier.getKontak());
            ps.setString(3, supplier.getAlamat());
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void update(ModelSupplier supplier) {
        try {
            Connector connector = new Connector();
            String query = "UPDATE supplier SET nama=?, kontak=?, alamat=? WHERE id=?";
            PreparedStatement ps = Connector.connection.prepareStatement(query);
            ps.setString(1, supplier.getNama());
            ps.setString(2, supplier.getKontak());
            ps.setString(3, supplier.getAlamat());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void delete(int id) {
        try {
            Connector connector = new Connector();
            String query = "DELETE FROM supplier WHERE id=?";
            PreparedStatement ps = Connector.connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<ModelSupplier> getAll(){
        List<Modelsupplier>list = new ArrayList<>();
        try {
            Connector connector = new Connector();
            String query = "SELECT * FROM supplier";
            PreparedStatement ps = Connector.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelSupplier supplier = new ModelSupplier();
            }
        }
    }
}
