package Recursion;

public class printNToOne{
    public void main(String[] args){

        System.out.println("Without BackTracking:");
        NToOne(40);

        System.out.println("With BackTracking:");
        NToOneBackTracking(1, 40);
    }

    void NToOne(int n){
        if(n < 1)
            return;
        System.out.println(n);
        NToOne(n-1);
    }

    void NToOneBackTracking(int i, int n){
        if(i > n)
            return;
        NToOneBackTracking(i+1, n);
        System.out.println(i);
    }
}