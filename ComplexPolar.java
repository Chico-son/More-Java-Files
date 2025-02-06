public class ComplexPolar {
    private final double r;
    private final double theta;

    public ComplexPolar(double real, double imag) {
        r = Math.sqrt(real*real + imag*imag);
        theta = Math.atan2(imag, real);
    }

    public ComplexPolar plus(ComplexPolar b) {
        double real = this.re() + b.re();
        double imag = im() + b.im();
        return new ComplexPolar(real, imag);
    }

    public ComplexPolar(double radius, double angle, boolean complex) {
        r = radius;
        theta = angle;
    }

    public ComplexPolar times(ComplexPolar b) {
        double radius = r * b.r;
        double angle = theta + b.theta;
        return new ComplexPolar(radius, angle, true);
    }

    public double abs() {
        return r;
    }

    public double re() {
        return r * Math.cos(theta);
    }

    public double im() {
        return r * Math.sin(theta);
    }
}