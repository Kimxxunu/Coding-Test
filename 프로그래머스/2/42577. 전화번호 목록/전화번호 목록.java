import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> phoneNumbers = new HashSet<>(Arrays.asList(phone_book));

        for (String num : phone_book) {
            for (int cut = 1; cut < num.length(); cut++) { // 길이로 제한
                if (phoneNumbers.contains(num.substring(0, cut))) {
                    return false; // 발견 즉시 종료
                }
            }
        }
        return true;
    }
}
