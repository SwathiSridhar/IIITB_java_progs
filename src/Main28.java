
abstract class Person28 {
  protected final String name;

  public Person28(String name) {
    this.name = name;

  }

  public abstract String getDetails();

}

class Studemt28 extends Person28{

  protected int year;

  protected static final int annualFees = 10000;

  public Studemt28(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Studemt28.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor28 extends Person28 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor28(String name, int employeeNumber) {
    super(name);
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Name : " + name + '\n' +
              "Salary : " + this.computeSalary();
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudemt28 extends Studemt28 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudemt28(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Studemt28.annualFees * this.year*0.9f;
  }


  }


public class Main28 {
  public static void main(String[] a) {

    Studemt28 s1 = new Studemt28("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudemt28 s2 = new ResearchStudemt28("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor28 p1 = new Professor28("SKC", 100);

    Person28[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person28 [] persons) {
    for (Person28 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

