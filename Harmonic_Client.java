public class Harmonic_Client{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            int arg = Integer.parseInt(args[i]);
            double value = Harmonic.harmonic(arg);
            StdOut.println(value);
            StdOut.println(JavaMath.hypotenuse(value, value + 3));
        }
    }
}
