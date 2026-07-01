package Recursion;

public class fibonacci{
    public void main(String[] args){

        int nth = 4;
        System.out.println("The " + nth + " term of Fibonacci number is: " + getFibonacci(nth));

    }

    int getFibonacci(int n){
        if(n <= 1)
            return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}