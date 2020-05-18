package LeetCodeProblems;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicateLeetCode {

	public static void main(String[] args) {
		int intArray[]=new int[]{1,2,3,4,5,6,7,5,6};
		System.out.println(containsDuplicate(intArray));

	}
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setMap=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(setMap.size()!=nums.length)
            return true;
        else
            return false;
    }

}
