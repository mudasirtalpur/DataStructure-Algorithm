package Arrays.Easy;

public class linearSearch{
    public void main(String[] args){
        int[] nums = {2, 3, 4, 5, 3};
        int target = 3;
        int result = search(nums, target);
        if(result != -1)
            System.out.println("The target: " + target + " was found on index: " + result +".");
        else
            System.out.println("The target: " + target + " not present in given Array.");
    }

    public int search(int[] nums, int target){
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target)
                return i;

        return -1;
    }
}