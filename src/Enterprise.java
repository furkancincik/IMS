import java.util.ArrayList;

public abstract class Enterprise extends Account {
    public Enterprise(User user) {
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    @Override
    public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        throw new InvalidAuthenticationException("Kurumsal hesaplar için giriş işlemi desteklenmiyor.");
    }

    @Override
    public void addAddress(Address address) {
        System.out.println("Adres eklendi");
    }

    @Override
    public void removeAddress(Address address) {
        System.out.println("Adres silindi");
    }

    @Override
    public void addInsurance(Insurance insurance) {
        System.out.println("Sigorta eklendi");
    }
}
