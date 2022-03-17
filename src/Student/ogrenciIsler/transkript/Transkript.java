package Student.ogrenciIsler.transkript;

import java.util.ArrayList;
import java.util.Scanner;

public class Transkript extends Student {// istenen donemin ortalamasi ve genel ortalama hesaplanmasi
    Scanner scanner = new Scanner(System.in);

    //private double[][] notlar = new double[5][3]; kullanmadim ama ders sayisi ve her ders icin 3 sinav old hatirlamak icin biraktim

    private double semester1ort = 0;
    private double semester2ort = 0;
    private double semester3ort = 0;
    private double semester4ort = 0;
    private double semester5ort = 0;
    private double semester6ort = 0;

    ArrayList<Double> semesterOrt = new ArrayList<>();

    ArrayList<Double> semesterNotlari = new ArrayList<>();// icinde o semesterdeki derslerin ortalamalari var

    /**
     * her ders notlari tablo olarak alinip ortalama hesaplanip array liste atiliyor
     *
     * @param notlar
     * @param semesterNo
     */
    public void ortalamaBulmaIslemi(double[][] notlar, int semesterNo) {//

        double dersOrtalama = 0;
        double ortSon = 0;

        for (int i = 0; i < 5; i++) {
            dersOrtalama = (notlar[i][0] + notlar[i][1] + notlar[i][2]) / 3;
            semesterNotlari.add(dersOrtalama);

        }
        for (double element : semesterNotlari) {
            ortSon += element / 5;


        }


        if (semesterNo == 1) {
            System.out.println(semesterNotlari);
            setSemester1ort(ortSon);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester1ort());

        } else if (semesterNo == 2) {
            System.out.println(semesterNotlari);
            setSemester2ort(ortSon - semester1ort);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester2ort());

        } else if (semesterNo == 3) {
            System.out.println(semesterNotlari);
            setSemester3ort(ortSon - semester1ort - semester2ort);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester3ort());

        } else if (semesterNo == 4) {
            System.out.println(semesterNotlari);
            setSemester4ort(ortSon - semester1ort - semester2ort - semester3ort);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester4ort());

        } else if (semesterNo == 5) {
            System.out.println(semesterNotlari);
            setSemester5ort(ortSon - semester1ort - semester2ort - semester3ort - semester4ort);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester5ort());

        } else if (semesterNo == 6) {
            System.out.println(semesterNotlari);
            setSemester6ort(ortSon - semester1ort - semester2ort - semester3ort - semester4ort - semester5ort);
            System.out.println(semesterNo + ". semester ortalama = " + getSemester6ort());

        }


    }


    public void transkript(String name, int semesterSayisi) {
        System.out.println("Uyari: Not atamasi yapmadan tarnskript ciktisi alianamaz.\nLutfen once ortalama bulma islemi metodunu cagirin");
        //once ortalama bulma metodunu cagir demek istiyor

        System.out.println("Merhaba " + name + " ortalama sonuclariniz:  \n");

        System.out.println("\nsemester1ort=" + semester1ort +
                "\n semester2ort=" + semester2ort +
                "\n semester3ort=" + semester3ort +
                "\n semester4ort=" + semester4ort +
                "\n semester5ort=" + semester5ort +
                "\n semester6ort=" + semester6ort);

        double genelOrt = (semester1ort + semester2ort + semester3ort + semester4ort +
                semester5ort + semester6ort) / semesterSayisi;
        System.out.println("\nGenel Ortalama: " + genelOrt);


    }


//////GETTER VE SETTER METODLARI----------------------------

    public double getSemester1ort() {
        return semester1ort;
    }

    public void setSemester1ort(double semester1ort) {
        this.semester1ort = semester1ort;
    }

    public double getSemester2ort() {
        return semester2ort;
    }

    public void setSemester2ort(double semester2ort) {
        this.semester2ort = semester2ort;
    }

    public double getSemester3ort() {
        return semester3ort;
    }

    public void setSemester3ort(double semester3ort) {
        this.semester3ort = semester3ort;
    }

    public double getSemester4ort() {
        return semester4ort;
    }

    public void setSemester4ort(double semester4ort) {
        this.semester4ort = semester4ort;
    }

    public double getSemester5ort() {
        return semester5ort;
    }

    public void setSemester5ort(double semester5ort) {
        this.semester5ort = semester5ort;
    }

    public double getSemester6ort() {
        return semester6ort;
    }

    public void setSemester6ort(double semester6ort) {
        this.semester6ort = semester6ort;
    }


    //------------------OVERRIDE EDILEN METODLAR----------------------------
    @Override
    public String toString() {
        return "Transkript{" +
                "semester1ort=" + semester1ort +
                ", semester2ort=" + semester2ort +
                ", semester3ort=" + semester3ort +
                ", semester4ort=" + semester4ort +
                ", semester5ort=" + semester5ort +
                ", semester6ort=" + semester6ort +
                '}';
    }

    @Override
    public void addLessons() {

    }

    @Override
    public void creditLesson() {

    }
}


