public class BinaryRep {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while(power < n/2) { 
           power *= 2;
        }
        System.out.println(BinaryRecursive(n, power));
    }

    public static int BinaryRecursive(int n, int power) {
        if (n == 0) {
            return 0;
        }
        if (n < power) {
            return BinaryRecursive(n, power / 2);
        }
        return 1 + BinaryRecursive(n - power, power / 2);
    
    }
}