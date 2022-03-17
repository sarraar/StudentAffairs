package Student.ogrenciIsler.klupler;

import com.gunler.ogrenciIsler.klupler.*;

import java.util.Scanner;

public class KlupKayit {

    Scanner scanner = new Scanner(System.in);


    public KlupKayit() {
        System.out.println("""
                Klup  seciniz:\s
                1: Bilim Klupleri,
                2: Doga sporlari klupleri,
                3: Guzel sanatlar klubu,
                4: Teknoloji klubu,
                5: Satranc klubu""");

        switch (scanner.nextInt()) {
            case 1:
                BilimKlubu bilimKlubu = new BilimKlubu();
                break;
            case 2:
                DogaSporlariKlubu dogaSporlariKlubu = new DogaSporlariKlubu();
                break;
            case 3:
                GuzelSanatlarKlubu guzelSanatlarKlubu = new GuzelSanatlarKlubu();
                break;
            case 4:
                TeknolojiKlubu teknolojiKlubu = new TeknolojiKlubu();
                break;
            case 5:
                SatrancKlubu satrancKlubu = new SatrancKlubu();
                break;
            default:
                System.out.println("Yanlis giris yaptiniz!");

        }

    }

}
