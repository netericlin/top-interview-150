public class RansomNote {

    public static void main(String[] args)
    {
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] items = new int[26];
        for(char c: magazine.toCharArray()) {
            ++items[c - 'a'];
        }

        for(char c: ransomNote.toCharArray()){
            if( --items[c-'a'] <0){
                return false;
            }
        }
        return true;
    }
}
