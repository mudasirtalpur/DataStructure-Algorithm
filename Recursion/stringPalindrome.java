package Recursion;

public class stringPalindrome{
    public void main(String[] args){

        String s = "Fire";
        System.out.println(palindrome(s, s.length(), 0));
    }

    boolean palindrome (String string , int n, int i){
        if (i >= n / 2) 
            return true;
        if (string.charAt(i) != string.charAt(n - i - 1))
            return false;
        return palindrome(string, n, i + 1);
    }
}