package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제: 모의고사
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 *
 * 1. 각 수포자의 찍기 패턴을 배열로 정의합니다.
 * 2. 정답 배열을 순회하면서 각 수포자의 예상 답안과 비교하여 점수를 계산합니다.
 * 3. 모듈로 연산을 사용하여 패턴의 순환 인덱스를 구합니다.
 * 4. 최고 점수를 찾고, 최고 점수와 같은 점수를 받은 모든 수포자를 결과에 포함합니다.
 * 5. 결과 자동으로 오름차순
 */
public class Problem42840 {
    public int[] solution(int[] answers) {
        // 각 수포자의 찍기 패턴 정의
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자의 점수 초기화
        int[] scores = {0, 0, 0};

        // 각 문제에 대해 정답과 비교
        for (int i = 0; i < answers.length; i++) {
            // 1번 수포자 점수 계산
            if (answers[i] == pattern1[i % pattern1.length]) {
                scores[0]++;
            }

            // 2번 수포자 점수 계산
            if (answers[i] == pattern2[i % pattern2.length]) {
                scores[1]++;
            }

            // 3번 수포자 점수 계산
            if (answers[i] == pattern3[i % pattern3.length]) {
                scores[2]++;
            }
        }

        // 최고 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 수포자들을 찾아서 리스트에 추가
        ArrayList<Integer> winners = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                winners.add(i + 1);
            }
        }

        return winners.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem42840 problem = new Problem42840();

        System.out.println(Arrays.toString(problem.solution(new int[]{1, 2, 3, 4, 5}))); // [1]
        System.out.println(Arrays.toString(problem.solution(new int[]{1, 3, 2, 4, 2}))); // [1, 2, 3]
    }
}
