import java.util.*;

public class StudentDriver {
  public static void main(String[] args) {
    Student student1 = new Student("Artur", "938472019");
    Student student2 = new Student("Anna", "648593748");
    System.out.println(student1);
    System.out.println(student2);

    student1.setName("Artur");
    System.out.println(student1);

    System.out.println(student1.getName());
    System.out.println(student1.getNumber());

    student1.addGender("Male");
    student1.displayGender();
    student1.addAge(15);
    student1.displayAge();
    student1.addGrade(75);
    student1.displayGrade();

    student2.addGender("Female");
    student2.displayGender();
    student2.addAge(16);
    student2.displayAge();
    student2.addGrade(80);
    student2.displayGrade();

    Student student3 = new Student("Clara", "236784096");
    student3.fillArray();
    student3.displayGender();
    student3.displayAge();
    student3.displayGrade();
    System.out.println(student1.calculateAverage());
    System.out.println(student2.calculateAverage());
    System.out.println(student3.calculateAverage());
  } //end main

} //end class
