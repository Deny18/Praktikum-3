
public class Pegawai {
    private String nama;
    double gajiPokok;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    
    
    public void infoPegawai(){
        System.out.println("\nNama Karyawan\t\t: " + this.nama);
        System.out.println("Gaji Pokok\t\t: Rp." + this.gajiPokok);
    }
}
