package Arrays.Medium;

public class constructUniformParityArrayII{
    public static void main(String[] args){
        int[] nums = {1, 4, 7};

        System.out.print("Can we construct a uniform parity array from the given array? " + uniformArray(nums));
    }

    public static boolean uniformArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean allEven = true;

        for (int num : nums){
            if (num < min)
                min = num;
            if ((num & 1) == 1)
                allEven = false;
        }

        return (min & 1) == 1 || allEven;
    }
}