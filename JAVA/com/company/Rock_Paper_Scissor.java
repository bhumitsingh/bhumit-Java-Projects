package com.company;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        // rock beats scissor, scissor beats paper, paper beats rock
        System.out.println("Welcome to rock, paper and scissors");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.What us your move?\n2.Enter rock,paper or scissors to play your move.\nEnter quit to quite the game.");
            String Player_Move = sc.nextLine();

            if (Player_Move.equals("quit")){
                break;
            }
            if (!Player_Move.equals("rock") && !Player_Move.equals("scissors") && !Player_Move.equals("paper")){
                System.out.println("Invalid Move");
            }
            else {
                int rand =(int) (Math.random()*3);
                String opponent_move ="";
                if (rand==0){
                    opponent_move="rock";
                }else if (rand==1){
                    opponent_move="paper";
                }else {
                    opponent_move="scissors";
                }
                System.out.println("Opponent move:" + opponent_move);

                if (opponent_move.equals(Player_Move)){
                    System.out.println("It is a tie");
                }
                else if (Player_Move.equals("rock") && opponent_move.equals("scissors")||Player_Move.equals("scissors")&&opponent_move.equals("paper")||
                Player_Move.equals("paper")&&opponent_move.equals("rock")){
                    System.out.println("Respect+");
                }
                else {
                    System.out.println("Wasted");
                }
            }
        }
        System.out.println("Thanks for playing rock,paper and scissors");
}
}

