package Student.ogrenciIsler.klupler;

import java.util.Scanner;

public class BilimKlubu {
    String ogrAdi;

    public BilimKlubu() {

        Welcome();
        AltKlupler();

    }

    public void Welcome() {
        System.out.println("Bilim klubumuze hos geldiniz " +
                "\n calismak istediginiz klube uye olmak icin ilgili kuluple iletisime geciniz");


    }

    public static void Uyelik() {

    }

    public void AltKlupler() {

        String klupler = """
                1 -Fizik\s
                2 - Kimya
                3 - Matematik
                4 - UzayBilimleriVeAstronomi
                5 - MolekulerBiyolojiVeGenetik
                cikis icin 0'a basiniz""";
        System.out.println(klupler);

        Scanner scanner = new Scanner(System.in);
        System.out.println("seciniz: ");
        String sayi = scanner.next();


        switch (sayi) {
            case "0" -> //Fizik
                    System.out.println("Cikis yaptiniz");
            case "1" -> //Fizik
                    Fizik.WelcomeFizik();
            case "2" -> // Kimya
                    Kimya.WelcomeKimya();
            case "3" -> // Matematik
                    Matematik.WelcomeMatematik();
            case "4" -> // UzayBilimleriVeAstronomi
                    UzayBilimleriVeAstronomi.WelcomeUzayBilimleriVeAstronomi();
            case "5" -> // MolekulerBiyolojiVeGenetik
                    MolekulerBiyolojiVeGenetik.WelcomeMolekulerBiyolojiVeGenetik();
            default -> System.out.println("Gecersiz islem...");
        }

    }

}
/////////////////////////////::::::::::::::::::::///////////////////////////////////////

class MolekulerBiyolojiVeGenetik extends BilimKlubu {

    public static void WelcomeMolekulerBiyolojiVeGenetik() {
        System.out.println("Molekuler Biyoloji ve Genetik klubundesiniz");
    }
}
//----------------------------------------------------

class Fizik extends BilimKlubu {

    public static void WelcomeFizik() {
        System.out.println("Fizik klubundesiniz");
    }

}
//--------------------------------------------------------

class Matematik extends BilimKlubu {

    public static void WelcomeMatematik() {
        System.out.println("Matematik klubundesiniz");
    }
}

//----------------------------------------------------------------
class Kimya extends BilimKlubu {

    public static void WelcomeKimya() {
        System.out.println("Kimya klubundesiniz");
    }

}

//-----------------------------------------------------------------------
class UzayBilimleriVeAstronomi extends BilimKlubu {

    public static void WelcomeUzayBilimleriVeAstronomi() {
        System.out.println("Uzay Bilimleri ve Astronomi klubundesiniz");
    }
}
