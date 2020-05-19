package LeetCodeProblems;

import java.util.Arrays;

public class TwoSumLeetCode {

	public static void main(String[] args) {
		int[] arr=new int[] {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(arr,9)));
	}
	 public static int[] twoSum(int[] nums, int target) {
	        int[] result=new int[2];
	        for(int i=0;i<nums.length;i++){
	            int res=target-nums[i];
	            for(int j=0;j<nums.length;j++){
	                if(res==nums[j] && i!=j){
	                    result[0]=i;
	                    result[1]=j;
	                    return result;
	                }
	                    
	            }
	        }
	        return result;
	    }

}
