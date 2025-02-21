package Feb21;

public class inheritance2 {
    public static void main(String[] args) {
        Java1234 c = new Java1234();
        c.run();//run() is inherited from Java123
        c.ask();//ask() is inherited from Java123
        c.speak();//speak() is inherited from Java123
        c.bark();
    }    
}
 class Java123{
    public void run(){
        System.out.println("Running");
    }
    public void ask(){
        System.out.println("Asking");
    }
    public void speak(){
        System.out.println("Speaking");
    }
 }
    class Java1234 extends Java123{
        public void bark(){
            System.out.println("Barking");
        }
    }