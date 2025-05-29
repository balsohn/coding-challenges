package programmers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 문제: 명예의 전당 (1)
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/138477
 *
 * 1. 매일 가수의 점수가 주어짐
 * 2. 명예의 전당은 최대 k개의 점수를 유지
 * 3. 매일 명예의 전당의 최하위 점수를 발표
 * 4. 새로운 점수가 들어오면
 *      - 명예의 전당이 k개 미만이면 그냥 추가
 *      - k개가 찬 상태에서 새 점수가 최하위보다 크면 초하위를 교체
 */
public class Problem138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.offer(score[i]);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            answer[i] = hallOfFame.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem138477 problem = new Problem138477();

        // 테스트 1
        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] results = problem.solution(k1, score1);
        System.out.println(Arrays.toString(results));

        // 테스트 2
        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] results2 = problem.solution(k2, score2);
        System.out.println(Arrays.toString(results2));
    }
}
