public class Matrix {
    public static void main(String[] args) {
        StdOut.println("Matrix");
    }

    public static double dot(double [] a, double [] b)  {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }

    public static double[][] multiply(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                // calculate c[i][j]
                double sum = 0;

                for (int m = 0; m < a[i].length;) {
                    sum += a[i][m] * b[m][j];
                }
                c[i][j] = sum;
            }
        }

        return c;
    }

    // public static double[] multiply(double[] a, double[] b) {
    //     int m = a.length();
    //     int n = b.length();
    //     double[][] c = new double[x][y];

    //     for (int i = 0; i < m; i++) {
    //             // calculate c[i][j]
    //             double sum = 0;
    //             for (int j = 0; j < a[i].length; j++) {
    //                 sum += a[i][x] * b[x];
    //             }
    //             c[i] = sum;
    //         }
    //         return c;
    //     }

    // public static double [][] transpose(double [][] a) {
    //     int m = a.length;
    //     int n = a[0].length;
    //     double [][] b = new double[m][n];
        
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             b[i][j] = a[j][i];

    //         }
    //     }

    // }

    // public static void [][] transposeInPlace(double [][] a) {
    //     int m = a.length;
    //     int n = a[0].length;
    //     double [][] b = new double[m][n];
        
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             double temp = a[j][i];
    //             a[j][i] = a[j][i];
    //         }
    //     }

    // }
}