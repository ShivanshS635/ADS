package OOPS;
public class methodOverloading {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println(num.sum(4 , 6));
        System.out.println(num.sum(1.5f , 3.5f)); 
    }
}
class Numbers{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
}