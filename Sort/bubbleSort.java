package Sort;

public class bubbleSort {
    public void main(String[] args){
        int[] arr = {3, -7, 15, -2, 8, 42, -19, 6, -11, 27, 4, -33, 18};
        int temp;
        int size = arr.length;

        System.out.println("Befor Sorting:");
        for(int num : arr)
            System.out.print(num + " ");

        System.out.println();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Sorting:");
        for(int num : arr)
            System.out.print(num + " ");
        
        System.out.println();

    }

}