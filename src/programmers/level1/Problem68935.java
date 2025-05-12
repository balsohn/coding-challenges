package programmers.level1;

/**
 * 문제: 3진법 뒤집기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68935
 *
 * 1. 10진수 n을 3진수로 변환
 * 2. 3진수로 표현된 수를 앞뒤로 뒤집기
 * 3. 뒤집은 3진수를 다시 10진수로 변환
 */
public class Problem68935 {

    public int solution(int n) {
        String a = Integer.toString(n, 3);

        String reversed = new StringBuilder(a).reverse().toString();

        int answer = Integer.parseInt(reversed, 3);

        return answer;
    }

    public static void main(String[] args) {
        Problem68935 problem = new Problem68935();
        System.out.println(problem.solution(45));
        System.out.println(problem.solution(125));
    }
}
