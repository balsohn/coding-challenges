package programmers.level1;

/**
 * 문제: 소수만들기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12977
 *
 * 1. 배열에서 서로 다른 3개의 수를 선택하는 모든 조합을 생성합니다.
 * 2. 3중 반복문을 사용하여 i < j < k 조건으로 중복을 방지합니다.
 * 3. 각 조합의 합이 소수인지 판별합니다.
 * 4. 소수 판별은 2부터 Vnum까지 나누어 떨어지는지 확인합니다.
 * 5. 소수인 경우 카운트를 증가시켜 최종 개수를 반환합니다.
 */
public class Problem12977 {
    public int solution(int[] nums) {
        int answer = 0;

        // 3개의 서로 다른 수를 선택하는 ㅁ ㅗ든 조합
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    /**
     * 소수 판별 함수
     */
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return false;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem12977 problem = new Problem12977();

        System.out.println(problem.solution(new int[]{1, 2, 3, 4})); // 1
        System.out.println(problem.solution(new int[]{1, 2, 7, 6, 4})); // 4
    }

}
