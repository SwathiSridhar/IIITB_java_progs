class Student18 {
  private final String name;
  private int year;
  private BankAccount bankAccount;

  private static final int annualFees = 10000;

  public Student18(String name, int year, BankAccount bankAccount) {
    this.name       = name;
    this.year       = year;
    this.bankAccount = bankAccount;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public int computeFees () {
    return Student18.annualFees * year;
  }
}

class ResearchStudent18 extends Student18 {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent18(String name, int year, String researchArea, BankAccount bankAccount) {
    super(name, year, bankAccount);
    this.researchArea = researchArea;
  }
}

class PhDStudent18 extends ResearchStudent18 {
  private String thesisTitle;
  private static final int annualFees = 10000;

  public PhDStudent18(String name, int year, String researchArea, String thesisTitle, BankAccount bankAccount) {
    super(name, year, researchArea, bankAccount);
    this.thesisTitle = thesisTitle;
  }
}

class BankAccount{
  private int accountNumber;
  private int balance;

  public BankAccount(int accountNumber, int balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

}

public class Main18 {
  public static void main(String[] a) {

    BankAccount account1 = new BankAccount(111,1000);
    BankAccount account2 = new BankAccount(222,2000);
    BankAccount account3 = new BankAccount(333,3000);

    Student18 s1 = new Student18("karan", 3, account1);
    System.out.println(s1.getDetails());
    ResearchStudent18 s2 = new ResearchStudent18("siddharth", 4, "Software Engineering", account2);
    System.out.println(s2.getDetails());
    PhDStudent18 s3 = new PhDStudent18("hari", 1, "Software Engineering", "Automated Evaluation", account3);
    System.out.println(s3.getDetails());
  }
}

