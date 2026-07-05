package Sort;

import java.util.Random;

public class practice{
    public void main(String[] args){
        int[] arr = new int[100];
        for(int i = 0; i < 100 ; i++){
            Random rn = new Random();
            arr[i] = rn.nextInt(1000);
        }
        System.out.print("Before sorting: ");
        for(int num : arr)
            System.out.print(num + " ");


        for(int i = 0; i < arr.length - 2; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("\nAfter sorting: ");
        for(int num : arr)
            System.out.print(num + " ");
    }
}