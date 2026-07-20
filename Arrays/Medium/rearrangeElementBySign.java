package Arrays.Medium;

public class rearrangeElementBySign{
    public void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};

        int[] arranged = new int[nums.length];
        arranged = arrange(nums, nums.length);

        for(int num : arranged)
            System.out.print(num + " ");
    }

    public int[] arrange(int[] nums, int n){
        int posIndex = 0;
        int negIndex = 1;
        int[] rearrange = new int[n];
        for(int i = 0; i < n; i++){
           if(nums[i] > 0){
                rearrange[posIndex] = nums[i];
                posIndex += 2;
            }
            else{
                rearrange[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        return rearrange;
    }
}