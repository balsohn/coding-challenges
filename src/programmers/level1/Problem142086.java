package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 가장 가까운 같은 글자
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/142086
 *
 * 1. 배열 초기화
 * 2. 현재 위치에서 역순으로 탐색하여 같은 문자 탐색
 * 3. 같은문자 찾으면 (현재 인덱스 - 찾은 인덱스) 계산
 * 4. 찾지 못하면 -1 저장
 */
public class Problem142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int closestDistance = -1;

            // 현재 위치에서 거꾸로 탐색하여 같은 문자 찾기
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) == currentChar) {  // 같은 문자인지 확인
                    closestDistance = i - j;
                    break; // 가장 가까운 것을 찾았으므로 탈출
                }
            }
            answer[i] = closestDistance;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem142086 problem = new Problem142086();
        String s1 = "banana";
        System.out.println(Arrays.toString(problem.solution(s1)));

        String s2 = "foobar";
        System.out.println(Arrays.toString(problem.solution(s2)));
    }
}
