public class FunctionClient {
    public static double integration(Function f, double a, double b, int n) {
        double delta = (b - a) / n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += delta * f.evaluate(a + delta * (i + 0.5));
        }
        return sum;
    }

    public static void main(String[] args) {
        Function sq = new Square();
        Function gp = new GaussianPdf();
        // 
        Function L1 = new Line(1,0);
        Function L2 = new Line(2,1);

        System.out.println(integration(sq, 0, 1, 20));
        System.out.println(integration(gp, 0, 1, 20));
        //
        System.out.println(integration(L1, 0, 1, 20));
        System.out.println(integration(L2, 0, 1, 20));
    }
}