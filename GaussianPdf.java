public class GaussianPdf implements Function {
    public double evaluate(double x) {
        return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
    }
}