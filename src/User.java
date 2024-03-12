import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    ArrayList<Address> addresses;
    private Date lastLogin;


    public User(String name, String lastName, String email, String password, String job, int age, Date lastLogin) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job=job;
        this.age = age;
        this.lastLogin = lastLogin;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
