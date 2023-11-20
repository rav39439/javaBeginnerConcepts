package newpck;

public class Solution {

	static String mess;
	static String part_1;
	static String part_2;
	static String part_3;
	static String part1;
	static String part2;
	static int length;
	
	public static String solution(String message) {
		
		
		mess=message;
		
		char[] intArray = new char[]{ 'a','b','c','d','e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' }	;
		part_1="";
		part_2="";
		part_3="";
		part1="";
		part2="";
	length=mess.length();
	//System.out.println(length);
	
	for(int i=0;i<length;i++) {
		
		
		if(i==3) {
			for(int j=0;j<i;j++) {
				if(!(mess.charAt(j)=='\0')) {
					part_1+=mess.charAt(j);
					
				}
			}
		}
		
		else if(i==6) {
			for(int j=3;j<i;j++) {
				if(!(mess.charAt(j)=='\0')) {
				part_2+=mess.charAt(j);
			}
			}
		}
		else if(i==8) {
			for(int j=6;j<=8;j++) {
				if(!(mess.charAt(j)=='\0')) {
				part_3+=mess.charAt(j);
			}
			}
		}
		
		
	}
	
//	System.out.println(part_1);
//	System.out.println(part_2);
//
//	System.out.println(part_3);
		for(int i=0;i<25;i++) {
			for(int j=0;j<3;j++) {
				if(intArray[i]==part_1.charAt(j)) {
					//System.out.println(part_1.charAt(j));
					part1+=i+1;
				}
			}
		}
		
		for(int i=2;i>=0;i--) {
			part2+=part_2.charAt(i);
		}
		//return message;
		

		
		String allstring=part1+part2+part_3;
		return allstring;
	}
	
	
	public static void main(String[] args) {
	System.out.println(solution("amerijdjj"));
	}
}
