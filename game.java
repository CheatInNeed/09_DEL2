import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class game {

    public static boolean isWinning(){
        if (getMoney() >= 3000){
            return true;
        } else {return false;}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        String userInput = scanner.nextLine();

        player[] players = new player[2];
        GameBoard board = new GameBoard();
        Dice dice = new Dice();

    while (!isWinning()){
        System.out.println("Play the next round by typing 'r'");
        if (userInput.equals("r")){
        for (var n : players){

            int diceSum = dice.roll();
            int boardValue = board.getValue(diceSum);
            
            if (boardValue > 0){
            System.out.println("Player " + n + " rolled: " + diceSum + " and goes to the field. " + boardValue + " amount of money has been added to your account.");
            } else {System.out.println("Player " + n + " rolled: " + diceSum + " and goes to the field. " + boardValue + " amount of money has been withdrawed from your account.");}
        } 
    } else {}

    }






    }
}
