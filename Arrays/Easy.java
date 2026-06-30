package Arrays;

import java.util.Arrays;

public class Easy {
    public void main(String[] args){


        int[] arr = {3, 5, 1, 6};
        double avg = getAverage(arr);
        System.out.println("The avg of given is: " + avg);

        // int[] arrX10 = multiplyBy10(arr);
        // System.out.print("Multiplying by 10: ");
        // for(int i : arrX10){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        
        int searchElement = 5;
        int foundOrNot = linearSearch(arr,searchElement);
        if(foundOrNot == -1){
            System.out.println("Target is not Found in orignalArray");
        }
        else{
            System.out.println("Target is Found on index:" + foundOrNot + " in orignalArray");
        }

        int max = findMax(arr);
        System.out.println("The max element in Array: " + max);

        int[] array = {3, -7, 15, -2, 8, 42, -19, 6, -11, 27, 4, -33, 18};
        int[] sum = sumForNegPos(array);//where index 0 is postive while negative
        System.out.println("Sum of +ve: " + sum[0] + ", Sum of -ve: " + sum[1]);

        int[] firstUnSortElement = {0 , 1 , 3 , 5 ,2};
        Integer unSorted = firstUnSorted(firstUnSortElement);
        if(unSorted != null)
            System.out.println("First unsorted element in Array is: " + unSorted);
        else 
            System.out.println("The is no unsorted element in Array");






    }

    double getAverage(int[] arr){
        int sum = 0;
        double size = arr.length;
        for(int i : arr){
            sum += i;
        }
        return sum / size;
    }

    int[] multiplyBy10 (int[] arr){
        int size = arr.length;
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = arr[i] * 10;
        }
        return result;
    }

    int linearSearch(int[] arr, int searchElement){
        int size = arr.length;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] == searchElement)
                return i;
        }
        return -1;
    }

    int findMax(int[] arr){
        int max = 0;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }

    int[] sumForNegPos(int[] arr){
        int neg = 0;
        int pos = 0;
        for(int i : arr){
            if(i > 0)
                pos += i;
            else
                neg -= i;
        }
        int[] sum = {pos, neg};
        return sum;
    }

    Integer firstUnSorted(int[] arr){
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] != sorted[i])
                return arr[i];
        }
        return null;
    }
}