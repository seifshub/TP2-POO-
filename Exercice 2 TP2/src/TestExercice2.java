public class TestExercice2 {
    public static void main(String[] args) {
        Fly fly = new Fly();
        NoFly nofly = new NoFly();
        Quack quack = new Quack();
        NoQuack noquack= new NoQuack();
        MallardDisplay md= new MallardDisplay();
        DecoyDisplay dd= new DecoyDisplay();
        RubberDisplay rd= new RubberDisplay();
        RedHeadDisplay rhd= new RedHeadDisplay();

        Duck mallard= new Duck(fly,quack, md);
        Duck decoy= new Duck(nofly,noquack,dd);
        Duck rubber= new Duck(nofly,quack,rd);
        Duck redhead= new Duck(fly,quack,rhd);


        mallard.display();
        mallard.quack();
        mallard.fly();
        System.out.println("----------------------");
        redhead.display();
        redhead.quack();
        redhead.fly();
        System.out.println("----------------------");
        rubber.display();
        rubber.quack();
        System.out.println("----------------------");
        decoy.display();
    }
}