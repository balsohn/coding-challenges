package programmers.level1;

/**
 * 문제: 두 수의 차 구하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120803
 *
 * 접근 방법:
 *
 */
public class Problem120803 {

    /*
     * 두 수의 차를 계산하는 함수
     * @param num1 첫 번째 숫자
     * @param num2 두 번째 숫자
    */
    int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Problem120803 solution = new Problem120803();

        // 테스트 케이스 1
        int result1 = solution.solution(2,3);
        System.out.println("result1 = " + result1);

        // 테스트 케이스 2
        int result2 = solution.solution(100,2);
        System.out.println("result2 = " + result2);
    }
}
