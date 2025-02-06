public class OrGrowth {
    public static void main(String[] args) {
        
    }

    public static int add(int n, int c) {
        return n + c;
    }

    public static double average(int [] a) {
        int n = a.length;
        double count = 0;
        for (int i = 0; i < n; i++) {
            count += a[i];
        }
        return count / n;
    }


}