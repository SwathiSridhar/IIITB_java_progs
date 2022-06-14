class Student23 {
  protected final String name;
  protected int year;

  private static final int annualFees = 10000;

  public Student23(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  public int computeFees() {
    return Student23.annualFees * year;
  }
}

class ResearchStudent23 extends Student23 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent23(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  public String getDetails() {
      return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
  }


class PhDStudent23 extends ResearchStudent23 {
  private String thesisTitle;
  private static final int annualFees = 10000;

  public PhDStudent23(String name, int year, String researchArea, String thesisTitle) {
    super(name, year, researchArea);
    this.thesisTitle = thesisTitle;
  }

  public String getDetails() {
      return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
    }
  }




public class Main23 {
  public static void main(String[] a) {

    Student23 s1 = new Student23("karan", 3);
//    System.out.println(s1.getDetails());

    ResearchStudent23 s2 = new ResearchStudent23("siddharth", 4, "Software Engineering");
//    System.out.println(s2.getDetails());

    PhDStudent23 s3 = new PhDStudent23("hari", 1, "Software Engineering", "Automated Evaluation");
//    System.out.println(s3.getDetails());

    Student23[] array = {s1, s2, s3};
    printDetails(array);


  }

  public static void printDetails (Student23 [] students)
  {for (Student23 student: students){
    System.out.println(student.getDetails());
    }
  }
}

