package Student.ogrenciIsler;

import Student.ogrenciIsler.klupler.KlupKayit;

import Student.ogrenciIsler.transkript.Transkript;

import java.util.Scanner;

public class Login extends OgrenciListe {

    String studentNumber;
    String password;

    public Login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ogrenci numarasini giriniz...");
        this.studentNumber = scanner.next();
        System.out.println("parolayi giriniz....");
        this.password = scanner.next();

        if (ogrenciNr.contains(studentNumber) && pass.contains(password)) {

            System.out.println("""
                    Asagidaki islemlerden birini seciniz:
                    1: Klup faaliyetleri
                    2: Ders secimi
                    3: Transkript
                    4: Kutuphane islemleri
                    5: Kayit dondurma""");

            switch (scanner.nextInt()) {
                case 1:
                    new KlupKayit();
                    break;
                case 2:
                    //
                    break;
                case 3:
                    Transkript transkript = new Transkript();
                    //  transkript.transkript();
                    break;
                case 5:
                    System.out.println("Okul kaydiniz dondurulmustur!");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz!");
            }

        } else System.out.println("Hatali kullanici adi veya sifre girdiniz!");

    }

}
