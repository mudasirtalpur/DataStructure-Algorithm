package Arrays.Medium;

public class containerWithMostWater{
    public void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.print("Container with most water contains: " + maxArea(height) + " unit area.")
    }

    public int maxArea(int[] height){
        int maxContainer = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            maxContainer = Math.max(maxContainer, h * (right - left));
            
            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxContainer;
    }
}