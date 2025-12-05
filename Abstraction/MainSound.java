class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
     @Override
    void sound(){
        System.out.println("Meow");
    }
}
class Cow extends Animal{
     @Override
    void sound(){
        System.out.println("Cow sound");
    }
}
public class MainSound {
    public static void main(String[] args) {
    Dog d=new Dog();
    Cat c=new Cat();
    Cow c1=new Cow();
    d.sound();
    c.sound();
    c1.sound();
    }
    
}
