class Student15 {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Student15(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public int computeFees () {
    return Student15.annualFees * year;
  }
}

class ResearchStudent15 extends Student15 {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent15(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }
}

class PhDStudent extends ResearchStudent15 {
  private String thesisTitle;
  private static final int annualFees = 10000;

  public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
    super(name, year, researchArea);
    this.thesisTitle = thesisTitle;
  }
}




public class Main15 {
  public static void main(String[] a) {


    Student15 s1 = new Student15("karan", 3);
    System.out.println(s1.getDetails());
    ResearchStudent15 s2 = new ResearchStudent15("siddharth", 4, "Software Engineering");
    System.out.println(s2.getDetails());
    PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");
    System.out.println(s3.getDetails());
  }
}

