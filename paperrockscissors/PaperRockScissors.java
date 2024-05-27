package paperrockscissors;

public class PaperRockScissors {
    String player1Wins = "Player 1 wins";
    String player2Wins = "Player 2 wins";
    String tie = "TIE";

    public String paperRockScissors(String player1, String player2){
        if(player1.equalsIgnoreCase(player2)){
            return(tie);
        } else if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock")) {
            return(player1Wins);
        }else if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) {
            return(player1Wins);
        }else if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper")) {
            return(player1Wins);
        } else{
            return(player2Wins);}

    }
}
