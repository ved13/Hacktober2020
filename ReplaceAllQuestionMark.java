
import java.util.*;
public class ReplaceAllQuestionMark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String fi="";
		StringBuilder sb=new StringBuilder(s);;
		for(int i=0;i<s.length();i++) {
			char current=sb.charAt(i);
			
			if(current=='?') {
				System.out.println(current);
				char inc='a';
				if(sb.charAt(i+1)==inc) {
					inc++;
					
				}
				int index=s.indexOf('?');
				sb.setCharAt(index, inc);
				
				
			
			}
		}
		fi=sb.toString();
		System.out.println(fi);

	}

}
