package onboarding;

import java.util.ArrayList;
import java.util.Collections;
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

    public static int plusEachDigitOnLeftPage(List<Integer> book) {
        int leftPage = book.get(0);
        int total = 0;

        while (leftPage > 0) {
            total += leftPage % 10;
            leftPage /= 10;
        }

        return total;
    }

    public static int plusEachDigitOnRightPAge(List<Integer> book) {
        int rightPage = book.get(1);
        int total = 0;

        while (rightPage > 0) {
            total += rightPage % 10;
            rightPage /= 10;
        }

        return total;
    }

    public static int productEachDigitOnLeftPage(List<Integer> book) {
        int leftPage = book.get(0);
        int total = 1;

        while (leftPage > 0) {
            total *= leftPage % 10;
            leftPage /= 10;
        }

        return total;
    }

    public static int productEachDigitOnRightPage(List<Integer> book) {
        int rightPage = book.get(1);
        int total = 1;

        while (rightPage > 0) {
            total *= rightPage % 10;
            rightPage /= 10;
        }

        return total;
    }

    public static int determineScores(int score1, int score2, int score3, int score4) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(score1);
        arrList.add(score2);
        arrList.add(score3);
        arrList.add(score4);

        return Collections.max(arrList);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}