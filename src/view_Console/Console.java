package View_Console;

import Model.Mahasiswa;
import Model.Aplikasi;
import Model.Asisten;
import Model.TugasBesar;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private Aplikasi modelAplikasi = new Aplikasi();
    private Scanner inputAngka;
    private Scanner inputString;
    private ArrayList<Mahasiswa> DaftarMahasiswa;
    private ArrayList<TugasBesar> DaftarTubes = new ArrayList <>();
    private ArrayList<Asisten> DaftarAsisten = new ArrayList<>();

    public Console() {
        inputAngka = new Scanner(System.in);
        inputString = new Scanner(System.in);
        DaftarMahasiswa = new ArrayList() ;
        DaftarTubes = new ArrayList();
    }
    
    public int inputBil() {
       return inputAngka.nextInt();
    }
    
    public void menuAsisten(){
        int pilih =0;
        do{
            try{
                System.out.println("============ Main Menu Asisten =============");
                System.out.println("1. Input Judul Tubes                        ");
                System.out.println("2. View Judul Tubes                         ");
                System.out.println("3. Detail Tubes                             ");
                System.out.println("4. Tambah Mahasiswa                         ");
                System.out.println("5. Kurang Mahasiswa                         ");
                System.out.print  ("Pilih Angka : ");
                pilih = inputBil(); 
                System.out.println("");
                switch(pilih){
                    case 1:
                        
                        System.out.println("Input Judul Tugas Besar ");
                        System.out.print("NIM         :           ");
                        String NimAsisten = inputString.nextLine();
                        System.out.println("judul       :           ");
                        String judul = inputString.nextLine();
                        Asisten a = modelAplikasi.getAsisten(NimAsisten);
                        a.createTugasBesar(judul);
                        
                    case 2:
                        System.out.println("View Judul Tugas Besar");
                        System.out.print("NIM         :           ");
                        String NimAs = inputString.nextLine();
                        Asisten aa = modelAplikasi.getAsisten(NimAs);
                        String s = modelAplikasi.getSemuaJudul(aa);
                        System.out.println(s);    
                            default:
                                throw new IllegalStateException("Wrong Menu Input");
                    }
            }catch(Exception e){
                        // System.out.println("Program Error  "+ e.getMessage());        
                }finally{
                        inputAngka = new Scanner(System.in);
                        inputString = new Scanner(System.in);
                     }
        }while(pilih !=0);
    }
    
    public void menuMahasiswa(){
        int pilih =0;
        do{
            try{
                System.out.println("============ Main Menu Mahasiswa =============");
                System.out.println("1. Input Mahasiswa                            ");
                System.out.println("2. Input Judul Tubes                          ");
                System.out.println("3. View Data                                  ");
                System.out.println("4. Back                                       ");
                System.out.print  ("Pilih Angka : ");
                pilih = inputBil(); 
                System.out.println("");
                switch(pilih){
                   
                            
                            default:
                                throw new IllegalStateException("Wrong Menu Input");
                       }
            }catch(Exception e){
                        // System.out.println("Program Error  "+ e.getMessage());        
                }finally{
                        inputAngka = new Scanner(System.in);
                        inputString = new Scanner(System.in);
                     }
        }while(pilih !=0);
 }       
    
    
    public void Menu(){
        int Pilih = 0;
        
        do{
            try {
                System.out.println("========== Main Menu ==========");
                System.out.println("1. registrasi Asisten          ");
                System.out.println("2. regitrasi Mahasiswa         ");
                System.out.println("3. Login Asisten               ");
                System.out.println("4. Login Mahasiswa             ");
                System.out.print  ("Pilih Angka : ");
                System.out.println("");
                Pilih = inputBil();
                switch(Pilih){
                   case 1 :
                        System.out.print("Nama Asisten : "); String nama = inputString.nextLine();
                        System.out.print("NIM          : "); String nim = inputString.nextLine();
                        modelAplikasi.createAsisten(nama, nim);
                    break;  
                    
                    case 2:
                        System.out.print("Nama Mahasiswa : "); String namaMhs = inputString.nextLine();
                        System.out.print("NIM            : "); String nimMhs = inputString.nextLine(); 
                        modelAplikasi.createMahasiswa(namaMhs, nimMhs);
                    break; 
                    
                    case 3: 
                        
                        System.out.println("====== Login Asisten ======");
                        System.out.print(" Input NIM       : "); 
                        String nimAsisten = inputString.nextLine();
                        if(modelAplikasi.loginAsisten(nimAsisten) == true) {
                            menuAsisten();
                            System.out.println("Login berhasil");
                        } else {
                            System.out.println("Login gagal");
                        }
                        break;
                    
                    case 4: 
                        
                        System.out.println("====== Login Mahasiswa ======");
                        System.out.print(" Input NIM       : "); 
                        String nimMahasiswa = inputString.nextLine();
                        if(modelAplikasi.loginMahasiswa(nimMahasiswa) == true) {
                            menuMahasiswa();
                            System.out.println("Login berhasil");
                        } else {
                            System.out.println("Login gagal");
                        }
                        break;
                default:
                        throw new IllegalStateException("Wrong Menu Input");
            }  
        }catch(Exception e){
           // System.out.println("Program Error  "+ e.getMessage());        
        }finally{
                inputAngka = new Scanner(System.in);
                inputString = new Scanner(System.in);
            }
                
    }while(Pilih !=0);
    
        
    }

}
