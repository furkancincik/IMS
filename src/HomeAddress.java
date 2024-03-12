public class HomeAddress implements Address{
    private String cityName;
    private String streetName;
    private String postalCode;

    @Override
    public void removeAddress() {
        System.out.printf("Adres siliyor");
    }

    @Override
    public void addAddress() {
        System.out.printf("Adres ekliyor");
    }

    @Override
    public void getCity() {
        System.out.printf("sehir adı alıyor");
    }

    @Override
    public void getStreet() {
        System.out.printf("cadde/sokak adı alıyor");
    }

    @Override
    public void getPostalCode() {
        System.out.println("posta kodu alıyor");
    }



}
