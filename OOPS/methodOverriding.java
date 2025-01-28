package OOPS;
public class methodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        d.type();
        a.type();
    }
}

class Animal{
    void type(){
        System.out.println("Cat");
    }
}

class Dog extends Animal{
    @Override
    void type(){
        System.out.println("Dog");
    }
}