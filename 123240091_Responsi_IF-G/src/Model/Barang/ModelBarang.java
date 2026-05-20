/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Barang;

/**
 *
 * @author Lab Informatika
 */
public class ModelBarang {
    private int id;
    private String nama;
    private String kategori;
    private int stok;
    private String status;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getnama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getkategori(){
        return kategori;
    }
    public void setkategori(String kategori){
        this.kategori = kategori;
    }
    public int getstok(){
        return stok;
    }
    public void setstok(int stok){
        this.stok = stok;
    }
    public String getstatus(){
        return status;
    }
    public void setstatus(String status){
        this.status = status;
    }
}
