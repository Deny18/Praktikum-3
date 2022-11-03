
public class Manager extends Pegawai {
    private double tunjangan;
    
    public double getTunjangan(){
        return tunjangan;
    }
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public void infoManager(){
        super.infoPegawai();
        System.out.println("Tunjangan Jabatan\t: Rp." + this.tunjangan);
        System.out.println("Total Gaji\t\t: Rp." + (gajiPokok+this.tunjangan));
        System.out.println("Jabatan\t\t\t: Manager");
    }
}
