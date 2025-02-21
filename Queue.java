public class Queue<T> implements Iterator<T> {
    private Node first;
    private Node second;

    private class Node {
        private T item;
        private Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T item) {
        Node oldSecond = second;
        second = new Node();
        second.item = item;
        second.next = null;
        if (isEmpty()) first = second;
        else oldSecond.next = second;
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) second = null;
        return item;
    }

    public static void main(String[] args) {
        Queue<Integer>  ints = new Queue<>();
        ints.enqueue(1);
        ints.enqueue(2);
        ints.enqueue(3);
        while(!ints.isEmpty()) {
            System.out.println(ints.dequeue());
        }
        Queue<String> strings = new Queue<>();
        strings.enqueue("1");
        strings.enqueue("hello");
        strings.enqueue("world");

        while(!strings.isEmpty()) {
            System.out.println(strings.dequeue());
        }

        Queue<Animal> animals = new Queue<>();
        animals.enqueue(new Cat("Brown", "Roadhouse"));
        animals.enqueue(new Cat("Black", "Bub"));
        animals.enqueue(new Cat("Gray", "Pickles"));

        while(!animals.isEmpty()) {
            System.out.println(animals.dequeue());
        }
    }
}
