public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int c1note, int c1viva, int c2note, int c2viva, int c3note, int c3viva) {
        if (c1note >= 0 && c1note <= 100) {
            this.c1.note = c1note;
        }
        if (c2note >= 0 && c2note <= 100) {
            this.c2.note = c2note;
        }
        if (c3note >= 0 && c3note <= 100) {
            this.c3.note = c3note;
        }
        if (c1viva >= 0 && c1viva <= 100) {
            this.c1.viva = c1viva;
        }
        if (c2viva >= 0 && c2viva <= 100) {
            this.c2.viva = c2viva;
        }
        if (c3viva >= 0 && c3viva <= 100) {
            this.c3.viva = c3viva;
        }
    }

    void isPass() {
        this.avarage = (0.8 * (this.c1.note + this.c2.note + this.c3.note) / 3.0) + (0.2 * (this.c1.viva + this.c2.viva + this.c3.viva) / 3);
        System.out.println("---------------------------");
        System.out.println("ÖĞRENCİ ADI: " + this.name + ", Öğrenci No : " + this.stuNo);

        if (this.avarage > 55) {
            System.out.println("Sınıfı GEÇTİ");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta KALDI");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Sınav Notu\t: " + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu\t: " + this.c1.viva);
        System.out.println(this.c2.name + " Sınav Notu\t: " + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu\t: " + this.c2.viva);
        System.out.println(this.c3.name + " Sınav Notu\t: " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu\t: " + this.c3.viva);

        System.out.println("Ortalaması\t\t\t: " + this.avarage);
    }
}
