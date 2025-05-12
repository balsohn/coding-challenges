package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 최대공약수와 최소공배수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12940
 *
 */
public class Problem12940 {
    public int[] solution(int n, int m) {
        int a = n, b = m;

        // 최대공약수 계산
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        // 최소공배수 = 두 수의 곱 / 최대공약수
        int lcm = (n * m) / gcd;

        return new int[] {gcd, lcm};
    }

    public static void main(String[] args) {
        Problem12940 problem = new Problem12940();
        System.out.println(Arrays.toString(problem.solution(3, 12)));
        System.out.println(Arrays.toString(problem.solution(2, 5)));
    }
}
