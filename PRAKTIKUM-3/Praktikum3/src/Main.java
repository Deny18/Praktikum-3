
public class Main {
    public static void main(String[] args){
        Pegawai pg = new Pegawai();
        Manager mg = new Manager();
        Programmer pr = new Programmer();
        
        
        
        pg.setNama("Deny");
        pg.setGajiPokok(4000000);
        mg.setNama("Ferdi");
        mg.setGajiPokok(6500000);
        mg.setTunjangan(3000000);
        pr.setNama("Eliezer");
        pr.setGajiPokok(5000000);
        pr.setBonus(2500000);
        
        pg.infoPegawai();
        mg.infoManager();
        pr.infoProgrammer();
        
    }
}
