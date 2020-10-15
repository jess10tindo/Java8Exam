package com.dtcc.exams.part7;

public class FindTheWinner {

    private String winner;

    public String winner(Integer[] Zan, Integer[] Brian, String s) {
        int player1Score = 0;
        int player2Score = 0;
        String winner = "Tie";

        for(int i = 0; i< Brian.length; i++){
            if(i%2 == 0 && s.equals("Even")) {
                player1Score += Zan[i] - Brian[i];
                player2Score += Brian[i] - Zan[i];
            }
            else if(i%2 != 0 && s.equals("Odd")){
                player1Score += Zan[i] - Brian[i];
                player2Score += Brian[i] - Zan[i];
            }
        }

        if(player1Score > player2Score){
            winner = "Zan";
        }
        else if(player1Score < player2Score){
            winner = "Brian";
        }

        return winner;
    }

}
