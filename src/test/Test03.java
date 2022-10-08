package test;

import fosalgo.MataKuliah;
import fosalgo.TranskripNilaiMataKuliah;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {

        //set nilai default- boleh juga tanpa nilai default... tapi disini saya set. jadi list mata kuliahnya sudah tidak kosong
        TranskripNilaiMataKuliah transkrip = new TranskripNilaiMataKuliah("Kandacong", "D0212513", "Informatika");
        transkrip.insert("USB0913", "Wawasan Sosial Budaya", 3, "A");
        transkrip.insert("USB1112", "Kewirausahaan", 2, "A");
        transkrip.insert("INF031219", "Pengantar Sistem dan Teknologi Informasi", 2, "A");
        transkrip.insert("USB0612", "Bahasa Indonesia", 2, "A");
        transkrip.insert("INF011219", "Matematika Dasar", 2, "A");
        transkrip.insert("USB0812", "Pendidikan Kewarganegaraan", 2, "A");
        transkrip.insert("USB0712", "Pendidikan Pancasila", 2, "A");
        transkrip.insert("USB0112", "Pendidikan Agama Islam", 2, "A");
        transkrip.insert("INF021319", "Dasar Dasar Pemrograman", 3, "B+");
        transkrip.insert("USB1212", "BAHASA INGGRIS", 2, "B+");
        transkrip.insert("INF052319", "Matematika Diskrit", 3, "A");
        transkrip.insert("INF092219", "Fisika", 2, "A");
        transkrip.insert("INF082319", "Algoritma dan Struktur Data", 3, "A");
        transkrip.insert("INF072219", "Sistem Digital", 2, "A");
        transkrip.insert("USB1013", "Wawasan Keilmuan, Teknologi dan Lingkungan", 3, "A-");
        transkrip.insert("INF062219", "Sistem Operasi", 2, "A");
        transkrip.insert("USB1311", "KOKURIKULER", 1, "A-");
        transkrip.insert("INF042219", "Elektronika Komputer", 2, "A-");
        transkrip.insert("INF295219", "Mikrokontroller", 2, "T");
        transkrip.insert("INF103219", "Aljabar Linear", 2, "T");
        transkrip.insert("INF123319", "Basis Data I", 3, "T");
        transkrip.insert("INF113319", "Pemrograman Web I", 3, "T");
        transkrip.insert("INF133319", "Pemrograman Berorientasi Objek", 3, "T");
        transkrip.insert("INF143219", "Arsitektur dan Organisasi Komputer", 2, "T");
        transkrip.insert("INF153219", "Bahasa Inggris II", 2, "T");
        transkrip.insert("INF163219", "Interaksi Manusia dan Komputer", 2, "T");
        transkrip.insert("INF183219", "Aplikasi Komputer", 2, "T");
        transkrip.insert("INF173319", "Pengembangan Multimedia", 3, "T");

        boolean next = true;
        while (next) {
            System.out.println("################################################");
            System.out.println("PILIH MENU");
            System.out.println("[X] = Exit");
            System.out.println("[P] = Print Transkrip Nilai");
            System.out.println("[N] = Edit nama");
            System.out.println("[M] = Edit NIM");
            System.out.println("[R] = Edit Program Studi");
            System.out.println("[I] = Insert");
            System.out.println("[U] = Update");
            System.out.println("[D] = Delete");
            System.out.println("################################################");
            Scanner sc = new Scanner(System.in);
            System.out.print("Menu yang Anda pilih: ");
            String menuTerpilih = sc.nextLine();

            //tampilkan operasi berdasarkan menu yang dipilih
            if (menuTerpilih.equalsIgnoreCase("x")) {
                System.out.println("MENU TERPILIH: EXIT");
                transkrip.cetak();
                next = false;
                System.out.println("Proses Selesai; EXIT");
            } else if (menuTerpilih.equalsIgnoreCase("p")) {
                System.out.println("MENU TERPILIH: PRINT");
                transkrip.cetak();
            } else if (menuTerpilih.equalsIgnoreCase("n")) {
                System.out.println("MENU TERPILIH: EDIT NAMA");
                System.out.print("Input Nama Mahasiswa : ");
                String nama = sc.nextLine();
                transkrip.setNamaMHS(nama);
            } else if (menuTerpilih.equalsIgnoreCase("m")) {
                System.out.println("MENU TERPILIH: EDIT NIM");
                System.out.print("Input NIM : ");
                String nim = sc.nextLine();
                transkrip.setNim(nim);
            }else if (menuTerpilih.equalsIgnoreCase("r")) {
                System.out.println("MENU TERPILIH: EDIT PROGRAM STUDI");
                System.out.print("Input Program Studi : ");
                String prodi = sc.nextLine();
                transkrip.setProgramStudi(prodi);
            }else if (menuTerpilih.equalsIgnoreCase("i")) {
                System.out.println("MENU TERPILIH: INSERT");
                System.out.print("Input Kode Matakuliah : ");
                String kodeMK = sc.nextLine();
                System.out.print("Input Nama Matakuliah : ");
                String namaMK = sc.nextLine();
                System.out.print("Input SKS Matakuliah  : ");
                int sks = sc.nextInt();
                sc.nextLine();//ada sedikit trik disini setelah membaca numerik jika ingin melanjutkan membaca string maka panggil terlebih dahulu method nextLine() dan nilainya tidak ditangkap. baru kemudian digunakan lagi untuk membaca string nilai huruf
                System.out.print("Input Nilai Matakuliah: ");
                String nilaiHuruf = sc.nextLine();
                transkrip.insert(kodeMK, namaMK, sks, nilaiHuruf);//kita sudah punya method insert tadi. sekarang sisa kita gunakan
            } else if (menuTerpilih.equalsIgnoreCase("d")) {
                System.out.println("MENU TERPILIH: DELETE");
                transkrip.cetak();
                System.out.print("INPUT ID MATAKULIAH YANG AKAN DIHAPUS: ");
                int id = sc.nextInt();
                sc.nextLine();
                id--;
                if (id >= 0 && id < transkrip.getListMataKuliah().size()) {
                    MataKuliah mk = transkrip.getListMataKuliah().get(id);
                    System.out.print("Mata Kuliah: ");
                    mk.cetak();
                    System.out.println();
                    System.out.println("AKAN DIHAPUS");
                    boolean status = transkrip.delete(id);
                    System.out.println("STATUS DELETE = " + status);
                }
            } else if (menuTerpilih.equalsIgnoreCase("u")) {
                System.out.println("MENU TERPILIH: UPDATE");
                transkrip.cetak();
                System.out.print("INPUT ID MATAKULIAH YANG AKAN DIUPDATE: ");
                int id = sc.nextInt();
                sc.nextLine();
                id--;
                if (id >= 0 && id < transkrip.getListMataKuliah().size()) {
                    MataKuliah mk = transkrip.getListMataKuliah().get(id);
                    System.out.print("Mata Kuliah: ");
                    mk.cetak();
                    System.out.println();
                    System.out.println("AKAN DIUPDATE");
                    System.out.println("INPUT NILAI YANG BARU");
                    System.out.print("Input Kode Matakuliah : ");
                    String kodeMK = sc.nextLine();
                    System.out.print("Input Nama Matakuliah : ");
                    String namaMK = sc.nextLine();
                    System.out.print("Input SKS Matakuliah  : ");
                    int sks = sc.nextInt();
                    sc.nextLine();//ada sedikit trik disini setelah membaca numerik jika ingin melanjutkan membaca string maka panggil terlebih dahulu method nextLine() dan nilainya tidak ditangkap. baru kemudian digunakan lagi untuk membaca string nilai huruf
                    System.out.print("Input Nilai Matakuliah: ");
                    String nilaiHuruf = sc.nextLine();
                    boolean status = transkrip.update(id, kodeMK, namaMK, sks, nilaiHuruf);
                    System.out.println("STATUS UPDATE = " + status);
                }
            }
        }
    }
}
