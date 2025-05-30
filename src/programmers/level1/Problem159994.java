package programmers.level1;

/**
 * 문제: 카드 뭉치
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/159994
 *
 */
public class Problem159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for (String word : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                idx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Problem159994 problem = new Problem159994();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(problem.solution(cards1, cards2, goal));

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};
        System.out.println(problem.solution(cards3, cards4, goal1));
    }
}
