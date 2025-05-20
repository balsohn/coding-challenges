package programmers.level1;

/**
 * 문제: 시저 암호
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 1. 문자열을 순회하면서 각 문자를 확인합니다.
 * 2. 문자가 공백인 경우 그대로 유지합니다.
 * 3. 문자가 대문자인 경우, 'A'를 빼서 0-25 범위로 만든 후
 *    n을 더하고 26으로 나머지 연산을 수행하여 알파벳의 범위(26개)를 넘어가지 않도록 합니다.
 *    그리고 다시 'A'를 더해 대문자 범위로 되돌립니다.
 */
public class Problem12926 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);

            if (ch == ' ') {
                answer.append(' ');
            } else if (Character.isUpperCase(ch)) {
                answer.append((char) ((ch - 'A' + n) % 26 + 'A'));
            } else {
                answer.append((char) ((ch - 'a' + n) % 26 + 'a'));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Problem12926 problem = new Problem12926();

        System.out.println(problem.solution("AB", 1));
        System.out.println(problem.solution("z", 1));
        System.out.println(problem.solution("a B z", 4));
    }
}
