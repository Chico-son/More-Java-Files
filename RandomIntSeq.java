public class RandomIntSeq{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            int c = (int) (Math.random() * m);
            StdOut.print(c + " ");
        }
    }
}