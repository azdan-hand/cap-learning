package day_2.java_multiplecallmethods;

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// Outputs:
// I just got executed!
// I just got executed!
// I just got executed!