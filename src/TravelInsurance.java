import java.util.Date;

public abstract class TravelInsurance extends Insurance{
    public TravelInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }
}
