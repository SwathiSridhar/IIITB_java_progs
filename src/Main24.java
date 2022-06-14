class Student24 {
  protected final String name;
  protected int year;

  protected static final int annualFees = 10000;

  public Student24(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student24.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }

}

class ResearchStudent24 extends Student24 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent24(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student24.annualFees * this.year*0.9f;
  }


  }


public class Main24 {
  public static void main(String[] a) {

    Student24 s1 = new Student24("karan", 3);
    System.out.println(s1.getDetails());

    ResearchStudent24 s2 = new ResearchStudent24("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());


  }


}

