public class Charge {
    // **Instance fields are unique to each instance */
    private final double rx;
    private final double ry;
    private final double q;

    // **Constructor */
    public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }
    // **Constructor */
    public Charge() {
        rx = 0;
        ry = 0;
        q = 1.0;
    }
    // **innstance method */
    //** (double x, double y) is a parameter */
    public double potentialAt(double x, double y) {
        // ** k, dx, dy are local variables */
        double k = 8.99e09;
        // ** rx and ry are instance variables */
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }
    //** instance method */
    public String toString() {
        return q + " at ( " + rx + ", " + ry + ")";
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        // ** instansce of Charge class */
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        StdOut.println(c1);
        StdOut.println(c2);
        // ** instance method called on instance */
        double v1 = c1.potentialAt(x, y);
        double v2 = c2.potentialAt(x, y);
        StdOut.printf("%.2e\n", (v1));
        StdOut.printf("%.2e\n", (v2));
    }
}