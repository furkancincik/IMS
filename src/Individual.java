import java.util.ArrayList;

public abstract class Individual extends Account{
    public Individual(User user){
        this.user=user;
        this.insurances=new ArrayList<>();
    }

    @Override
    public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        System.out.println("Giriş yapıldı veya yapılamadı");
        return null;
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
        System.out.println("Sigotrta eklendi");
    }


}
