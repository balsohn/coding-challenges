package programmers.level1;


/**
 * 문제: 푸드 파이트 대회
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/134240
 *
 */
public class Problem134240 {
    public String solution(int[] food) {
        StringBuilder leftPartBuilder = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int quantity = food[i];
            int countPerPlayer = quantity / 2;

            for (int j = 0; j < countPerPlayer; j++) {
                leftPartBuilder.append(i);
            }
        }

        String leftPart = leftPartBuilder.toString();

        String rightPart = new StringBuilder(leftPart).reverse().toString();

        String answer = leftPart + "0" + rightPart;

        return answer;
    }

    public static void main(String[] args) {

        Problem134240 problem = new Problem134240();
        int[] food1 = {1, 3, 4, 6};
        System.out.println(problem.solution(food1));

        int[] food2 = {1, 7, 1, 2};
        System.out.println(problem.solution(food2));
    }
}
