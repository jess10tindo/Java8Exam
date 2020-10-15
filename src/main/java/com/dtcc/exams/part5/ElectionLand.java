package com.dtcc.exams.part5;

import java.util.Map;
import java.util.TreeMap;

public class ElectionLand {

    public Map<String, Integer> votesTallied;

    //should put it in alphabetical order...not sure why it's not working
    public ElectionLand(){
        votesTallied = new TreeMap<>();
    }

    public String electionWinner(String[] votes){
        String winner = null;
        int tempHighest = 0;
        for(int i =0; i<votes.length; i++) {
            if(votesTallied.containsKey(votes[i])){
                int j = votesTallied.get(votes[i]) +1;
                votesTallied.put(votes[i], j);
            }
            else{
                votesTallied.put(votes[i], 1);
            }
        }

        for(String name : votes) {
            if (votesTallied.get(name) >= tempHighest){
                tempHighest = votesTallied.get(name);
                winner = name;
            }
        }
        return winner;
    }
}
