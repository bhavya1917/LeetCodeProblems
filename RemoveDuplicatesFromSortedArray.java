package LeetCodeProblems;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr=new int[] {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));

	}
	public static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
             if(nums[i]!=nums[i+1]){
                 nums[count+1]=nums[i+1];
                 count++;
             }
        }
        return count+1;
    }

}
