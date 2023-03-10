public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("Adı \t\t: " + this.name);
        System.out.println("Telefonu \t: " + this.mpno);
        System.out.println("Bölümü \t\t: " + this.branch);
    }
}
