package programmers.level1;

import java.util.Scanner;

/**
 * 문제: 직사각형 별찍기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12969
 *
 * a와 b를 입력받아 별(*)로 직사각형 출력하기
 */

public class Problem12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0;j < a;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
