public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am an Animal. My name is "+name;
    }
}

class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nI am actually a tiger.";
    }
}

class Chicken extends Animal implements Edible {
    public Chicken(String name) {
        super(name);
    }
    @Override
    public String howToEat() {
        return "Fried like KFC!";
    }
}
