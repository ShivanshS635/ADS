package Feb10.towerOfHanoie;

public class towerOfHanoie {
    public static void solve(int n , char src , char aux , char dest){
        if(n==1){
            System.out.println("Move 1 from "+src+" to "+dest);
            return;
        }
        solve(n-1,src,dest,aux);
        System.out.println("Move "+n+" from "+src+" to "+dest);
        solve(n-1,aux,src,dest);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n,'A','B','C');
    }
}
