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
  1. Should not compare float values because of the precision in float, while Rational does not have precision.
QCC:
  0.
*/

public class Rational {

    private int _p; // numerator
    private int _q; // denominator

    public Rational () {
        _p = 0;
        _q = 1;
    }

    public Rational (int p, int q) {
        if (q == 0) {
          System.out.println("Invalid denominator detected. Will proceed to set default values.");
          _p = 0;
          _q = 1;
        } else {
          _p = p;
          _q = q;
        }
    }

    public String toString() {
        return _p + "/" + _q;
    }

    public double floatValue() { // double is most precise with 64 bits
        return (double) _p / _q;
    }

    public void multiply (Rational rational) {
        _p = this._p * rational._p;
        _q = this._q * rational._q;
    }

    public void divide (Rational rational) {
      if (rational._p == 0) {
        System.out.println("Error: cannot divide by zero.");
      } else {
        _p = this._p * rational._q;
        _q = this._q * rational._p;
      }
    }

    public int gcd () {
      return gcd (this._p, this._q); // Allows static gcd method to access instance variables
    }

    public static int gcd (int a, int b) {
      if (a == b) {
        return a;
      } else if (a > b) {
        return gcd(a - b, b);
      } else {
        return gcd(b - a, a);
      }
    }

    public void reduce(){
      int gcf = gcd(_p, _q);
      _p /= gcf;
      _q /= gcf;
    }

    public void add(Rational rational) {
      int tempDenom = 0;
      tempDenom = this._q * rational._q;
      _p = this._p * rational._q + this._q * rational._p;
      _q = tempDenom;
    }

    public boolean equals(Object obj) {
      if (obj instanceof Rational) {
        Rational rational = (Rational) obj;
        return rational._p * this._q == rational._q * this._p;
      } else {
        return false;
      }
    }

    public void subtract(Rational rational) {
      int tempDenom = 0;
      tempDenom = this._q * rational._q;
      _p = (this._p * rational._q) - (this._q * rational._p);
      _q = tempDenom;
    }

    public int compareTo(Object obj) {
        Rational rational = (Rational) obj;
        System.out.println(this._p);
        System.out.println(this._q);
        System.out.println(rational._p);
        System.out.println(rational._q);
        int productVal = (this._p * rational._q) - (this._q * rational._p);
        System.out.println(productVal);
        return productVal*this._q*rational._q;
    }


}
