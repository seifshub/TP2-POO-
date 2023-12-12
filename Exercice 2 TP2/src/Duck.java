public class Duck {
    QuackBehaviour qb;
    FlyBehaviour fb;
    DisplayBehaviour db;

    public Duck(FlyBehaviour fb, QuackBehaviour qb,DisplayBehaviour db)
    {
        this.qb=qb;
        this.fb=fb;
        this.db=db;
    }
    public void display()
    {
        this.db.display();
    }
    public void fly()
    {
        this.fb.fly();
    }
    public void quack()
    {
        this.qb.quack();
    }

    public void swim()
    {
        {
            System.out.println("swimming...");
        }
    }
}
