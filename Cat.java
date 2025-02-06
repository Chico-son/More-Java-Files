public class Cat extends Animal implements Comparable<Cat>, Function {
    private String color;

    public Cat(String color, String name) {
        super(name);
        this.color = color;
    }

    public String makeNoise() {
        return "Meow";
    }

    public int compareTo(Cat o) {
        if (o instanceof Cat) {
            Cat c = (Cat) o;
            return this.color.compareTo(c.color);

        } else {
            return 0;
        }
    }

    public double evaluate(double x) {
        return x * x;
    }
}