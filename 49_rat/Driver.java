/*
JWJ (Jefford Shau, Willaim Vongphanith, Jacob Kirmayer)
APCS
HW49 -- Rational Standards Compliance
2021-12-22
*/

/*
DISCO:
  0.
QCC:
  0.
*/


public class Driver {


  public static void main(String[] args) {
      Rational rat = new Rational(1, 2);
      Rational rate = new Rational(3, 5);
      Rational ratio = new Rational(10, 13);
      Rational improper = new Rational (3, 1);
      Rational racket = new Rational(1, 2);
      Rational sub1 = new Rational(4, 5);
      Rational sub2 = new Rational(2, 3);
      Integer rations = new Integer(5);

      System.out.println(rat.floatValue() + " Should be 0.5");
      System.out.println(rat.toString() + " Should be 1/2");
      rat.multiply(rate);
      System.out.println(rat.toString() + " Should be 3/10");
      ratio.divide(improper);
      System.out.println(ratio.toString() + " Should be 10/26");
      System.out.println(ratio.gcd() + " Should be 2");
      ratio.reduce();
      System.out.println(ratio.toString() + " Should be 10/39");
      rate.add(sub2);
      System.out.println(rate.toString() + " Should be 19/15");
      sub1.subtract(sub2);
      System.out.println(sub1.toString() + " Should be 2/15");
      System.out.println(rate.compareTo(improper) + " Should be negative");
      System.out.println(rate.compareTo(sub2) + " Should be positive");
      System.out.println(rate.equals(rat) + " Should be false");
  }

}
