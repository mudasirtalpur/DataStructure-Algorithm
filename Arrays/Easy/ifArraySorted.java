package Arrays.Easy;

public class ifArraySorted{
    public void main(String[] args){
        int[] nums = {4, 6, 8, 9, 13, 65};
        if(isSorted(nums))
            System.out.print("The given Array is Soretd.");
        else
            System.out.print("The given Array is not Sorted.");
    }

    public boolean isSorted(int[] nums){
        boolean sortedOrNot = true;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1])
                sortedOrNot = false;
        }
        return sortedOrNot;
    }
}