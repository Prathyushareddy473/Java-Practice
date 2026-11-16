package day3;

public class Student2 {




    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
Student s1=new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 101;
        s1.name = "Prathyusha";

        s2.id = 102;
        s2.name = "bhanu";

        s3.id = 103;
        s3.name = "hameeda";

        s1.display();
        s2.display();
        s3.display();
    }



}
