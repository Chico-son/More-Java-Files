public class MergeSort {
    public static void sort (int [] a) {
        int [] aux = new int[a.length];
        sort(a, aux, 0, a.length);
    }

    private static void sort(int [] a, int [] aux, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(int [] a, int [] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid;
        for (int k = lo; k < hi; k++) {
            if (i == mid) {
                aux[k] = a[j];
                j++;
            }
            if (j == hi) {
                aux[k] = a[i];
                i++;
            }
            if (a[j] < (a[i])) {
                aux[k] = a[j];
                j++;
            } else {
                aux[k] = a[i];
                i++;
            }
            for (int l = lo; l < hi; l++) {
                a[k] = aux[k];
            }
    }
}

    public static void main(String[] args) {
        int [] a = StdIn.readAllInts();
        sort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i] + " ");
        }
    }
}