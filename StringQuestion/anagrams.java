package StringQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class anagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] stringArray2 = new String[strs.length];
        for (int i = 0; i < stringArray2.length; i++) {
            stringArray2[i] = strs[i];
        }

        // Sort each string in the array
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            strs[i] = new String(chars);
        }

        // Create a list of lists to store anagram groups
        List<List<String>> resultList = new ArrayList<>();

        // Traverse the sorted array and group anagrams
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                List<String> anagramGroup = new ArrayList<>();
                anagramGroup.add(stringArray2[i]);

                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null && strs[i].equals(strs[j])) {
                        anagramGroup.add(stringArray2[j]);
                        strs[j] = null;
                    }
                }

                resultList.add(anagramGroup);
            }
        }

        System.out.println(resultList);
    }
}
