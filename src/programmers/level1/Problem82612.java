package programmers.level1;

/**
 * 문제: 부족한 금액 계산하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class Problem82612 {
    public long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += (long)price * i;
        }

        long answer = total - money;

        return answer > 0 ? answer : 0;
    }
    public static void main(String[] args) {
        Problem82612 problem = new Problem82612();
        System.out.println(problem.solution(3, 20, 4));
    }
}
