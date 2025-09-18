package catExercise;

public class App {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Tom";
        myCat.age = 7;
        myCat.livesRemaining = 2;


        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());

    }

}
