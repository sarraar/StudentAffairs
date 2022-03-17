package Student.ogrenciIsler;

import com.gunler.ogrenciIsler.transkript.Transkript;

public class OgrenciIsleriTest {
    public static void main(String[] args) {

        Giris yeni = new Giris();

        System.out.println("\n//////////////////////////////////////\n");

//        Giris yeni1 = new Giris();

        // Login yeni1 = new Login("123","123");
        // HesapAc yeni= new HesapAc();

        /*ArrayList<Student> studentsObject = new ArrayList<>();
        studentsObject.add(new Semester3());// Ã¶grenci bilgileri yap
        studentsObject.add(new Semester3());
        studentsObject.add(new Semester2());*/


        Transkript student1 = new Transkript();
        double[][] notlar1 = {{50, 60, 70}, {70, 80, 90}, {45, 65, 57}, {35, 55, 75}, {90, 85, 80}};
        double[][] notlar2 = {{80, 60, 70}, {70, 80, 65}, {45, 65, 57}, {35, 55, 75}, {35, 85, 80}};
        double[][] notlar3 = {{80, 60, 55}, {95, 80, 65}, {50, 65, 57}, {35, 55, 75}, {55, 85, 80}};


        student1.ortalamaBulmaIslemi(notlar1, 1);
        System.out.println();
        student1.ortalamaBulmaIslemi(notlar2, 2);
        System.out.println();
        student1.ortalamaBulmaIslemi(notlar3, 3);
        System.out.println();
        student1.transkript("Zehra", 3);

        Giris hesap = new Giris();

    }


}
