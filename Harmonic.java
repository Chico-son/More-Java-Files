public class Harmonic{
    public static double harmonic(int n ) {
        double sum = 0.0;
        for (int k = 1; k <= n; k++){
            sum += 1.0 / k;
        }
        return sum;        
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
        
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            int arg = Integer.parseInt(args[i]);
            double value = harmonic(arg);
            StdOut.println(value);
        }
    }
}