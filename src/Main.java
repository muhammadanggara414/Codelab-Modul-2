public class Main {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("123456789012345", "Ari", "Sekolah Teknologi Bandung");
        mahasiswa mhs2 = new mahasiswa("012345678901234", "Budi", "Sekolah Teknologi Jakarta");
        mhs1.tampilkanDataMahasiswa();
        mhs2.tampilkanDataMahasiswa();
        mahasiswa.tampilUniversitas();
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private String universitas;

    public Mahasiswa(String nim, String nama, String universitas) {
        this.nim = nim;
        this.nama = nama;
        this.universitas = universitas;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Universitas : " + this.universitas);
    }

    public static void tampilUniversitas() {
        String universitas = null;
        System.out.println("Universitas : " + universitas);
    }
}