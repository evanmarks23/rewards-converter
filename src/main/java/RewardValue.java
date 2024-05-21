public class RewardValue {

    private double cashValue = 0;
    private int milesValue = 0;
    private final double conversionRate = .0035;


    public RewardValue(double cash)
    {
        cashValue = cash;
    }

    public RewardValue(int miles)
    {
        milesValue = miles;
    }

    public double getCashValue()
    {
        if (cashValue == 0)
        {
            return milesValue * conversionRate;
        }
        return cashValue;
    }

    public double getMilesValue()
    {
        if (milesValue == 0)
        {
            return cashValue / conversionRate;
        }
        return milesValue;
    }




}
