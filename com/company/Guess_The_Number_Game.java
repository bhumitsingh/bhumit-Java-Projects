package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int Number;
    public int Input_Number;
    public int no_of_Guesses = 0;
 
    public int getNo_of_Guesses() {
        return no_of_Guesses;
    }

    public void setNo_of_Guesses(int no_of_Guesses) {
        this.no_of_Guesses = no_of_Guesses;
    }
    Game(){
        Random rand =new Random();
        this.Number = rand.nextInt(100);
    }
    void take_user_input(){
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        Input_Number = sc.nextInt();
    }
    boolean is_correct_number(){
        no_of_Guesses++;
        if (Input_Number==Number){
            System.out.println("You have guessed the correct number,it was: " + Number +  "\nNumber of guesses: " + no_of_Guesses);
            return true;
        }
        else if (Input_Number<Number){
            System.out.println("Too Low");
        }
        else if (Input_Number>Number){
            System.out.println("Too High");
        }
        return false;
    }
}
public class Guess_The_Number_Game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.take_user_input();
            b = g.is_correct_number();
        }
    }
}
