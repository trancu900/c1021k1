package vn.codegym.shape;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScoreName(int score1, int score2) {
        String score = "";

        if (score1 == score2) {
            score = getScoreNameOfDraw(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = getScoreNameOfAnyThanFour(score1, score2);
        } else {
            int tempScore = 0;
            for (int i = 1; i < 3; i++) {
                if (i == 1)
                    tempScore = score1;
                else {
                    score += "-";
                    tempScore = score2;
                }
                score += getScoreNameOfAnyLessFour(tempScore);
            }
        }
        return score;
    }

    private static String getScoreNameOfAnyThanFour(int score1, int score2) {
        String score;
        int minusResult = score1 - score2;
        if (minusResult == 1)
            score = ADVANTAGE_PLAYER_1;
        else if (minusResult == -1)
            score = ADVANTAGE_PLAYER_2;
        else if (minusResult >= 2)
            score = WIN_FOR_PLAYER_1;
        else
            score = WIN_FOR_PLAYER_2;
        return score;
    }

    private static String getScoreNameOfAnyLessFour(int minusResult) {
        String score;
        if (minusResult == 1)
            score = ADVANTAGE_PLAYER_1;
        else if (minusResult == -1)
            score = ADVANTAGE_PLAYER_2;
        else if (minusResult >= 2)
            score = WIN_FOR_PLAYER_1;
        else
            score = WIN_FOR_PLAYER_2;
        return score;
    }

    private static String getScoreNameOfDraw(int score1) {
        String score;
        switch (score1) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScoreName(15, 23));
    }
}