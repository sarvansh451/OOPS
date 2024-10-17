class Apple{
    public void eat()
    {
        System.out.println("i am in class A");
    }
}
class Banana extends Apple{
    public void run()
    {
         System.out.println("i am in class B");
    }
}
class Cherry extends Apple{
    public void yes()
    {
     System.out.println("i am in class C");
    }
}
class Fruits{
    public static void main(String[] args) {
        Cherry c= new Cherry();
        Banana d=new Banana();
        c.yes();
        c.eat();
        d.eat();
        d.run();
    }
}