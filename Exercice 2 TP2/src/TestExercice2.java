public class TestExercice2 {
    public static void main(String[] args) {
        MallardDuck mallard= new MallardDuck();
        DecoyDuck decoy= new DecoyDuck();
        RubberDuck rubber= new RubberDuck();
        RedHeadDuck redhead= new RedHeadDuck();

        mallard.display();
        mallard.quack();
        mallard.fly();
        redhead.display();
        redhead.quack();
        redhead.fly();
        rubber.display();
        rubber.quack();
        decoy.display();
        decoy.swim();
    }
}