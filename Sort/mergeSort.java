package Sort;

import java.util.*;

public class mergeSort{
    public void main(String[] args){

        int[] arr = {3,6,2,7,1};
        division(arr, 0, arr.length - 1);

        for(int num : arr)
            System.out.print(num + " ");

    }

    public void division(int[] arr, int low, int high){
        if(low >= high)
            return;
        int mid = (low + high) / 2;
        division(arr, low , mid);
        division(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
            }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
}