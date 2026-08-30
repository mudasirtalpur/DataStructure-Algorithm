package Arrays.Medium;

public class minimumDeletions{
    public static void main(String[] args){
        int[] nums = {-87, 60, -30, -67, 74, 55, 76, -53};

        System.out.print("The least number of Operations needed to remove minimun and maximum is: "
         + minDeletions(nums));
    }

    public static int minDeletions(int[] nums){
        int n = nums.length;
        int minIdx = 0, maxIdx = n;
        
        for(int i = 0; i < n; i++)
            if(nums[i] < nums[minIdx])
                minIdx = i;
            else if(nums[i] > nums[maxIdx])
                maxIdx = i;
        //3 scenerios 
        //1st deleting both from front
        int front = Math.max(minIdx, maxIdx) + 1;
        //2nd deleting both from back
        int back = n - Math.min(minIdx, maxIdx);
        //3rd deleting from both ends
        int both = Math.min(minIdx, maxIdx) + 1 + Math.max(minIdx, maxIdx);

        //Getting the one with least number of operations

        return Math.min(front, Math.min(back, both));
    }
}