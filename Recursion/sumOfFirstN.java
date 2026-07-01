package Recursion;

public class sumOfFirstN{
    public void main(String[] args){

        System.out.println("Parameterised:");
        sumParameterised(10, 0);

        System.out.println("Fucntional:\n" + sumFunctional(10));
    }

    void sumParameterised(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumParameterised(n-1, sum+n);
    }

    int sumFunctional(int n){
        if(n == 0)
            return 0;
        return n + sumFunctional(n-1);
    }
}