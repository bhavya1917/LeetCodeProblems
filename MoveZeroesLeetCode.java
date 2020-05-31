package LeetCodeProblems;

import java.util.Arrays;

public class MoveZeroesLeetCode {

	public static void main(String[] args) {
		int[] arr=new int[] {1,0,1};
		moveZeroes(arr);

	}
	public static void moveZeroes(int[] nums) {
        int counter=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                nums[counter]=nums[i+1];
                nums[i+1]=0;
                counter++;
            }
            else if(nums[i]!=0)counter++;
        }
        System.out.println(Arrays.toString(nums));
    }

}
