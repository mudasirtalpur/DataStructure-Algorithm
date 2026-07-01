package Recursion;

public class reverseArray{
    public void main(String[] args){
        int[] arr = {3, -7, 15, -2, 8, 42, -19, 6};

        reverse(arr, arr.length, 0);
        for(int num: arr)
            System.out.print(num + " ");
        

    }

    void reverse(int[] arr, int n, int i){
        if (i == n/2)
            return;
        arr[i] = arr[i] ^ arr[n-i-1];
        arr[n-i-1] = arr[i] ^ arr[n-i-1];
        arr[i] = arr[i] ^ arr[n-i-1];

        reverse(arr, n, i+1);
    }
}