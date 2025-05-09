package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 문자열 내림차순으로 배치하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12917
 *
 * 문제 설명:
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class Problem12917 {
    public String solution(String s) {
        String answer = "";
        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();

        // 정렬
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Problem12917 problem = new Problem12917();

        System.out.println(problem.solution("Zbcdefg"));
    }
}
