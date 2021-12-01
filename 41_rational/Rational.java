public class Rational {

    int _p;
    int _q;

    public Rational () {
        _p = 1;
        _q = 1;
    }

    public Rational (int p, int q) {
        _p = p;
        _q = q;
    }

    public float floatValue() {
        return (float) _p / _q;
    }

    public String toString() {
        return _p + "/" + _q;
    }

    public void multiply (Rational rational) {
        _p = _p * rational._p;
        _q = _q * rational._q;
    }

    public void divide (Rational rational) {
        _p = _p * rational._q;
        _q = _q * rational._p;
    }

    public static void main(String[] args) {
        Rational rat = new Rational(3, 5);
        Rational rate = new Rational(7, 4);
        Rational ratio = new Rational(10, 13);

        System.out.println(rat.floatValue());
        System.out.println(rat.toString());
        rat.multiply(rate);
        System.out.println(rat.toString());
        rat.divide(ratio);
        System.out.println(rat.toString());
    }

}