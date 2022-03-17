package Student.ogrenciIsler;

import java.util.Date;
import java.util.Scanner;

public class KayitIslemi extends OgrenciListe {  // son olarak yaptim array liste yeni kayit ekleyebilmek icin!!

    Date input = new Date();
    Scanner scanner = new Scanner(System.in);

    private String name ;
    private String surname;
    private static String ogrenciNo;
    static int kayitSirasi;
    private final String kayitTarihi = input.toString();
    boolean kutuphaneKarti;
    private boolean bursluluk;
    String fakulteAdi;
    int fakulteKod = 102;
    String bolum;
    byte bolumNo ;
    private boolean harcParasiOdendi;
    private String sifre;

    public void ogrenciInfo() {
        System.out.println("YeniKayit info" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", kayitTarihi='" + getKayitTarihi() + '\'' +
                ", kutuphaneKarti=" + kutuphaneKarti +
                ", bursluluk=" + getBursluluk() +
                ", fakulteAdi='" + fakulteAdi + '\'' +
                ", fakulteKod=" + fakulteKod +
                ", bolum='" + bolum + '\'' +
                ", harcParasiOdendi=" + getHarcParasiOdendi());
    }

    public void setBolum() {

        System.out.println("""
                Bolum seciniz:\s
                1: Bilgisayar Muhendisligi
                2: Biyo Muhendisligi
                3: Cevre Muhendisligi
                4: Elektrik ve Elektronik Muhendisligi
                5: Endüstri Mühendisligi
                6: Insaat Muhendisligi""");

        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Bilgisayar Mühendisligi");
                this.bolum = "Bilgisayar Mühendisligi";
            }
            case 2 -> {
                System.out.println("Biyo Mühendisligi");
                this.bolum = "Biyo Mühendisligi";
            }
            case 3 -> {
                System.out.println("Cevre Mühendisligi");
                this.bolum = "Cevre Mühendisligi";
            }
            case 4 -> {
                System.out.println("Elektrik ve Elektronik  Mühendisligi");
                this.bolum = "Elektrik ve Elektronik Mühendisligi";
            }
            case 5 -> {
                System.out.println("Endüstri Mühendisligi");
                this.bolum = "Endüstri Mühendisligi";
            }
            case 6 -> {
                System.out.println("Insaat Mühendisligi");
                this.bolum = "Insaat Mühendisligi";
            }
            case 7 -> {
                System.out.println("Kimya Mühendisligi");
                this.bolum = "Kimya Mühendisligi";
            }
            case 8 -> {
                System.out.println("Makine Mühendisligi");
                this.bolum = "Makine Mühendisligi";
            }
            case 9 -> {
                System.out.println("Metalurji Mühendisligi");
                this.bolum = "Metalurji Mühendisligi";
            }
            default -> System.out.println("yanlis deger");
        }

        kayitIslem();
    }

    public void kayitIslem() {  // Kayit islemi methodunu geri getirdim ogrenci no atamak ve nryi array liste eklemek icin, kayit sirasini da buradan artiriyoruz
        kayitSirasi++;
        setOgrenciNo();
        ogrenciNr.add(getOgrenciNo());
    }

    public boolean loginPaswordAtama() {
        System.out.println("parolayi giriniz....");
        String password1 = scanner.next();
        System.out.println("parolayi tekrar giriniz....");
        String password2 = scanner.next();
        if (password1.equals(password2)) {
            this.setSifre(password1);
            pass.add(password1);
        } else return false;

        return true;
    }

    public String toString() {
        return "YeniKayit{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", kayitTarihi='" + getKayitTarihi() + '\'' +
                ", kutuphaneKarti=" + kutuphaneKarti +
                ", bursluluk=" + getBursluluk() +
                ", fakulteAdi='" + fakulteAdi + '\'' +
                ", fakulteKod=" + fakulteKod +
                ", bolum='" + bolum + '\'' +
                ", harcParasiOdendi=" + getHarcParasiOdendi() +
                '}';
    }

    //GETTER SETTER///////////////////////////////

    public void setOgrenciNo() {
        ogrenciNo = "" +this.fakulteKod + this.bolumNo + getKayitTarihi().substring(8, 10) + kayitSirasi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getOgrenciNo() {
        return ogrenciNo;
    }

    public boolean getBursluluk() {
        return bursluluk;
    }

    public void setBursluluk() {
        System.out.println("Burslu ogrenci misiniz?");
        this.bursluluk = scanner.nextBoolean();
    }

    public String getKayitTarihi() {
        return kayitTarihi;
    }

    public boolean getHarcParasiOdendi() {
        return harcParasiOdendi;
    }

    public void setHarcParasiOdendi() {
        System.out.println("Harc parasi odendi mi?");
        this.harcParasiOdendi = scanner.nextBoolean();
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifre() {
        return sifre;
    }
}
