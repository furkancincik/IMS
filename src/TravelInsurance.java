import java.util.Date;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Seyahat sigortası için hesaplama yapılacak
        return 0; // Geçici olarak 0 döndürüldü, hesaplama metodu gerçek değerlere göre güncellenmeli
    }
}
