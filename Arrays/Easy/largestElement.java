package Arrays.Easy;

public class largestElement{
    public void main(String[] args){
        int[] nums = {3, 9, 2, 10, 103};
        int largestElement = findLargestElement(nums);
        System.out.print("The Largest in given Array is: " + largestElement);
    }

    public int findLargestElement(int[] arr){
        int largestIndex = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > arr[largestIndex])
                largestIndex = i;
        
        return arr[largestIndex];
    }
}