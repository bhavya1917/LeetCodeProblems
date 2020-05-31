package LeetCodeProblems;

public class ReverseStringLeetCode {

	public static void main(String[] args) {
		String str="Hannah";
		System.out.println(reverseString(str.toCharArray()));
	}
	public static char[] reverseString(char[] s) {
        int len=(s.length%2==0) ? s.length/2 : (s.length-1)/2;
        int size=s.length-1;
        for(int i=0;i<len;i++){
            char temp=s[i];
            s[i]=s[size];
            s[size]=temp;
            size--;
        }
        return s;
        
    }
}
