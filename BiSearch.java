public class BiSearch {
    public static void main(String[] args) {
        int [] UsrInp = StdIn.readAllInts();
        System.out.print(binarySearch(UsrInp, 100));
    }

    public static int binarySearch(int [] a, int item) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = (hi - lo) / 2;

        while (lo <= hi) {

            if (a[mid] == item) {
                return mid;
            } else if (a[mid] > item) {
                return mid - 1;
            } else {
                lo = mid + 1;
            }
            mid = (hi + lo) / 2;
        }
        return -1;
    }

    public static int binarySearch(String key, String [] a) {
        return binarySearch(key, a, 0, a.length);
    }

    private static int binarySearch(String key, String [] a, int lo, int hi) {
        if (hi <= lo) {
            return -1;
        }
        int mid = (hi + lo) / 2;
        int cmp = a[mid].compareTo(key);

        if (cmp < 0) {
            return binarySearch(key, a, lo, mid - 1);
        } else if (cmp > 0) {
            return binarySearch(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    
    }
}
