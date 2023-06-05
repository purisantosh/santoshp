package com.java.week1;

class Animal
{
    void eat()
    {
        System.out.println("Animals Eat");
    }
}
class  herbivores extends Animal
{
    void eat()
    {
        System.out.println("com.java.week1.herbivores Eat Plants");
    }
}
class omnivores extends Animal
{
    void eat() {
        System.out.println("com.java.week1.omnivores Eat meat");
    }
}
class carnivores extends Animal
{
    void eat() {
        System.out.println("com.java.week1.carnivores Eat meat");
    }
}
class Main2
{
    public static void main(String[] args)
    {
        Animal A= new Animal();
        Animal h=new herbivores();
        Animal o=new omnivores();
        Animal c=new carnivores();

        A.eat();
        h.eat();
        o.eat();
        c.eat();

    }
}