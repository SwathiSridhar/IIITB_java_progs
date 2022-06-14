class Studentm {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Studentm(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public float computeFees () {
    return Studentm.annualFees * year;
  }
  public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudentm extends Studentm {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudentm(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;

  }

  @Override
  public String getDetails() {
    return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
  }
}





public class method_overloading {
  public static void main(String[] a) {


    Studentm s1 = new Studentm("karan", 2);
    System.out.println(s1.getDetails());
    System.out.println(s1.computeFees());
    ResearchStudentm s2 = new ResearchStudentm("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());
    System.out.println(s2.computeFees(1000));
  }
}

