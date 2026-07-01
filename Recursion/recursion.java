package Recursion;

public class recursion {
    int i = 1;
    public void main(String[] args){


        print1ToN(3);

        sumOfFirstN(10 , 0);//Parameterused

        System.out.println(sumOfFirstN(10));//Functional recursion

    }

    //1 to N with backtracking
    void print1ToN(int n){
        if(n < 1)
            return;
        print1ToN(n-1);
        System.out.println(n);

    }

    void sumOfFirstN(int n , int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumOfFirstN(n-1 , sum + n);
    }

    int sumOfFirstN(int n){
        if(n == 0)
            return 0;
        return n + sumOfFirstN(n-1);
    }

}