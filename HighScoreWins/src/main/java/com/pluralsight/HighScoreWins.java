package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String userInput;
        // Home:Visitor|21:9

        System.out.println("Please enter your team's score in the following format \"Home:Visitor|21:9\"");
        userInput = s.nextLine();
        // Home:Visitor|21:9

        String[] tokens = userInput.split(Pattern.quote("|"));
        String [] teams = tokens[0].split(Pattern.quote(":"));
        String [] scores = tokens[1].split(Pattern.quote(":"));

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        String winningTeam;
        if (homeScore > visitorScore) {
            winningTeam = teams[0];
        } else if (visitorScore > homeScore) {
            winningTeam = teams[1];
        } else {
            winningTeam = "Its a tie!";
        }


        System.out.println("Winning Team: " + winningTeam);
    }
}
