package Recursion;

public class factorial{
    int pTotal = 1;
    int fTotal = 1;
    public void main(String[] args){

        System.out.println("Parameterised:");
        factorialParameterised(0);

        System.out.println("Functional:\n" + factorialFunctional(5));
    }

    void factorialParameterised(int n){
        if(n == 0){
            System.out.println(pTotal);
            return;
        }
        pTotal *= n;
        factorialParameterised(n-1);
    }

    int factorialFunctional(int n){
        if(n == 0)
            return fTotal;
        return n * factorialFunctional(n-1);
    }
}