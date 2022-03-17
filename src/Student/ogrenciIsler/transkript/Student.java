package Student.ogrenciIsler.transkript;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Student {
    String lesson;
    private int creditLesson;

    private ArrayList<String> arrayListSemester = new ArrayList<>();
    private ArrayList<String> arrayListStudent = new ArrayList<>();

    static int studentsMevcut = 0;

    public Student() {
        studentsMevcut++;
        System.out.println(getClass().getSimpleName() + " kayitli Ögrenci sayisi: " + studentsMevcut);
        if (studentsMevcut > 1) {
            System.out.println("*************************************************************************");
        }
    }
/////////////////////////////////////////////////////////////////////////////////

    public abstract void addLessons();

    public abstract void creditLesson();

    //////////////////////////////////////////////////////////////////////////////////
    public void lessonCheck() {
        for (int i = 0; i < arrayListStudent.size(); i++) {
            for (int j = 0; j < arrayListStudent.size(); j++) {
                if (i < j) {
                    arrayListStudent.sort(String.CASE_INSENSITIVE_ORDER);//---> tüm elemanlari kücük büyük hassasiyeti olmadan kiyaslar
                    if (arrayListStudent.get(i).equals(arrayListStudent.get(j))) {
                        System.out.println("1 Dersi birden fazla secemezsin!");
                        arrayListStudent.remove(i);
                    }
                }
            }
        }
        if (arrayListStudent.size() == 0) {
            System.out.println("Secilen dersler : *****");

        } else {
            System.out.println("Secilen dersler : " + arrayListStudent);
        }
    }
////////////////////////////////////////////////////::


    //////////////////////////////////////////////////////////////////////////////////
    public int getCreditLesson() {
        return creditLesson;
    }

    public void setCreditLesson(int creditLesson) {
        if (creditLesson < 0) {
            System.out.println("Ders kredisi O dan kücük olamaz...");
        } else {
            this.creditLesson = creditLesson;
        }
    }

    public ArrayList<String> getArrayListStudent() {
        return arrayListStudent;
    }

    public void setArrayListStudent(ArrayList<String> arrayListStudent) {
        this.arrayListStudent = arrayListStudent;
    }

    public ArrayList<String> getArrayListSemester() {
        return arrayListSemester;
    }

    public void setArrayListSemester(ArrayList<String> arrayListSemester) {
        this.arrayListSemester = arrayListSemester;
    }
}
