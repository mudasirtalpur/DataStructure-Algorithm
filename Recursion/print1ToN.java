package Recursion;
public class print1ToN{
    public void main(String[] args){

        System.out.println("Without BackTracking:");
        OneToN(1, 40);

        System.out.println("With BackTracking:");
        OneToNBackTracking(40);

    }
    void OneToN(int i, int n){
        if(i > n)
            return;
        System.out.println(i);
        OneToN(i+1 , n);
    }

    void OneToNBackTracking(int n){
        if(n < 1)
            return;
        OneToNBackTracking(n-1);
        System.out.println(n);
    }
}