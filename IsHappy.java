import java.util.HashSet;
import java.util.Set;

public class IsHappy {

   public boolean IsHappy(int n) {

    if (n == 1) return true;
    Set<Integer> s = new HashSet();
    while (n != 1) {
        n = getSumOfSquares(n);
        if (s.contains(n)) {
            return false;
        }
        s.add(n);
    }
    return true;
   } 



    private  Integer getSumOfSquares(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }
    
}


