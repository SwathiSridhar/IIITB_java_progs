class Student19 {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Student19(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public int computeFees () {
    return Student19.annualFees * year;
  }
}

class ResearchStudent19 extends Student19 {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent19(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;

  }

  @Override
  public String getDetails() {
    return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
  }
}





public class Main19 {
  public static void main(String[] a) {


    Student19 s1 = new Student19("karan", 3);
    System.out.println(s1.getDetails());
    ResearchStudent19 s2 = new ResearchStudent19("siddharth", 4, "Software Engineering");
    System.out.println(s2.getDetails());
  }
}

