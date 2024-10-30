public class Player extends Account {
    private String name;
    private Account wallet;
    public Player (String name){
        this.name = name;
        this.wallet = new Account();
    }  
    public String getName(){
        return this.name;
    }
}
