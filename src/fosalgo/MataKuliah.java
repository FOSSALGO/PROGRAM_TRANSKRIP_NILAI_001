package fosalgo;

public class MataKuliah {

    private String kodeMK;
    private String namaMK;
    private int sks;
    private String nilaiHuruf;

    public MataKuliah(String kodeMK, String namaMK, int sks, String nilaiHuruf) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
    }
    
    public double getNilaiAngka(){
        if(nilaiHuruf.equalsIgnoreCase("A")){
            return 4.00;
        }else if(nilaiHuruf.equalsIgnoreCase("A-")){
            return 3.75;
        }else if(nilaiHuruf.equalsIgnoreCase("B+")){
            return 3.50;
        }else if(nilaiHuruf.equalsIgnoreCase("B")){
            return 3.00;
        }else if(nilaiHuruf.equalsIgnoreCase("B-")){
            return 2.75;
        }else if(nilaiHuruf.equalsIgnoreCase("C")){
            return 2.00;
        }else if(nilaiHuruf.equalsIgnoreCase("D")){
            return 1.00;
        }else if(nilaiHuruf.equalsIgnoreCase("E")){
            return 0;
        }else{
            return 0;
        }
    }
    
    public void cetak(){
        System.out.printf("| %-10s | %-50.50s | %3d | %-5.5s |", kodeMK,namaMK,sks,nilaiHuruf);
    }
    
    public double sksKaliNilai(){
        double nilai = getNilaiAngka();
        double sksNilai = sks * nilai;
        return sksNilai;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public void setNilaiHuruf(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }   
    
}
