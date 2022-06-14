import java.util.*;

public class ArrayListOps3 {
  public static void main(String[] args) {
    ArrayList<Studentops3> studentList = new ArrayList<Studentops3>();
    Studentops3 s1 = new Studentops3("Sujit",1);
    Studentops3 s2 = new Studentops3("Siddharth",2);
    Studentops3 s3 = new Studentops3("Karanpreet",3);
    Studentops3 s4 = new Studentops3("Hari",5);
    Studentops3 s5 = new Studentops3("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(ArrayList<Studentops3> students) {
    for(Studentops3 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Studentops3 {
  private final String name;
  private final int rollNumber;

  public Studentops3(String name, int rollNumber) {
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
