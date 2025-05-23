package programmers.level1;

import java.util.*;

/**
 * 문제: 두 개 뽑아서 더하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
 *
 * 1. 중복 제거를 위한 Set 사용
 * 2. 이중 반복문으로 모든 조합탐색
 * 3. 합 계산 및 저장
 * 4. List로 변환후 오름차순 정렬
 */
public class Problem68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>();

        // 서로 다른 인덱스의 두 수를 더하기
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 List로 변환 후 정렬
        List<Integer> sumList = new ArrayList<>(sumSet);
        Collections.sort(sumList);

        // List를 배열로 변환
        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem68644 problem = new Problem68644();
        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] result = problem.solution(numbers1);
        System.out.println(Arrays.toString(result));

        int[] numbers2 = {5, 0, 2, 7};
        int[] result2 = problem.solution(numbers2);
        System.out.println(Arrays.toString(result2));


    }
}
