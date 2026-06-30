package Sort;

public class selectionSort{
    public void main(String[] args){
        int[] arr = {3, -7, 15, -2, 8, 42, -19, 6, -11, 27, 4, -33, 18};
        int size = arr.length;
        int temp;
        int minIndex = -1;

        System.out.println("Befor Sorting:");
        for(int num : arr)
            System.out.print(num + " ");

        for(int i = 0; i < size-1;  i++){
            minIndex = i;
            for(int j = i+1; j < size; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println();

        System.out.println("After Sorting:");
        for(int num : arr)
            System.out.print(num + " ");
    }
}