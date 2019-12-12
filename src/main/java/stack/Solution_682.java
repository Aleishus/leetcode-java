package stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_682 {

    public int calPoints( String[] ops ) {
        int totalScore = 0;
        int[] scoresStack = new int[ops.length];
        int stackPointer = -1;
        int score;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "D":
                    score = scoresStack[stackPointer] * 2;
                    stackPointer++;
                    scoresStack[stackPointer] = score;
                    totalScore += score;
                    break;
                case "+":
                    score = scoresStack[stackPointer] + scoresStack[stackPointer - 1];
                    stackPointer++;
                    scoresStack[stackPointer] = score;
                    totalScore += score;
                    break;

                case "C":
                    score = scoresStack[stackPointer];
                    stackPointer -= 1;
                    totalScore -= score;
                    break;
                default:
                    score = Integer.parseInt(ops[i]);
                    stackPointer++;
                    scoresStack[stackPointer] = score;
                    totalScore += score;
            }

        }

        return totalScore;
    }

    public static void main( String[] args ) {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(new Solution_682().calPoints(ops));
    }
}
