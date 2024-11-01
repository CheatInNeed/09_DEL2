public class Account {
    private int money;
    public Account (){
        this.money = 1000;
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int amount){
        this.money = this.money + amount;
        // test
    }
}