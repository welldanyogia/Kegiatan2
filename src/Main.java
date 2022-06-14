import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index=0,pilih = 0,jmlhdata = 0;

        ReadWrite readWrite = new ReadWrite();
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
                    for (index = 0;index <jmlhdata; index++) {
                        dinasPertanahan[index]=new DinasPertanahan();
                        System.out.printf("\n\nDATA KE-%d\n",index+1);
                        dinasPertanahan[index].setAlamat();
                        dinasPertanahan[index].setPanjangTanah();
                        dinasPertanahan[index].setLuasTanah();
                        System.out.println("\n");
                        dinasPertanahan[index].getAlamat();
                        dinasPertanahan[index].getPanjangTanah();
                        dinasPertanahan[index].getLuasTanah();
                        readWrite.write(dinasPertanahan[index].getAlamat(),dinasPertanahan[index].getPanjangTanah(),dinasPertanahan[index].getLuasTanah());
                    }
                }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                    System.err.println(e);
                }
                break;
            case 2:
                readWrite.read();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

    }

}