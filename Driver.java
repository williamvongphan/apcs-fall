/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW49 -- Rational Standards Compliance
2021-12-22
time spent: 0.5 hr
*/

/*
DISCO:
  0. Implemented an equals method to compare different objects.
  1. We realized to not compare the rationals using float values because of the inaccurate precision in the datatypes float and double.
  2. Rational and Integer as arguments result in incompatible types error and not ClassCastException error.
  3. The "throw new error" must be the last line of the method or else "unreachable statement" error.
  4. compareTo method does not work for rational with numerator and denominator both negatives.
QCC:
  0. How can you implement a compareTo that works for rationals with the numerator and denominator with both negatives?
*/


public class Driver {

  public static void main(String[] args) {
      Rational test1 = new Rational(-1, 5);
      Rational test2 = new Rational(-1, 2);
      Rational test3 = new Rational(-1, 10);
      Rational test4 = new Rational(1, -5);
      Rational test5 = new Rational(3, 5);
      Rational test6 = new Rational(-2, -3);
      Rational test7 = new Rational(-1, 10);

      System.out.println(test1.compareTo(test4) + " Should be 0");
      System.out.println(test1.compareTo(test2) + " Should be positive");
      System.out.println(test1.compareTo(test3) + " Should be negative");
      System.out.println(test1.compareTo(test5) + " Should be negative");
      System.out.println(test5.compareTo(test6) + " Should be negative");

      System.out.println(test1.equals(test5) + " Should be false");
      System.out.println(test3.equals(test7) + " Should be true");
      System.out.println(test1.equals(test5) + " Should be false");
      System.out.println(test1.equals(10) + " Should be false");
      System.out.println(test1.equals(0.01) + " Should be false");
      System.out.println(test1.equals("false") + " Should be false");

      // throw errors
      //System.out.println(test1.compareTo(10) + " ClassCastException error");
      //System.out.println(test1.compareTo(10) + " ClassCastException error");
      //System.out.println(test1.compareTo(0.01) + " ClassCastException error");
      //System.out.println(test1.compareTo("false") + " ClassCastException error");
  }

}
