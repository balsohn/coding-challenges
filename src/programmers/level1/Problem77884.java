package programmers.level1;

/**
 * 문제: 약수의 개수와 덧셈
 * 링크: https://programmers.co.kr/learn/courses/30/lessons/77884
 *
 * 문제 설명:
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Problem77884 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int divisor_count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisor_count++;
                }
            }

            if (divisor_count % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem77884 problem = new Problem77884();

        // 테스트 케이스 1
        System.out.println(problem.solution(13, 17));
        // 테스트 케이스 2
        System.out.println(problem.solution(24, 27));
    }
}
