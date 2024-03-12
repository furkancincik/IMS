import java.util.Date;

public abstract class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }


    @Override
    public double calculate() {
        return 0;
    }
}
