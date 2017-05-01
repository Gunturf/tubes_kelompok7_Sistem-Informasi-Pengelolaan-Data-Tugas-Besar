
package Model;


public class Mahasiswa extends Orang{
    private  String kelas;
    private String judul;

    public Mahasiswa( String nama, String nim) {
        super(nama, nim);
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    

    public String toString(){
        return "\n nama     : " +getNama()
                +"\n NIM    : " +getNim()
                +"\n Kelas  : " +kelas;
    }
    
}
