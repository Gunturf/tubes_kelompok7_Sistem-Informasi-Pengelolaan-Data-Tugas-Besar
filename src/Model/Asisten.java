
package Model;

import java.util.ArrayList;

public class Asisten extends Orang {
    private String judul;
    private ArrayList <TugasBesar> daftarTugasBesar = new ArrayList ();  

    public String SemuaJudul (Asisten a) {
        String s = "";
        for (int i = 0; i < daftarTugasBesar.size(); i++) {
            s = s + a.getJudul() + " , ";
        }
        return s;
    }
    
    public Asisten( String nama, String nim) {
        super(nama, nim);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void createTugasBesar( String judul){
        TugasBesar m = new TugasBesar();
        daftarTugasBesar.add(m);
    }
    
    public TugasBesar getTugasBesar (int i){
        if(i<daftarTugasBesar.size()){
            return daftarTugasBesar.get(i);
        }else {
            return null;
        }
    }
    
    public void removeTugasBesar(TugasBesar e ){
        if(daftarTugasBesar.size() > 1){
            daftarTugasBesar.remove(e);
        }
       
    } 

    @Override
    public String toString() {
        return "judul : " + judul;
    }
    
    
    
}
