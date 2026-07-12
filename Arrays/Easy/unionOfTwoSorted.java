package Arrays.Easy;

import java.util.*;

public class unionOfTwoSorted{
    public void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7, 8};

        ArrayList<Integer> list = new ArrayList<>();

        list = union(nums1, nums1.length, nums2, nums2.length);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }

    public ArrayList<Integer> union(int[] nums1, int n1, int[] nums2, int n2){
        ArrayList<Integer> arr = new ArrayList<>();
        int nums1Index = 0;
        int nums2Index = 0;
        while(nums1Index < n1 && nums2Index < n2){
            if(nums1[nums1Index] <= nums2[nums2Index]){
                arr.add(nums1[nums1Index]);
                nums1Index++;
            }
            else{
                arr.add(nums2[nums2Index]);
                nums2Index++;
            }
        }
        while(nums1Index < n1){
            arr.add(nums1[nums1Index]);
                nums1Index++;
        }

        while(nums2Index < n2){
            arr.add(nums2[nums2Index]);
                nums2Index++;
        }

        return arr;
    }
}