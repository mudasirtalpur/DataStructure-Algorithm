package Arrays.Easy;

public class numberOfOccurrence{
    public void main(String[] args){
        int[] nums = {1, 1, 2, 2, 2, 2, 3};
        
        int ocrd = countFreq(nums, 2);
        System.out.print(ocrd);
    }

    int countFreq(int[] nums, int target) {
        // code here
        int ocrd = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target)
                continue;
            if(nums[i] > target)
                break;
            ocrd++;
            
        }
        return ocrd;
    }
}