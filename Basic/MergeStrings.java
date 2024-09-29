package Basic;

		public class MergeStrings {
		    public static String mergeAlternately(String word1, String word2) {
		        StringBuilder merged = new StringBuilder();
		        int i = 0, j = 0;
		        
		        
		        while (i < word1.length() || j < word2.length()) {
		            if (i < word1.length()) {
		                merged.append(word1.charAt(i));
		                i++;
		            }
		            if (j < word2.length()) {
		                merged.append(word2.charAt(j));
		                j++;
		            }
		        }
		        
		        return merged.toString();
		    }

		    public static void main(String[] args) {
		        String word1 = "abc";
		        String word2 = "pqr";
		        System.out.println(mergeAlternately(word1, word2));
		    }
		


	}



