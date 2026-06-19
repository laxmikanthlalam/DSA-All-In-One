//1st approach
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int words = 1;

            for (char ch : sentence.toCharArray()) {
                if (ch == ' ') {
                    words++;
                }
            }

            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}
//2nd Approach
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int words = sentence.trim().split("\\s+").length;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}


