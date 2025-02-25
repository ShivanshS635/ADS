package Feb25;

class methodOverriding{
    public static void main(String[] args) {
        //DEF d = new ABC(); wrong
        ABC a = new DEF();

        a.run();
        a.talk();
    }
}

class ABC{
    void talk(){
        System.out.println("Talking");
    }
    void run(){
        System.out.println("Running");
    }
}

class DEF extends ABC{
    void talk(){
        System.out.println("Not Talking");
    }
    void run(){
        System.out.println("Not Running");
    }
}