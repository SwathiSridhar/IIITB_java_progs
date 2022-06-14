import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithListIterator1 {

  public static void main(String[] args) {

    List<Studentiter1> studentList1 = new ArrayList<Studentiter1>();
    Studentiter1 s1 = new Studentiter1("Sujit",1);
    Studentiter1 s2 = new Studentiter1("Siddharth",2);
    Studentiter1 s3 = new Studentiter1("Karanpreet",3);
    Studentiter1 s4 = new Studentiter1("Hari",5);
    Studentiter1 s5 = new Studentiter1("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    iterateFwd(studentList1);
  }

  private static void iterateFwd(List<Studentiter1> students) {
    ListIterator<Studentiter1> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
}
class Studentiter1 {
  private final String name;
  private final int rollNumber;

  public Studentiter1(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
