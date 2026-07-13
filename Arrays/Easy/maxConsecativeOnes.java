package Arrays.Easy;

public class maxConsecativeOnes{
    public void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int maxConsecative = consecative(nums);

        System.out.print("Max consecative 1's in given array are: " + maxConsecative);
    }

    public int consecative(int[] nums){
        int consecative = 0;
        int maxConsecative = 0;
        for(int num : nums)
            if(num == 1)
                consecative++;
            else{
                if(consecative > maxConsecative)
                    maxConsecative = consecative;
                consecative = 0;
            }
        if(consecative > maxConsecative)
            return consecative;

        return maxConsecative;
    }
}