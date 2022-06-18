import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DinasPertanahan {
    public String alamat;
    private int panjangTanah,luasTanah;
    Scanner inp = new Scanner(System.in);

    public void setAlamat(String alamat) {
        System.out.print("Masukkan Alamat : ");
        alamat = inp.nextLine();
        this.alamat=alamat;
    }
    public void setPanjangTanah(int panjangTanah) {
        System.out.print("Masukkan Panjang Tanah : ");
        panjangTanah = inp.nextInt();
        this.panjangTanah=panjangTanah;

    }
    public void setLuasTanah(int luasTanah) {
        System.out.print("Masukkan Luas Tanah : ");
        luasTanah = inp.nextInt();
        this.luasTanah=luasTanah;
    }

    public String getAlamat() {
//        System.out.printf("Alamat tanah adalah %s\n",alamat);
        return alamat;
    }

    public int getPanjangTanah() {
//        System.out.printf("Panjang tanah adalah %d m.\n",panjangTanah);
        return panjangTanah;
    }
    public int getLuasTanah() {
//        System.out.printf("luas tanah adalah %d m.\n",luasTanah);
        return luasTanah;
    }
    public void read(){
        try {
            File obj = new File("wkwk.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }catch (FileNotFoundException e){
            System.err.println(e);
        }finally {
            System.out.println("-------");
        }
    }
    public void write() throws NullPointerException{
        try {
            FileWriter writer = new FileWriter("wkwk.txt");
            writer.write("======================\n");
            writer.write("Alamat : "+ getAlamat() +"\n");
            writer.write("Panjang tanah : "+getPanjangTanah()+"\n");
            writer.write("Luas tanah : "+getLuasTanah()+"\n");
            writer.write("\n");
            writer.close();
            System.out.println("Data berhasil tersimpan");
        }catch (IOException e){
            System.err.println(e);
        }finally {
            System.out.println("======");
        }

    }
    public void menu(){
        System.out.println("Menu");
        System.out.println("1.\t\tTulis data.");
        System.out.println("2.\t\tLihat Data");
    }
}
