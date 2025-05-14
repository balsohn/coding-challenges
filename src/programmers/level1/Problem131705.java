package programmers.level1;

/**
 * 문제: 삼총사
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131705
 *
 * 1. 세 개의 숫자를 선택하는 삼중 for문
 * 2. 세 숫자의 합이 0인지 확인
 * 3. answer++
 */
public class Problem131705 {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 세 개의 숫자를 선택하는 모든 조합 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 숫자의 합이 0인지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem131705 problem = new Problem131705();
        int[] number1 = {-2, 3, 0, 2, -5};
        System.out.println(problem.solution(number1));

        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(problem.solution(number2));

        int[] number3 = {-1, 1, -1, 1};
        System.out.println(problem.solution(number3));
    }
}
