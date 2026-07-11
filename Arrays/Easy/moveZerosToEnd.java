package Arrays.Easy;

public class moveZerosToEnd{
    public void main(String[] args){
        int[] nums = {0, 1, 4, 0, 5, 2};
        
        System.out.println("Before Moving: ");
        for(int num : nums)
            System.out.print(num + " ");

        move(nums, nums.length);

        System.out.println("\nAfter Moving: ");
        for(int num : nums)
            System.out.print(num + " ");
    }

    public void move(int[] nums, int n){
        int insertPos = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        for(int i = insertPos; i < n; i++)
            nums[i] = 0;
    }
}