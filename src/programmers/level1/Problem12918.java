package programmers.level1;

/**
 * 문제: 문자열 다루기 기본
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12918
 *
 * 길이가 4 또는 6인지 확인
 * 숫자로만 구성되어 있는지 확인
 *
 * 두 조건을 모두 만족하면 true를, 그렇지 않으면 false를 반환
 */
public class Problem12918 {
    public boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Problem12918 problem = new Problem12918();
        System.out.println(problem.solution("a234"));   // 테스트 1
        System.out.println(problem.solution("1234"));   // 테스트 2
    }
}
