/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Mahasiswa extends Manusia {
    String jurusan;
    int nim;
    
    // setter
    public void setNIM(int nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    
    // getter
    public int getNim(){
        return this.nim;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public void infoMahasiswa(){
        System.out.println("NIM\t\t: " + this.nim);
        System.out.println("Jurusan\t\t: " + this.jurusan);
    }
}

