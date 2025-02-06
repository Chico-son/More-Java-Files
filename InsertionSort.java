public class InsertionSort {
    public static void main(String[] args) {
        String[] array = {"chores fruit", "date", "cherry", "plum", "elderberry", "apple", "orange", " preserves ",};
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sort(array);

        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
    public static void sort(String[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1].compareTo(a[j]) > 0) {
                    String temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}