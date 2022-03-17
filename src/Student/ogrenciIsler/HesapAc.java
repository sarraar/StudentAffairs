package Student.ogrenciIsler;

public class HesapAc extends KayitIslemi {

    public HesapAc() {

        System.out.println("ogrenci adini giriniz...");
        this.setName(scanner.next());
        System.out.println("ogrenci soyadini giriniz...");
        this.setSurname(scanner.next());

        if (loginPaswordAtama()) {

            setBursluluk();

            if (!getBursluluk()) {

                setHarcParasiOdendi();

                if (!getHarcParasiOdendi()) {

                    System.out.println("Harc parasini ilgili bankaya odedikten sonra makbuz ile kayit yaptirabilirsiniz");

                } else {
                    setBolum();
                    System.out.println("getOgrenciNo() = " + getOgrenciNo());

                    ogrenciInfo();
                }

            } else {

                setBolum();
                System.out.println("getOgrenciNo() = " + getOgrenciNo());

                ogrenciInfo();

            }

        } else System.out.println("Hatali parola girdiniz!");


    }


}
