
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> m = new HashSet<Character>();
        int n = s.length();
        int l = 0;
        int result = 1;

        for (int r = 0; r < n; r++)  {
            while (m.contains(s.charAt(r))) {
                m.remove(s.charAt(l));
                l++;
            }
            result = Math.max(result, r - l + 1);
            m.add(s.charAt(r));
        }

        return  result;
        
    }
}
