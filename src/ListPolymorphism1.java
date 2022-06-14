import java.util.*;

public class ListPolymorphism1 {
  public static void main(String[] args) {
    List<Studentlist1> studentList1 = new ArrayList<Studentlist1>();
    List<Studentlist1> studentList2 = new LinkedList<Studentlist1>();

    Studentlist1 s1 = new Studentlist1("Sujit",1);
    Studentlist1 s2 = new Studentlist1("Siddharth",2);
    Studentlist1 s3 = new Studentlist1("Karanpreet",3);
    Studentlist1 s4 = new Studentlist1("Hari",5);
    Studentlist1 s5 = new Studentlist1("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);

    studentList2.add(s4);
    studentList2.add(s5);

    printStudentList(studentList1);
    printStudentList(studentList2);


  }

  public static void printStudentList(List<Studentlist1> students) {
    System.out.println("Printing student details.....");
    for(Studentlist1 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Studentlist1 {
  private final String name;
  private final int rollNumber;

  public Studentlist1(String name, int rollNumber) {
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

  printStudents as a polymorphic function. It uses List (which is a super-class of ArrayList and List) 
    instead of ArrayList or List, thus inter-operates smoothly with both types.
*/
