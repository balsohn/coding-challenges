package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 과일 장수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/135808
 *
 * 1. 사과 점수를 내림차순으로 정렬합니다.
 * 2. 높은 점수부터 m개씩 그룹을 만들어 상자를 구성
 * 3. 각 상자의 가격은 (상자 내 최저 점수) * m 입니다.
 * 4. 모든 상자의 가격을 합하여 최대 이익을 계산
 */
public class Problem135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 사과 점수를 내림차순으로 정렬
        Arrays.sort(score);
        // 내림차순으로 뒤집기
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }

        // m개씩 묶어서 상자를 만들고 이익 계산
        for (int i = 0; i + m <= score.length; i += m) {
            // 현재 그룹에서 가장 낮은 점수 (m번째 원소)
            int minScore = score[i + m - 1];
            // 상자 가격 = 최저 점수 * 상자크기
            answer += minScore * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem135808 problem = new Problem135808();

        // 테스트 케이스 1
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        System.out.println("테스트 1 결과: " + problem.solution(3, 4, score1) + " (예상: 8)");

        // 테스트 케이스 2
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println("테스트 2 결과: " + problem.solution(4, 3, score2) + " (예상: 33)");
    }
}
