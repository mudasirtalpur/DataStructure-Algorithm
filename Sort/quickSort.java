package Sort;

public class quickSort{
    public void main(String[] args){
        int[] arr = {3,7,3,1,7,9,6};

        System.out.println("Before Sorting:");
        for(int num : arr)
            System.out.print(num + " ");

        sort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for(int num : arr)
            System.out.print(num + " ");
    }

    public void sort(int[] arr, int low, int high){
        if(low < high){
        int pIndex = pivot(arr, low, high);
        sort(arr, low, pIndex - 1);
        sort(arr, pIndex + 1, high);
        }
    }

    public int pivot(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high - 1)
                i++;
            while(arr[j] > pivot && j >= low + 1)
                j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
    
        return j;
    }
}