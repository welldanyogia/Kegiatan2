import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite{
    private DinasPertanahan dp ;

    public DinasPertanahan getDp() {
        return dp;
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
            writer.write("Alamat : "+ getDp().getAlamat() +"\n");
            writer.write("Panjang tanah : "+dp.getPanjangTanah()+"\n");
            writer.write("Luas tanah : "+dp.getLuasTanah()+"\n");
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

