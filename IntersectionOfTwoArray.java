package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int[] nums1=new int[] {1,2,0};
		int[] nums2=new int[] {1,1,0,0};
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int size=nums1.length<nums2.length? nums1.length :nums2.length;
        int bigSize=nums1.length>nums2.length? nums1.length :nums2.length;
        List<Integer> res=new ArrayList<>();
        for(int i =0;i<bigSize;i++){
            for(int j=0;j<size;j++){
               if(((nums1.length<nums2.length || nums1.length==nums2.length) ? nums1 : nums2)[j]==(nums1.length>nums2.length ? nums1 : nums2)[i]){
                   res.add(((nums1.length<nums2.length || nums1.length==nums2.length)? nums1[j] : nums2[j]));
                   ((nums1.length<nums2.length || nums1.length==nums2.length) ? nums1 : nums2)[j]=Integer.MIN_VALUE;
                   (nums1.length>nums2.length ? nums1 : nums2)[i]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] obj=res.stream().mapToInt(i->i).toArray();
        return obj;
    }	

}
