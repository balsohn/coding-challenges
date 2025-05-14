package programmers.level1;

/**
 * 문제: 크기가 작은 부분문자열
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/147355
 *
 * 1. p의 길이만큼 substring
 * 2. 문자열 그대로 비교
 * 3. 양수 또는 음수를 0이랑 비교 후 answer++
 */
public class Problem147355 {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();

        for (int i = 0; i <= t.length() - pLength; i++) {
            String subString = t.substring(i, i + pLength);
            System.out.println(subString.compareTo(p));
            if (subString.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem147355 problem = new Problem147355();
        System.out.println(problem.solution("3141592", "271"));
        System.out.println(problem.solution("500220839878", "7"));
        System.out.println(problem.solution("10203", "15"));
    }
}
