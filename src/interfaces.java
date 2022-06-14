
interface Person {
   public abstract String getDetails();
   public abstract float computeSalary();
}

class Studenti implements Person{
  protected final int rollNumber;
  protected int year;

  protected static final int annualFees = 10000;
  protected static final int annualSalary = 15000;

  public Studenti(int rollNumber, int year) {
    this.rollNumber = rollNumber;
    this.year = year;
  }


  public String getDetails() {
    return "Roll Number : " + rollNumber + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Studenti.annualFees * year;
  }

  public float computeFees(int annualFees){
    return Studenti.annualFees * this.year;
  }

  public float computeSalary() {
    return Studenti.annualSalary * this.year;
  }
}

class Professor implements Person {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Employee Number : " + this.employeeNumber;
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudenti extends Studenti {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudenti(int rollNumber, int year, String researchArea) {
    super(rollNumber, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Studenti.annualFees * this.year*0.9f;
  }


  }


public class interfaces {
  public static void main(String[] a) {

    Studenti s1 = new Studenti(200, 2);
    //System.out.println(s1.getDetails());

    ResearchStudenti s2 = new ResearchStudenti(300, 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor p1 = new Professor(100);

    Person[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person [] persons) {
    for (Person person: persons) {
      System.out.println(person.getDetails());
      System.out.println("Salary: " + person.computeSalary());
    }
  }


}

