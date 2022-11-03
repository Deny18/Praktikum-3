/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Manusia {
    String nama, jenisKelamin, alamat;
    int umur;
     
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNama(){
        return this.nama;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    public int getUmur(){
        return this.umur;
    }
    
    public void cetakInfo() {
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Jenis Kelamin\t: " + this.jenisKelamin);
        System.out.println("Umur\t\t: " + this.umur);
        System.out.println("Alamat\t\t: " + this.alamat);    
    }
    
}
