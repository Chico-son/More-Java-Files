public class TenPerLine {
    public static void main(String[] args) {
        int count = 0;
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            StdOut.print(value + "\t");
            count++;
            if (count % 10 == 0) {
                StdOut.println();
            }
        }
    }
}