
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");

        if (pattern.length() != a.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            char ch = pattern.charAt(i);
            String word = a[i];

            for (int j = 0; j < i; j++) {
                if (pattern.charAt(j) == ch && !a[j].equals(word)) {
                    return false;
                }

                if (pattern.charAt(j) != ch && a[j].equals(word)) {
                    return false;
                }
            }
        }

        return true;
    }
}
