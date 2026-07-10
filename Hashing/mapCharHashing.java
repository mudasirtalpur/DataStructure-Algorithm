package Hashing;
import java.util.*;

public class mapCharHashing{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);

        int q = sc.nextInt();
        while(q-- > 0){
            char character = sc.next().charAt(0);
            System.out.println("The character '" + character + "' is repeated " + map.getOrDefault(character, 0) + " times");
        }

        sc.close();
    }
}