public class RewardValue {
    private double cashValue;
    public static double rate = 0.0035;
    public RewardValue(int miles){
        this.cashValue = miles * rate;
    }
    public RewardValue(double cash){
        this.cashValue = cash;
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        int miles = (int) (cashValue / rate);
        return miles;
    }
}
