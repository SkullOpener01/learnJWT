package com.volkmatrix.learnjwt;

public class test {

  public static void main(String[] args) {
//    fibonachiPiramid();
    testTryCatch();
  }

  private static void fibonachiPiramid() {
    int rows = 8;
    int a = 0, b = 1;


    for (int i = 0; i < rows ; i++) {
      int tempA = a;
      int tempB = b;

      for (int j = i; j < rows ; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(tempA + " ");
        int next = tempA + tempB;
        tempA = tempB;
        tempB = next;
      }
      System.out.println();

    }
  }

  public static  void testTryCatch(){
    try {
      int  a = 1;
      int  b = 0;

      int answer = a / b;
      System.out.println("answer = " + answer);
    }catch (ArithmeticException e){
      System.out.println("Arithmetic exception caught");
    }catch (Exception e){
      System.out.println("Exception caught");
    }
  }
}
