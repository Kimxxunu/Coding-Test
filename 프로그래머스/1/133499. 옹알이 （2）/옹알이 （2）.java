class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String b : babbling) {
            String prev = "";
            String temp = b;

            boolean valid = true;

            while (!temp.isEmpty()) {
                boolean matched = false;

                for (String w : words) {
                    if (temp.startsWith(w)) {
                        if (w.equals(prev)) {
                            valid = false;
                            break;
                        }
                        prev = w;
                        temp = temp.substring(w.length());
                        matched = true;
                        break;
                    }
                }

                if (!matched) { 
                    valid = false;
                    break;
                }
            }

            if (valid) count++;
        }

        return count;
    }
}
