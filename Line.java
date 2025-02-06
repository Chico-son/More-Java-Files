public class Line implements Function {
    double m;
    double b;

    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    public double evaluate(double x) {
        return m * x + b;
    }
}