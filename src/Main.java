
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555333");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "9999");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "123112");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji", "103", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "1001", "4", tarih, fizik, bio);
        s1.addBulkExamNote(50,75,48,50,100,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "1002", "4", tarih, fizik, bio);
        s2.addBulkExamNote(75,50,82,50,65,45);
        s2.isPass();
    }
}
