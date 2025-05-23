package programmers.level1;

import java.util.Arrays;

/**
 * 문제: K번째 수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 *
 * 1. 결과 배열 생성
 * 2. 각 명령어 처리
 * 3. 배열 자르기
 * 4. 정렬
 * 5. k번째 찾기
 */
public class Problem42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            int[] subArray = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(subArray);

            answer[idx] = subArray[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem42748 problem = new Problem42748();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = problem.solution(array, commands);
        System.out.println(Arrays.toString(result));

        // 단계별 실행 과정 출력
        System.out.println("\n=== 단계별 실행 과정 ===");
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            System.out.printf("명령어 %d: [%d, %d, %d]\n", idx + 1, i, j, k);
            System.out.printf("  자른 배열: %s\n", Arrays.toString(subArray));

            Arrays.sort(subArray);
            System.out.printf("  정렬 후: %s\n", Arrays.toString(subArray));
            System.out.printf("  %d번째 수: %d\n\n", k, subArray[k - 1]);
        }
    }

}
