import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithListIterator2 {

  public static void main(String[] args) {

    List<Studentiter2> studentList1 = new ArrayList<Studentiter2>();
    Studentiter2 s1 = new Studentiter2("Sujit",1);
    Studentiter2 s2 = new Studentiter2("Siddharth",2);
    Studentiter2 s3 = new Studentiter2("Karanpreet",3);
    Studentiter2 s4 = new Studentiter2("Hari",5);
    Studentiter2 s5 = new Studentiter2("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    iterateBkwd(studentList1);
  }

  private static void iterateFwd(List<Studentiter2> students) {
    ListIterator<Studentiter2> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<Studentiter2> students) {
    ListIterator<Studentiter2> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class Studentiter2 {
  private final String name;
  private final int rollNumber;

  public Studentiter2(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
