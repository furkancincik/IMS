import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Konut sigortası için hesaplama yapılacak
        return 0; // Geçici olarak 0 döndürüldü, hesaplama metodu gerçek değerlere göre güncellenmeli
    }
}
