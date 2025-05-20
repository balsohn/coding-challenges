package programmers.level1;

/**
 * 문제: 최소직사각형
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 *
 * 1. 각 명함의 가로와 세로 중 더 큰 값을 한쪽으로 정렬
 * 2. 모든 명함 중 가장 큰 가로 길이와 가장 큰 세로 길이를 찾기
 * 3. 두 값을 곱하여 최소 지갑 크기 계산
 */
public class Problem86491 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {
            // 각 명함에서 더 큰 값을 width로, 더 작은 값을 height로 재배치
            int width = Math.max(card[0], card[1]);
            int height = Math.min(card[0], card[1]);

            // 최대 가로와 세로 길이 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Problem86491 problem = new Problem86491();

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(problem.solution(sizes1));
    }
}
