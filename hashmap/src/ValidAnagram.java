import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] ss = new int[ 26 ];
        int[] tt = new int[ 26 ];

        for (char c : s.toCharArray()) {
            ++ss[ c - 'a' ];
        }

        for (char c : t.toCharArray()) {
            ++tt[ c - 'a' ];
        }

        return Arrays.equals(ss, tt);
    }
}
