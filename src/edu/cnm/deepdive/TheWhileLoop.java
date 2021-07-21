package edu.cnm.deepdive;

public class TheWhileLoop {

  public static void main(String[] args) {
    int spaceOnHDD = 5;

    while (spaceOnHDD > 0) {
      spaceOnHDD--;
      System.out.println("Space on HDD = " + spaceOnHDD);// will start at 4 because it has been
      //decremented in line 9.
    }

//    int x = 2;
//    int y = 5;
//
//    while (x < 10) {
//      y++;
//    }
//    System.out.println("x = " + x + " and y = " + y);//there will be no output because x will always
    //be smaller than 10 and the loop would never end, meaning that the print out statement will never
    // be reached.

    int a = 5;
    int b = 7;

    while (a > 6) {// this will never execute
      b += 2;
      a++;
    }
    a = a > 6? a++ : b--;
    //since a > 6 is false, we will not execute a++ but instead b--. On this moment b = 7 (line 25)
    // a = b-- so a gets the value of b which is 7 and then b gets decremented to 6. Outcome: a = 7, b = 6
    System.out.println("a = " + a + " and b = " + b);
  }
}
