package programmers.level1;

/**
 * 문제: 숫자 문자열과 영단어
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/81301
 *
 * 1. 각 영단어와 해당하는 숫자를 매핑합니다.
 * 2. 입력 문자열 s에서 영단어를 찾아 해당하는 숫자로 대체합니다.
 * 3. 최종 문자열을 정수로 변환하여 반환합니다.
 */
public class Problem81301 {

    public int solution(String s) {
        // 영단어를 숫자로 대체
        s = s.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Problem81301 problem = new Problem81301();
        System.out.println(problem.solution("one4seveneight"));
        System.out.println(problem.solution("23four5six7"));
        System.out.println(problem.solution("2three45sixseven"));
        System.out.println(problem.solution("123"));
    }
}
