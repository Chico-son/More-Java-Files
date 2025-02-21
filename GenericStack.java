public class GenericStack<T> {
    private Node first;

    private class Node {
        private T item;
        private Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;

    }

    public T pop() {
        T item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        GenericStack<Integer>  ints = new GenericStack<>();
        ints.push(1);
        ints.push(2);
        ints.push(3);
        while(!ints.isEmpty()) {
            System.out.println(ints.pop());
        }
        GenericStack<String> strings = new GenericStack<>();
        strings.push("1");
        strings.push("hello");
        strings.push("world");

        while(!strings.isEmpty()) {
            System.out.println(strings.pop());
        }

        GenericStack<Animal> animals = new GenericStack<>();
        animals.push(new Cat("Brown", "Roadhouse"));
        animals.push(new Cat("Black", "Bub"));
        animals.push(new Cat("Gray", "Pickles"));

        while(!animals.isEmpty()) {
            System.out.println(animals.pop());
        }
    }
}