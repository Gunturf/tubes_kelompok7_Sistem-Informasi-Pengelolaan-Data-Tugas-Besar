package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplikasi {
    private ArrayList<Mahasiswa> DaftarMahasiswa = new ArrayList();
    private ArrayList<Asisten>  DaftarAsisten = new ArrayList ();
    //private ArrayList<TugasBesar> DaftarTugasBesar = new ArrayList();
    private String kotakNim;
    
    public Aplikasi(){
        DaftarMahasiswa = new ArrayList();
        DaftarAsisten = new ArrayList();
        
    }
    
    // Asisten 
   
    public void createAsisten( String nama, String nim){
        DaftarAsisten.add(new Asisten( nama,  nim));
    }
    
    public boolean loginAsisten(String nim){
        for(Asisten as : DaftarAsisten){
            if(as.getNim().equals(nim)) {
                kotakNim = as.getNim();
                return true;
            }
        }
        return false;
    }
    
    public Asisten getAsisten(String Nim){
        return DaftarAsisten.stream()
                .filter(e -> e.getNim().equals(Nim))
                .findFirst().orElse(null);
    }
    
    public Asisten getAsisten(int i){
        Asisten s = DaftarAsisten.get(i);
        return s;
    }
    
    public void removeAsisten(String as){
        for(Asisten s : DaftarAsisten){
            if (s.getJudul().equals(as)){
                DaftarAsisten.remove(s);
            }
        }
    }
    
    // Mahasiswa
    
    public void createMahasiswa(String nama, String nim){
        DaftarMahasiswa.add(new Mahasiswa(nama, nim));
    }
    
    public boolean loginMahasiswa(String nim){
        for(Mahasiswa m : DaftarMahasiswa){
            if(m.getNim().equals(nim)) {
                kotakNim = m.getNim();
                return true;
            }
        }
        return false;
    }
    
    public Mahasiswa getMahasiswa(int i){
        Mahasiswa m = DaftarMahasiswa.get(i);
        return m;
    }
    
    public Mahasiswa getMahasiswa(String NIM){
        for(Mahasiswa m : DaftarMahasiswa){
            if (m.getNim().equals(NIM)){
                return m;
            }
        }
        return null;
        
    }
    
    public void removeMahasiswa(String NIM){
        for (Mahasiswa idMh : DaftarMahasiswa ){
            if  (idMh.getNim().equals(NIM)){
                DaftarMahasiswa.remove(NIM);
            }
        }
    }
    
    
   //Tampilan Data Data  
    public void viewListConsole(String[] list){
        Arrays.stream(list).forEach(System.out::println);   
    }
    
    public String[] getListAsisten(){
        List IdAsisten = DaftarAsisten.stream()
                .map(e -> e.toString()).collect(Collectors.toList());
        return (String[]) IdAsisten.stream().toArray(size ->new String[size]);
    }
    
    public String[] getListMahasiswa(){
        List Mh = DaftarMahasiswa.stream()
                .map(e -> e.toString()).collect(Collectors.toList());
        return (String[]) Mh.stream().toArray(size -> new String[size]);
    }
    
    public String getSemuaJudul(Asisten a) {
        String s = a.SemuaJudul(a);
        return s;
    }
    
    
    // Mahasiswa 
    
    /*public Mahasiswa getMahasiswa(String Kelompok){
        return DaftarMahasiswa.stream()
                .filter(e -> e.getKelompok().equals(Kelompok))
                .findFirst().orElse(null);
    } */
}

