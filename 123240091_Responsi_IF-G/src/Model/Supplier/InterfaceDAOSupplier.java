/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOSupplier {
    public void insert(ModelSupplier supplier);
    public void update(ModelSupplier supplier);
    public void delete(int id);
    public List<ModelSupplier>getAll();
    public List<ModelSupplier>search(String keyword);
}
