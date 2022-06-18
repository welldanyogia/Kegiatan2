import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index=0,pilih = 0,jmlhdata = 0;

        ReadWrite readWrite = new ReadWrite();
        DinasPertanahan dinasPertanahans = new DinasPertanahan();
        Scanner userInp = new Scanner(System.in);

        readWrite.menu();
        System.out.println("Masukkan pilihan : ");
        pilih = userInp.nextInt();
        switch (pilih){
            case 1:
                try {
                    System.out.println("Jumlah data yang ingin ditulis : ");
                    jmlhdata=userInp.nextInt();
                    DinasPertanahan[] dinasPertanahan = new DinasPertanahan[jmlhdata];
                    dinasPertanahan[index]=new DinasPertanahan();
                    for (index = 0;index <jmlhdata; index++) {
                        dinasPertanahan[index]=new DinasPertanahan();
                        System.out.printf("\n\nDATA KE-%d\n",index+1);
//                        System.out.print("Masukkan Alamat : ");
//                        String alamat1=userInp.nextLine();
                        dinasPertanahan[index].setAlamat(dinasPertanahan[index].getAlamat());
//                        System.out.print("Masukkan Panjang Tanah : ");
//                        int panjangTanah = userInp.nextInt();
                        dinasPertanahan[index].setPanjangTanah(dinasPertanahan[index].getPanjangTanah());
//                        System.out.print("Masukkan Luas Tanah : ");
//                        int luasTanah = userInp.nextInt();
                        dinasPertanahan[index].setLuasTanah(dinasPertanahan[index].getLuasTanah());
                        System.out.println("\n");
//                        dinasPertanahan[index].getAlamat();
//                        dinasPertanahan[index].getPanjangTanah();
//                        dinasPertanahan[index].getLuasTanah();
                        dinasPertanahan[index].write();
                    }

                }catch (ArrayIndexOutOfBoundsException | InputMismatchException | NullPointerException e) {
                    System.err.println(e);
                }
                break;
            case 2:
                dinasPertanahans.read();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

    }

}