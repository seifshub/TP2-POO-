public class MallardDuck extends Duck implements Quackable,Flyable{
    public void display()
    {
        System.out.println("Im a mallard duck");
    }
    public void quack()
    {
        System.out.println("mallard duck quacks!");
    }
    public void fly()
    {
        System.out.println("mallard duck flies!");
    }



}
