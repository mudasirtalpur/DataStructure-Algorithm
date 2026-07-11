package Arrays.Easy;

public class leftRotateByK{
    public void main(String[] args){
        int k = 20;
        int[] nums = {2, 4, 7, 9, 12, 25, 42, 34};

        System.out.println("Before rotating:");
        for(int num : nums)
            System.out.print(num + " ");

        rotate(nums, nums.length, k);

        System.out.println("\nAfter rotating:");
        for(int num : nums)
            System.out.print(num + " ");
    }

    public void rotate(int[] nums, int n, int k){
        k = k % n;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}