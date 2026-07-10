package Arrays.Easy;

public class secondLargestElement{

    public void main(String[] args){
        int[] nums = {24, 2, 8, 9, 23, 7};
        int largest = 0;
        int secondLargest = 0;

        for(int i = 0; i < nums.length; i++)
            if(nums[i] > largest)
                largest = nums[i];

        for(int i = 0; i < nums.length; i++)
            if(nums[i] > secondLargest && nums[i] < largest)
                secondLargest = nums[i];
        
        System.out.print("The second largest element is: " + secondLargest);
    }
}