package test;

public class Test01 {
    public static void main(String[] args) {
        //test print menggunakan format
        int id = 152;
        String kodeMK = "INF062219";
        String namaMK = "Wawasan Keilmuan Teknologi dan Lingkungan";
        int sks = 3;
        String nilaiHuruf = "A-";
        System.out.printf("| %3d | %-10s | %-50.50s | %d | %s |%n", id,kodeMK,namaMK,sks,nilaiHuruf);
    }
}
