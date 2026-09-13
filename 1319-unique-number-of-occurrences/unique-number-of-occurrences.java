
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (numbers.contains(arr[i])) {
                continue;
            }

            numbers.add(arr[i]);

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (set.contains(count)) {
                return false;
            }

            set.add(count);
        }

        return true;
    }
}
