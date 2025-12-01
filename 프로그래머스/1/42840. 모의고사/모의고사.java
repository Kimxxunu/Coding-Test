import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == st1[i % st1.length]) score[0]++;
            if (answers[i] == st2[i % st2.length]) score[1]++;
            if (answers[i] == st3[i % st3.length]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) list.add(i + 1); 
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
