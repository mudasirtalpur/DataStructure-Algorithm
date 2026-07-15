package Arrays.Medium;

public class twoSum{
    public void main(String[] args){
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        int[] result = sum(nums, target);
        for(int num : result)
            System.out.print(num + " ");
    }

    public int[] sum(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == target)
                return new int[] {left, right};
            else if(sum < target)
                left++;
            else
                right--;
        }

        return new int[] {-1,-1};
    }
    
}