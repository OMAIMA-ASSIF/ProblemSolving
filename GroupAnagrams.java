"""
 Problem idea

Two words are anagrams if they contain the same letters with the same frequency, just in different order.

Example:

"eat" and "tea" are anagrams.

So we need to group words that are anagrams together. 

Solution 1: Sorting each word (O(n log n * m))
Algorithm

For every string:

Take the string "eat"
Sort it → "aet"
Use "aet" as a key in a HashMap.

So:

"eat" → "aet"
"tea" → "aet"
"ate" → "aet"

They all get stored under the same key.

Why it works?

Because anagrams become identical after sorting.

Example

Input: ["eat","tea","tan","ate","nat","bat"]

Map will look like:

"aet" → ["eat","tea","ate"]
"ant" → ["tan","nat"]
"abt" → ["bat"]

Then we output all the map values.

⏱ Complexity
Sorting one string of length m costs: O(m log m)
Doing it for n strings costs: O(n * m log m)
  
Solution 2: Frequency counting (O(n * m))
This is faster because we avoid sorting.
Algorithm

For every word:

Create an array count[26]
Count how many times each letter appears
Build a key like:

Example "eat":

a:0, b:0, c:0 ... e:1 ... t:1

Key becomes something like:
"1#0#0#0#1#0#...#1#"

This key uniquely represents the word’s letter frequencies.

Then store it in HashMap.

🔹 Why it works?

Because anagrams always have the same letter frequency.

Example:

"eat" and "tea" have the same counts → same key.
⏱ Complexity
Counting letters for one word length m is O(m)
Doing it for n words → O(n*m)

So it’s faster than sorting.
"""
//Solution 1: O(n log n * m) (sorting each string)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> strsMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            strsMap.putIfAbsent(key, new ArrayList<>());
            strsMap.get(key).add(str);
        }

        return new ArrayList<>(strsMap.values());
    }
}

//Solution 2: O(n * m) (count frequency key)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> strsMap = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append(count[i]).append("#");
            }

            strsMap.putIfAbsent(key.toString(), new ArrayList<>());
            strsMap.get(key.toString()).add(str);
        }

        return new ArrayList<>(strsMap.values());
    }
}
