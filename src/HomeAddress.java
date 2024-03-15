public class HomeAddress implements Address {
    private String cityName;
    private String streetName;
    private String postalCode;

    public HomeAddress(String cityName, String streetName, String postalCode) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    @Override
    public String getCity() {
        return cityName;
    }

    @Override
    public String getStreet() {
        return streetName;
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }
}

