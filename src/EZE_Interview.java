import java.util.*;

public class EZE_Interview {

	public static void main(String[] args) {
		String[] words = { "sneha", "Lalli", "Keerthana"};
		String match="we";
		Set<String> matchingWords=new HashSet<>();
		for(int i=0;i<match.length();i++) {
			for(int j=i+1;j<=match.length();j++) {
				String s=match.substring(i,j);
				matchingWords.add(s);
			}
			
		}
		
		for(int i=0;i<words.length;i++) {
			for(String key: matchingWords) {
				if(words[i].contains(key)) {
					System.out.println(words[i]);
					break;
				}
			}
		}
		
		 
	}
}
