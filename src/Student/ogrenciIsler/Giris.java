package Student.ogrenciIsler;

import java.util.Scanner;

public class Giris {

    private String ogrenciNr;
    private String pass;

    public Giris() {
        System.out.println("EuroStudy Universitesine hosgeldiniz\n yeni kayit olusturmak icin 1`i, hesabiniza erismek icin 2`ye tiklayin.");
        Scanner scanner = new Scanner(System.in);
        String giris = scanner.next();
        if (giris.equals("1")) {

            HesapAc yeni = new HesapAc();

        } else if (giris.equals("2")) {

            Login login = new Login();


        } else System.out.println("Hatali giris yaptiniz!");
    }
}
