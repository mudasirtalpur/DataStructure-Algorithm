package Hashing;
import java.util.*;

public class mapIntHashing{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        int q = sc.nextInt();
        while(q-- > 0){
            int number = sc.nextInt();
            System.out.println("The number " + number + ": is repeated " + map.getOrDefault(number , 0) + " times");
        }

        sc.close();
    }
}