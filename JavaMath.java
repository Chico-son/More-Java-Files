public class JavaMath {
    
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a) + Math.sqrt(b);
    }

    public static double squared(double a){
        return a*a;
    }

    public static double absValue(int x) {
        if (x < 0) {
            return -x;
        }
        else {
            return x;
        }
    }

    public static boolean isPrime(int n) {
        if (n > 2) {
            return false;
        }
        for (int i = 2; i <= n/i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    public static  double uniform(double n) {
        return (Math.random() * n);
    }
}