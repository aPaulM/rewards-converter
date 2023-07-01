public class RewardValue {

    //------Instance Variables---------------
    private double economicValue;
    private String valueType;

    //------Constructors---------------------
    public RewardValue(double cashValue) {
        economicValue = cashValue;
        valueType = "dollars";
    }
    public RewardValue(float milesValue) {
        economicValue = milesValue;
        valueType = "miles";
    }

    //------Getter Methods-------------------
    public double getCashValue() {
        if(valueType.equals("dollars")) {
            return economicValue;
        } else if(valueType.equals("miles")) {
            return economicValue * 0.0035;
        } else {
            return 0;
        }
    }
    public float getMilesValue() {
        if(valueType.equals("dollars")) {
            return Float.parseFloat(String.valueOf(economicValue / 0.0035));
        } else if(valueType.equals("miles")) {
            return Float.parseFloat(String.valueOf(economicValue));
        }
        return 0;
    }
}
