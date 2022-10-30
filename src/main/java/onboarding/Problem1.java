package onboarding;

import java.util.List;

class Problem1 {
    public static boolean isLeftPageOdd(List<Integer> book) {
        int leftPage = book.get(0);

        return leftPage % 2 == 1;
    }

    public static boolean isRightPageEven(List<Integer> book) {
        int rightPage = book.get(1);

        return rightPage % 2 == 0;
    }

    public static boolean isContinuousPage(List<Integer> book) {
        int leftPage = book.get(0);
        int rightPage = book.get(1);

        return rightPage - leftPage == 1;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}