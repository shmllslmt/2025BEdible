public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Eat in my mouth.";
    }
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Eat like apple pie.";
    }
}

class Orange extends Fruit {

}
