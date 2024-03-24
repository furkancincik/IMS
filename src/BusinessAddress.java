public class BusinessAddress implements Address {
    private String cityName;
    private String streetName;
    private String postalCode;

    public BusinessAddress(String cityName, String streetName, String postalCode) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    @Override
    public String getCity() {
        System.out.println("Lütfen şehir adını giriniz: ");
        return cityName;
    }

    @Override
    public String getStreet() {
        System.out.println("Lütfen sokak adını giriniz: ");
        return streetName;
    }

    @Override
    public String getPostalCode() {
        System.out.println("Lütfen posta kodunu giriniz: ");
        return postalCode;
    }
}
