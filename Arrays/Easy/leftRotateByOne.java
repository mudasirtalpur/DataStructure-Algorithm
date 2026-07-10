package Arrays.Easy;

public class leftRotateByOne{
    public void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Before Rotating: ");
        for(int num : nums)
            System.out.print(num + " ");

        rotate(nums);
        
        System.out.println("\nAfter Rotating: ");
        for(int num : nums)
            System.out.print(num + " ");
    }

    public void rotate(int[] nums){
        int size = nums.length-1;
        int temp = nums[0];

        for(int i = 0; i < size; i++)
            nums[i] = nums[i+1];

        nums[size] = temp;

    }
}