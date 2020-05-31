package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagramLeetCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
				s=s.append(sc.next());
		StringBuilder t=new StringBuilder();
				t=s.append(sc.next());
		System.out.println(isAnagram(s.toString(),t.toString()));

	}
	public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1=new HashMap<>();
        Map<Character,Integer> t1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s1.containsKey(Character.valueOf(s.charAt(i)))){
                s1.put(Character.valueOf(s.charAt(i)),s1.get(Character.valueOf(s.charAt(i)))+1);
            }
            else
                s1.put(Character.valueOf(s.charAt(i)),1);
        }
        for(int i=0;i<t.length();i++){
             if(t1.containsKey(Character.valueOf(t.charAt(i)))){
                t1.put(Character.valueOf(t.charAt(i)),t1.get(Character.valueOf(t.charAt(i)))+1);
            }
            else
                t1.put(Character.valueOf(t.charAt(i)),1);
        }
        boolean flag=true;
        
    for (Map.Entry<Character,Integer> entry : t1.entrySet()) {            
        if(!s1.containsKey(entry.getKey()))
                flag= false;
         else  if(s1.containsKey(entry.getKey()) && !s1.get(entry.getKey()).equals(t1.get(entry.getKey())))
                flag= false;
        }
    	if(s.length()!=t.length())
    		flag=false;
        return flag;
    }

}
