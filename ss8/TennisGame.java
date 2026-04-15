public class TennisGame {
    public static String getScore(int p1, int p2) {
        if (p1 == p2) {
            return getEqualPointDisplay(p1);
        } else if (p1 >= 4 || p2 >= 4) {
            return differentPointBiggerOrEqual4(p1, p2);
        } else return convert(p1) + "-" + convert(p2);
    }

    public static String getEqualPointDisplay(int point) {
        switch (point) {
            case 0:
                return "Love-All";

            case 1:
                return "Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return "Deuce";
        }
    }

    public static String differentPointBiggerOrEqual4(int p1, int p2){
        int minusPoint = p1-p2;
        if (minusPoint >=2){
            return "Win for player 1";
        } else if (minusPoint <= -2){
            return "Win for player 2";
        } else if (minusPoint == 1) {
            return "Advantage player 1";
        } else {
            return "Advantage player 2";
        }
    }

    public static String convert(int point){
        switch(point){
            case 0:
                return "Love";

            case 1:
                return "Fifteen";

            case 2:
                return "Thirty";

            case 3:
                return "Forty";

            default:
                return"";
        }
    }
}
