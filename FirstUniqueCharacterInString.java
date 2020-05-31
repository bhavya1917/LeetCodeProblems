package LeetCodeProblems;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
	  public static int firstUniqChar(String s) {
	        char[] str=s.toCharArray();
	        boolean flag=false;
	        for(int i=0;i<str.length;i++){
	            flag=false;
	            for(int j=0;j<str.length;j++){
	                if(str[i]==str[j] && i!=j){
	                    flag=true;
	                    break;

	                }
	            }
	            if(!flag)
	                return i;
	        }
	        return -1;
	        
	    }

}
