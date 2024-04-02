import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if (pattern.length() != ss.length) {
            return false;
        }

        int[] map1 = new int[ 26 ];
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            if (map1[ pattern.charAt(i) - 'a' ] != map2.getOrDefault(ss[ i ], 0)) {
                return false;
            }
            map1[ pattern.charAt(i) - 'a' ] = i + 1;
            map2.put(ss[ i ], i + 1);
        }
        return true;
    }
}
