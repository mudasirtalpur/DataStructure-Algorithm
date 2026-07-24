package Arrays.Easy;

public class palindromeInteger{
    public void main(String[] args){
        int x = 121;
        
        System.out.print("Is Palindrome: " + isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
        while(x > 0){
            y = y * 10 + (x % 10);
            x /= 10;
        }
        if(y == z)
            return true;
        return false;
    }
}