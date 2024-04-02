public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] mapS = new int[ 127 ];
        int[] mapT = new int[ 127 ];

        for (int i = 0; i < s.length(); i++) {
            if (mapS[ s.charAt(i) ] != mapT[ t.charAt(i) ]) {
                return false;
            }
            mapS[ s.charAt(i) ] = i + 1;
            mapT[ t.charAt(i) ] = i + 1;
        }

        return true;

    }
}
