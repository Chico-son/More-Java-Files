public class Complex {
    private final int re;
    private final int im;

    public Complex(int real, int imag) {
        re = real;
        im = imag;
        
    }

    public Complex plus(Complex b) {
        int real = re + b.re;
        int imag = im + b.im;
        return new Complex(real, imag);
    }

    public Complex times (Complex b) {
        int real = re * b.re - im * b.im;
        int imag = re * b.im + im * b.re;
        return new Complex(real, imag);
    }

    public String toString () {
        if (im == 1) {
            return re + " + i";
        } else {
            return re + " + " + im + "i";
        }
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 1);
        Complex z = a;
        StdOut.println(a);
        StdOut.println(z);

        z = z.times(z).plus(a);
        StdOut.println(a);
        StdOut.println(z);
        z = z.times(z).plus(a);
        StdOut.println(a);
        StdOut.println(z);
    }
}