public class ArrayStackofStrings {
    private String [] items;
    private int n = 0;

    public ArrayStackofStrings() {
        items = new String[10];
    }

    public ArrayStackofStrings(int cap) {
        items = new String[cap];
    }

    private void resize(int cap) {
        String [] newitems = new String[cap];
        for (int i = 0; i < items.length && i < newitems.length; i++) {
            newitems[i] = items[i];
        }
        items = newitems;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(String item) {
        if (n == items.length) {
            resize(items.length * 2);
        }
        items[n] = item;
        n++;
    }

    public String pop() {
        String poppedItem = items[n];
        items[n] = null;
        n--;
        return poppedItem;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += items[i] + " ";
        }

        return str;
    }
}