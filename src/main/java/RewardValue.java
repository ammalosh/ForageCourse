public class RewardValue {
    //two constructs for miles v cash
    private double amount;
    public RewardValue(double cashValue){
        amount = cashValue / .0035;
        this.amount = amount;
    }

    public RewardValue(int milesValue){
        amount = milesValue * .0035;
    }

    public double getMilesValue(){
        return amount / .0035;
    }

    public double getCashValue(){
        return amount * .0035;
    }

}
