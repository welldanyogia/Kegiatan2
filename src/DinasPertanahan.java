import java.util.Scanner;

public class DinasPertanahan {
    public String alamat;
    private int panjangTanah,luasTanah;
    Scanner inp = new Scanner(System.in);

    public void setAlamat() {
        System.out.print("Masukkan Alamat : ");
        alamat = inp.nextLine();
        this.alamat=alamat;
    }
    public void setPanjangTanah() {
        System.out.print("Masukkan Panjang Tanah : ");
        panjangTanah = inp.nextInt();

    }
    public void setLuasTanah() {
        System.out.print("Masukkan Luas Tanah : ");
        luasTanah = inp.nextInt();
    }

    public String getAlamat() {
//        System.out.printf("Alamat tanah adalah %s\n",alamat);
        return alamat;
    }

    public int getPanjangTanah() {
        System.out.printf("Panjang tanah adalah %d m.\n",panjangTanah);
        return panjangTanah;
    }
    public int getLuasTanah() {
        System.out.printf("luas tanah adalah %d m.\n",luasTanah);
        return luasTanah;
    }
}
