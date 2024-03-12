import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    private String name;
    private String lastName;
    private String eMail;
    private String password;
    private int age;
    private Date lastLogin;
    ArrayList<Address> addresses;


    public User (String name,String lastName,String eMail,String password, int age,Date lastLogin, ){
        this.name=name;
        this.lastName=lastName;
        this.eMail=eMail;
        this.age=age;
        this.lastLogin=lastLogin;
        this.addresses=new ArrayList<>();


    }
}
