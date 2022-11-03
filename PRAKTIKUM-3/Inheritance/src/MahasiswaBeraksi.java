/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MahasiswaBeraksi {
    public static void main(String[] args){
    // Membuat object
    Mahasiswa anton = new Mahasiswa();
    /* memanggil atribut dan memberi nilai */
    anton.nim = 10102020;
    anton.nama = "Anton Santoso";
    anton.jenisKelamin = "Laki-laki";
    anton.umur = 28;
    anton.alamat = "Bekasi Kota";
    anton.jurusan = "Informatika";
    anton.infoMahasiswa();
    anton.cetakInfo();
    
   }
}
