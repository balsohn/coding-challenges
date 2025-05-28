package programmers.level1;

/**
 * 문제: 콜라 문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/132267
 *
 */
public class Problem132267 {
    public int solution(int a, int b, int n) {
        int totalReceivedCokes = 0;
        int currentEmptyBottles = n;

        while (currentEmptyBottles >= a) {
            int numExchangeSets = currentEmptyBottles / a;
            int newCokes = numExchangeSets * b;

            totalReceivedCokes += newCokes;

            currentEmptyBottles = (currentEmptyBottles % a) + newCokes;
        }

        return totalReceivedCokes;
    }

    public static void main(String[] args) {
        Problem132267 problem = new Problem132267();
        // Test1
        System.out.println(problem.solution(2, 1, 20));
        // Test2
        System.out.println(problem.solution(3, 1, 20));
    }
}
