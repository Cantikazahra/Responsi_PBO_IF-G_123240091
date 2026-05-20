/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;

/**
 *
 * @author Lab Informatika
 */
public class ModelSupplier {
    private int id;
    private String nama;
    private String kontak;
    private String alamat;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getKontak(){
        return kontak;
    }
    public void setKontak(String kontak){
        this.kontak = kontak;
    }
    public String getAlamat(){
        return kontak;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
