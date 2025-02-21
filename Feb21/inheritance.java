package Feb21;

public class inheritance{
    public static void main(String[] args) {
        parent c = new parent();
        c.display();
        c.setName("Rahul");//name is private but can be accessed using setter and getter
        c.setAge(20);//age is private but can be accessed using setter and getter
        System.out.println("Name: "+c.getName());
        System.out.println("Age: "+c.getAge());
    }
}

class parent{
    private String name;
    private int age;
    public void display(){
        System.out.println("Parent class");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}