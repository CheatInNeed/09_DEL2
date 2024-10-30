import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int numOfPlayers = 2;
        Player[] players = new Player[numOfPlayers];
        
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter name for player " + i+1 + ":");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }

        Game game = new Game(players);
        System.out.println("Play round by typing 'r'");
        while (!game.isWinning()){
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("r")){
                game.playTurn();
            } else if(userInput.equals("stop")){
                break;
            }
        }
        scanner.close();
        for (Player player : players) {
            if (player.getMoney() >= 3000) {
                System.out.println(player.getName()+" has won: "+player.getMoney());
            }
        }
    }
}







    