import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    protected AuthenticationStatus authenticationStatus;
    protected User user;
    protected ArrayList<Insurance> insurances;


    public abstract AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException;

    public abstract void addAddress(Address address);

    public abstract void removeAddress(Address address);

    public abstract void addInsurance(Insurance insurance);



    //"Account" sınıfında müşteri bilgilerini ekrana yazdıran
    // "final" tipinde, değer döndürmeyen ve ismi "showUserInfo" bir fonksiyon tanımlayınız.
    public final void showUserInfo(){
        System.out.println("User Info:");
        System.out.println("Name: " + user.getName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
    }


    @Override
    public int compareTo(Account other){
        //karşılaştırma işlemleri
        return 0;
    }


}
