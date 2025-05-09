package programmers.level1;

import java.util.Arrays;

/**
 * 문제: 행렬의 덧셈
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12950
 *
 * 결과 행렬을 저장할 배열을 생성합니다 (첫 번째 행렬과 같은 크기)
 * 두 행렬의 같은 위치에 있는 원소를 더해 결과 행렬에 저장합니다
 */
public class Problem12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int cols = arr1[0].length;

        int[][] answer = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem12950 problem = new Problem12950();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] result1 = problem.solution(arr1, arr2);
        Arrays.stream(result1).map(Arrays::toString).forEach(System.out::println);

        int[][] arr3 = {{1}, {2}};
        int[][] arr4 = {{3}, {4}};
        int[][] result2 = problem.solution(arr3, arr4);
        Arrays.stream(result2).map(Arrays::toString).forEach(System.out::println);

    }
}
