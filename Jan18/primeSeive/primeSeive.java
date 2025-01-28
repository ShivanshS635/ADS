package Jan18.primeSeive;

import java.util.Scanner;

public class primeSeive {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        int N = sin.nextInt();
        seive(N);

        int L = sin.nextInt();
        int R = sin.nextInt();

        System.out.println("The Count Of Primes From " + L +" To " + R + " = " + countLimit(L, R));
    }

    public static void seive(int N){
        boolean[] isPrime = new boolean[N+1];

        for(int i = 0 ; i <= N ; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int p = 2 ; p*p <= N ; p++){
            if(isPrime[p]){
                for(int i = p*p ; i <= N ; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        System.out.println("The Prime Numbers Upto " + N + " : ");

        for(int i = 2 ; i <= N ; i++){
            if(isPrime[i]) System.out.print(i + " ");
        }
    }

    public static int countLimit(int L , int R){
        boolean[] isPrime = new boolean[R+1];

        for(int i = 0 ; i <= R ; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int p = 2 ; p*p <= R ; p++){
            if(isPrime[p]){
                for(int i = p*p ; i <= R ; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        int ctr = 0;

        for(int i = L ; i <= R ; i++){
            if(isPrime[i]) ctr++;
        }

        return ctr;
    }
}