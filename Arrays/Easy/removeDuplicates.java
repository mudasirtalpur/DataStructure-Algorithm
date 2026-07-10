package Arrays.Easy;

public class removeDuplicates{//Question stated "Need to return number of unique elements of given sorted array"
    public void main(String[] args){
        int[] nums = {1, 2, 2, 4, 5, 6, 6, 8, 9};
        int size = rmDuplicates(nums);
        System.out.print("Size of given sorted Array after removing duplicates is: " + size);
    }

    public int rmDuplicates(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++)
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

        return i+1;
    }
}