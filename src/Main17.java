class Student17 {
  protected final String name;
  protected int year;

  private static final int annualFees = 10000;

  public Student17(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public float computeFees () {
    return Student17.annualFees * year;
  }
  public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent17 extends Student17 {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent17(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;

  }

  @Override
  public String getDetails() {
    return this.name + " is a research student with research area " + this.researchArea + " and he/she is in his/her year " + this.year;
  }
}





public class Main17 {
  public static void main(String[] a) {


    Student17 s1 = new Student17("karan", 2);
    System.out.println(s1.getDetails());
    System.out.println(s1.computeFees());
    ResearchStudent17 s2 = new ResearchStudent17("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());
    System.out.println(s2.computeFees(1000));
  }
}

