package Hashing;
import java.util.Scanner;

public class charHashing{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] hash = new int[256];
        for(int i = 0; i < s.length(); i++)
            hash[s.charAt(i)] += 1;

        int q = sc.nextInt();
        while(q-- > 0){
            int character = sc.next().charAt(0);
            System.out.println("Number of times '" + (char) character + "' is repeated is: " + hash[character]);
        }

        sc.close();
    }
}