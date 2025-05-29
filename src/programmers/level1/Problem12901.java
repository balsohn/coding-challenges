package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 문제: 2016년
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12901
 *
 */
public class Problem12901 {
    public String solution(int a, int b) {
        // LocalDate 객체 생성 (2016년 a월 b일)
        LocalDate date = LocalDate.of(2016, a, b);

        // 요일 가져오기
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // DayOfWeek을 문제에서 요구하는 형식으로 변환
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return days[dayOfWeek.getValue() - 1];
    }

    public static void main(String[] args) {
        Problem12901 problem = new Problem12901();
        System.out.println(problem.solution(5, 24));
    }
}
