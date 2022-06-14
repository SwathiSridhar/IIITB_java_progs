class Student14 {
  private final String name;
  private int year;
  private static final int annualFees = 10000;

  public Student14(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public int computeFees () {

    return Student14.annualFees * year;
  }
}

class ResearchStudent14 extends Student14 {
  private String researchArea;
  public ResearchStudent14(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }
}

public class Main14 {
  public static void main(String[] a) {
    Student14 s1 = new Student14("Sujit", 2);
    System.out.println(s1.getDetails());
    ResearchStudent14 s2 = new ResearchStudent14("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());
  }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Inheriting using extends
  - Initialising the super-class object using 'super' keyword in the sub-class's constructor.
  - The fact that the super-class's methods (e.g. getDetails) are also part of the sub-class.
*/