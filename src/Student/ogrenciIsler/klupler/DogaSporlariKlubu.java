package Student.ogrenciIsler.klupler;

import java.util.Scanner;

public class DogaSporlariKlubu {
    String ogrAdi;


    public DogaSporlariKlubu() {
        Welcome();
        AltKlupler();
    }

    public void Welcome() {
        System.out.println("Doga Sporlari klubumuze hos geldiniz " +
                "\n calismak istediginiz klube uye olmak icin ilgili kuluple iletisime geciniz");

    }

    public void AltKlupler() {

        String klupler = """
                1 -Dagcilik\s
                2 - Jokking
                3 - Yuzme
                4 - Yelken
                cikis icin 0'a basiniz""";
        System.out.println(klupler);

        Scanner scanner = new Scanner(System.in);
        System.out.println("seciniz: ");
        String sayi = scanner.next();


        switch (sayi) {
            case "0"://cikis
                break;

            case "1":
                Dagcilik.WelcomeDagcilikKlube();
                break;

            case "2": // Kimya
                Jokking.WelcomeJokkingKlube();
                break;

            case "3": // Matematik
                Yuzme.WelcomeYuzmeKlube();
                break;

            case "4": // UzayBilimleriVeAstronomi
                Yelken.WelcomeYelkenKlube();
                break;

            default:
                System.out.println("Gecersiz islem...");
        }

    }

}

class Yuzme extends DogaSporlariKlubu {

    public static void WelcomeYuzmeKlube() {
        System.out.println("Yuzme klubundesiniz");
    }

}

//-------------------------------------------
class Yelken extends DogaSporlariKlubu {

    public static void WelcomeYelkenKlube() {
        System.out.println("Yelken klubundesiniz");
    }
}

//-------------------------------------------------
class Dagcilik extends DogaSporlariKlubu {

    public static void WelcomeDagcilikKlube() {

        System.out.println("Dagcilik klubundesiniz");
    }
}

//--------------------------------------------------
class Jokking extends DogaSporlariKlubu {

    public static void WelcomeJokkingKlube() {
        System.out.println("Jokking klubundesiniz");
    }
}
