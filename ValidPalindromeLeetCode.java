package LeetCodeProblems;

public class ValidPalindromeLeetCode {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	 public static boolean isPalindrome(String s) {
	        StringBuilder str=new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
	            str=str.append(s.charAt(i));
	        }
	        StringBuilder strRev=new StringBuilder(str);
	        str.reverse();
	        String st1=str.toString();
	        String st2=strRev.toString();
	        if(st1.equalsIgnoreCase(st2))
	            return true;
	        return false;
	    }

}
