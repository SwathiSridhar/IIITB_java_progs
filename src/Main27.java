
class Person27 {
  protected final String name;

  public Person27(String name) {
    this.name = name;

  }

  public String getDetails(){
    return "I have no details to share";
  }

}

class Student27 extends Person27{

  protected int year;

  protected static final int annualFees = 10000;

  public Student27(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student27.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor27 extends Person27 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor27(String name, int employeeNumber) {
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


class ResearchStudent27 extends Student27 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent27(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student27.annualFees * this.year*0.9f;
  }


  }


public class Main27 {
  public static void main(String[] a) {

    Student27 s1 = new Student27("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent27 s2 = new ResearchStudent27("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor27 p1 = new Professor27("SKC", 100);

    Person27[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person27 [] persons) {
    for (Person27 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

