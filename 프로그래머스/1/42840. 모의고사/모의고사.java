import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int scores[] = new int[3];

        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        int maxScore = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                result.add(i + 1);
            }
        }
        int n[] = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            n[i] = result.get(i);
        }

        return n;
    }
}