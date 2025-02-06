public class Counter {
    private String name;
    private int maxCount;
    private int count;

    public Counter(String id, int max, int count) {
        name = id;
        maxCount = max;
        this.count = 0;
    }

    public void increment() {
        if ( count < maxCount ) {
            count++;
    
        }   
    }

    public int getValue() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }
}