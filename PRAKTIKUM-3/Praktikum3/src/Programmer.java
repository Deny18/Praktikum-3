
public class Programmer extends Pegawai {
    private double bonus;
    
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public void infoProgrammer(){
        super.infoPegawai();
        System.out.println("Bonus\t\t\t: Rp." + this.bonus);
        System.out.println("Total Gaji\t\t: Rp." +(gajiPokok+this.bonus));
        System.out.println("Jabatan\t\t\t: Programmer");
    }
}
