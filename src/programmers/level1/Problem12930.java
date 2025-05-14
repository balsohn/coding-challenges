package programmers.level1;

/**
 * 문제: 이상한 문자 만들기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12930
 *
 * 1. 빈문자열 기준으로 split하기
 * 2. 각 단어마다 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환
 * 3. 변환된 단어들을 공백으로 구분하여 다시 합치기
 */
public class Problem12930 {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }

            if (i < words.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Problem12930 problem = new Problem12930();
        System.out.println(problem.solution("try hello world"));
    }
}
