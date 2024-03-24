import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Sağlık sigortası için hesaplama yapılacak
        return 0; // Geçici olarak 0 döndürüldü, hesaplama metodu gerçek değerlere göre güncellenmeli
    }
}
