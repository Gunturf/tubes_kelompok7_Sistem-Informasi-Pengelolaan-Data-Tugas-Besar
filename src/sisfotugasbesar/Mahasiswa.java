
package sisfotugasbesar;


public class Mahasiswa extends Orang {
    
    private String Kelas ;
    private String NIM ;
    private String Kelompok ;

    public Mahasiswa(String Kelas, String NIM, String Kelompok, String nama) {
        super(nama);
        this.Kelas = Kelas;
        this.NIM = NIM;
        this.Kelompok = Kelompok;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getKelompok() {
        return Kelompok;
    }

    public void setKelompok(String Kelompok) {
        this.Kelompok = Kelompok;
    }

    

    
    
    
    
}
