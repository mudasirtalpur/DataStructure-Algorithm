package Arrays.Easy;

public class gcdOfEvenAndOdd{
    public void main(String[] args){
        int target = 5;

        System.out.print("GCD of " + target + " Odd 7 Even terms is: " + gcd(target));
    }
    
    public int gcd(int n){
        int evenSum = n * (n+1);
        int oddSum = n * n;

        return evenSum - oddSum;
    }
}