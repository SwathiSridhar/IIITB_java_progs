import java.util.*;

public class LinkedListOps1 {
  public static void main(String[] args) {
    LinkedList<Studentl> studentList = new LinkedList<Studentl>();
    Studentl s1 = new Studentl("Sujit",1);
    Studentl s2 = new Studentl("Siddharth",2);
    Studentl s3 = new Studentl("Karanpreet",3);
    Studentl s4 = new Studentl("Hari",5);
    Studentl s5 = new Studentl("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    studentList.remove(3);
    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(LinkedList<Studentl> students) {
    for(Studentl s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Studentl {
  private final String name;
  private final int rollNumber;

  public Studentl(String name, int rollNumber) {
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
