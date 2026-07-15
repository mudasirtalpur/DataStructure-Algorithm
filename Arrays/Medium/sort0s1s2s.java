package Arrays.Medium;

public class sort0s1s2s{
    public void main(String[] args){
        int[] nums = {0, 1, 1, 0, 2, 0, 2, 1};
        System.out.println("Before Sorting: ");
        
        for(int num : nums)
            System.out.print(num + " ");

        sort(nums);

        System.out.println("\nAfter Sorting: ");

        for(int num : nums)
            System.out.print(num + " ");
    }

    public void sort(int[] nums){
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zeroCount++;
            else if(nums[i] == 1)
                oneCount++;
            else
                twoCount++;
        }

        int i = 0;
        while(i < zeroCount){
            nums[i] = 0;
            i++;
        }
        while(i < zeroCount + oneCount){
            nums[i] = 1;
            i++;
        }
        while(i < zeroCount + oneCount + twoCount){
            nums[i] = 2;
            i++;
        }
    }
}