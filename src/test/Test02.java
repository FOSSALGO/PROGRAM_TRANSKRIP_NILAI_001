package test;

import fosalgo.TranskripNilaiMataKuliah;

public class Test02 {

    public static void main(String[] args) {
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
        transkrip.cetak();
    }
}
