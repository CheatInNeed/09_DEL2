public class Game {
    Player[] players;
    GameBoard board;
    Dice dice;

    public Game(Player[] players){
        this.players = players;
        this.board = new GameBoard();
        this.dice = new Dice();
    }

    public void playTurn(){
        for (Player player : players) {
            playTurn(player);
        }
    }

    public void playTurn(Player player){
        int sum = dice.roll();
        System.out.println(player.getName()+" hit "+dice.getDie1() + " & " + dice.getDie2());
        if (sum == 10) {
            playTurn(player);
        }
    }

    public boolean isWinning(){
        for (Player player : players) {
            if (player.getMoney() >= 3000){
                return true;
            }
        }
        return false;
    }
}
