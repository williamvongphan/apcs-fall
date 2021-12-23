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

public class Rational implements Comparable {

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
      if (obj instanceof Rational) {
        Rational rational = (Rational) obj;
        return this._p * rational._q - this._q * rational._p;
      }
      throw new ClassCastException("\ncompareTo() input not a Rational");
    }

}
