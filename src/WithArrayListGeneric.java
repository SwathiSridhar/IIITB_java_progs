import java.util.*;

public class WithArrayListGeneric {
  public static void main(String[] args) {
    ArrayList<Studentgen> studentList = new ArrayList<Studentgen>();
    studentList.add(new Studentgen("Sujit", 1));
    studentList.add(new Studentgen("Siddharth", 2));
    // studentList.add(new String("Hari")); // this would lead to compile error 
    studentList.add(new Studentgen("Karanpreet", 3));
    studentList.add(new Studentgen("Hari", 5));
    studentList.add(new Studentgen("Tricha", 4));


    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList<Studentgen> students) {
    for(Studentgen s : students) {
    	// Student s = (Student) o;
      System.out.println(s.getDetails());
    }
  }
}

class Studentgen {
  private final String name;
  private final int rollNumber;

  public Studentgen(String name, int rollNumber) {
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
