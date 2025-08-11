public class Main {
    public static void main(String[] args) {
        Animal animal = new Tiger("Seira");

        System.out.println(animal);

        Animal chicky = new Chicken("Yi Yi");
        System.out.println(chicky);
        // explicit casting
        System.out.println(((Chicken)chicky).howToEat());

        Chicken chick = new Chicken("Cong Cong");
        System.out.println(chick.howToEat());

        Fruit fruit = new Fruit();
        Fruit apple = new Apple();

        System.out.println(apple.howToEat());

    }
}