
class Person2 {
  protected final String name;

  public Person2(String name) {
    this.name = name;

  }

  public String getDetails(){
    return "I have no details to share";
  }

}

class Student26 extends Person2{

  protected int year;

  protected static final int annualFees = 10000;

  public Student26(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student26.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor2 extends Person2 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor2(String name, int employeeNumber){
    super(name);
    this.employeeNumber = employeeNumber;

  }

}


class ResearchStudent26 extends Student26 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent26(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student26.annualFees * this.year*0.9f;
  }


  }


public class Main26 {
  public static void main(String[] a) {

    Student26 s1 = new Student26("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent26 s2 = new ResearchStudent26("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor2 p1 = new Professor2("SKC", 100);

    Person2[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person2 [] persons) {
    for (Person2 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

