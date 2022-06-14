import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithListIterator3 {

  public static void main(String[] args) {

    List<Studentlist3> studentList1 = new ArrayList<Studentlist3>();
    Studentlist3 s1 = new Studentlist3("Sujit",1);
    Studentlist3 s2 = new Studentlist3("Siddharth",2);
    Studentlist3 s3 = new Studentlist3("Karanpreet",3);
    Studentlist3 s4 = new Studentlist3("Hari",5);
    Studentlist3 s5 = new Studentlist3("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    //iterateBkwd(studentList1);
    iterateFwdBkwd(studentList1);
  }

  private static void iterateFwd(List<Studentlist3> students) {
    ListIterator<Studentlist3> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<Studentlist3> students) {
    ListIterator<Studentlist3> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
  private static void iterateFwdBkwd(List<Studentlist3> students) {
    ListIterator<Studentlist3> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class Studentlist3 {
  private final String name;
  private final int rollNumber;

  public Studentlist3(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
