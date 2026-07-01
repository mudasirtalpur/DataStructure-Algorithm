package Sort;

public class insertionSort{
    public void main(String[] args){
        int[] arr = {3, -7, 15, -2, 8, 42, -19, 6, -11, 27, 4, -33, 18};
        int size = arr.length;
        int key;

        for(int i = 1; i < size; i++){
            key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int num : arr)
            System.out.print(num + " ");
    }
}