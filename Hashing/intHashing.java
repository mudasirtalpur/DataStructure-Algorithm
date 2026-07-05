package Hashing;

import java.util.Scanner;

public class intHashing{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] hash = new int[13];
        for(int i =0; i < n; i++)
            hash[arr[i]] += 1;

        int q = 0;
        q = sc.nextInt();
        while(q-1 > 0){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    sc.close();
    }
}