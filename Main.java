import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int numOfPlayers = 2;
        Player[] players = new Player[numOfPlayers];
        
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter name for player " + i + ":");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }

        Game game = new Game(players);
        
        while (!game.isWinning()){
            System.out.println("Play the next round by typing 'r'");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("r")){
                game.playTurn();
            } else if(userInput.equals("stop")){
                break;
            }
            
        }
        for (Player player : players) {
            if (player.getMoney() >= 3000) {
                System.out.println(player.getName()+" has won");
            }
        }
    }
}







    


