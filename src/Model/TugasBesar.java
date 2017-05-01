
package Model;
import java.util.ArrayList;
public class TugasBesar {
    
    private ArrayList <Dokumentasi> dokumentasi = new ArrayList <>();
    private ArrayList <Mahasiswa>  member = new ArrayList<>() ;
    
    public void createDokumentasi(Dokumentasi a){
        dokumentasi.add(a);
    }
    
    public void addMember(Mahasiswa m ){
        member.add(m);
    }
    
    public Mahasiswa getMember( int i){
        if(i<member.size()){
            return member.get(i);
        }else {
            return null;
        }
    }
    
    public Mahasiswa getMember (String NIM ){
        Mahasiswa m = null;
        for(int i = 0;i<member.size();i++){
            if(member.get(i).getNim().equals(NIM)){
                m = member.get(i);
                break;
            }  
        }
        return m;
    }
    
    public void removeMember (Mahasiswa m){
        if(member.size() >= 1){
            member.remove(m);
        }
    }
    
    public Dokumentasi getDokumentasi (int i){
        if(i<dokumentasi.size()){
            return dokumentasi.get(i);
        }else {
            return null;
        }
    }
    
    public void removeDokumentasi (int i){
        if(dokumentasi.size() >= 1){
            dokumentasi.remove(i);
        }
    }

  
    
    
    
    
}
