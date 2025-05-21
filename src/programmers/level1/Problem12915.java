package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 문자열 내 마음대로 정렬하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12915
 *
 * 1. Arrays.copyOf를 사용하여 원본 배열을 복사합니다.
 * 2. Arrays.sort와 람다표현식을 사용하여 배열을 정렬
 * 3. 각 문자열 n번째 문자를 추출하여 비교
 * 4. 만약 n번째 문자가 같다면, compareTo 메서드를 사용하여 전체 문자열을 사전순으로 비교
 * 5. n번째 문자가 다르다면, 해당문자를 기준으로 비교하여 정렬
 */
public class Problem12915 {
    public String[] solution(String[] strings, int n) {
        // 문자열 배열을 복사하여 정렬
        String[] answer = Arrays.copyOf(strings, strings.length);

        Arrays.sort(answer, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 == c2) {
                return s1.compareTo(s2);
            }

            return Character.compare(c1, c2);
        });

        return answer;
    }

    public static void main(String[] args) {
        Problem12915 problem = new Problem12915();

        String[] test1 = {"sun", "bed", "car"};
        String[] result1 = problem.solution(test1, 1);
        System.out.println(Arrays.toString(result1));

        String[] test2 = {"abce", "abcd", "cdx"};
        String[] result2 = problem.solution(test2, 2);
        System.out.println(Arrays.toString(result2));
    }
}
