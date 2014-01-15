
public class Complex {

    private double a, b;

    public Complex(double a) {
        this(a, 0.0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public Complex add(Complex other) {
        return new Complex(a + other.a, b + other.b);
    }

    public Complex add(double n) {
        return new Complex(a + n, b);
    }

    public Complex multiply(Complex other) {
        double c = other.a, d = other.b;
        return new Complex(a * c - b * d, a * d + b * c);
    }

    public Complex multiply(double n) {
        return new Complex(a * n, b * n);
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

}
