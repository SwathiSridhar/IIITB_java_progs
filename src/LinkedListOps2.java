import java.util.*;

public class LinkedListOps2 {
  public static void main(String[] args) {
    LinkedList<Studentlops2> studentList = new LinkedList<Studentlops2>();
    Studentlops2 s1 = new Studentlops2("Sujit",1);
    Studentlops2 s2 = new Studentlops2("Siddharth",2);
    Studentlops2 s3 = new Studentlops2("Karanpreet",3);
    Studentlops2 s4 = new Studentlops2("Hari",5);
    Studentlops2 s5 = new Studentlops2("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    studentList.remove(3);
    // System.out.println("s1 contained?"+ studentList.contains(s1));
    // System.out.println("s5 contained?"+ studentList.contains(s5));

    Studentlops2 s = studentList.get(1);
    System.out.println(s.getDetails());
    // printStudentList(studentList);

  }

  public static void printStudentList(LinkedList<Studentlops2> students) {
    for(Studentlops2 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Studentlops2 {
  private final String name;
  private final int rollNumber;

  public Studentlops2(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
