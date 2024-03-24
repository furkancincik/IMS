import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AccountManager {
    private Set<User> users;

    public AccountManager() {
        this.users = new HashSet<>();
        exampleUser(); // Örnek kullanıcı oluşturuldu
    }

    // Örnek bir kullanıcı oluştur
    private void exampleUser() {
        User user = new User("example", "user", "example@example.com", "password", "job", 25, new Date());
        users.add(user);
    }



    // login metodu
    public User login(String email, String password) throws InvalidAuthenticationException {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
                return user; // Giriş başarılıysa kullanıcıyı döndür
            }
        }
        // Hiçbir kullanıcı giriş yapamadıysa InvalidAuthenticationException fırlat
        throw new InvalidAuthenticationException("Giriş başarısız.");
    }



    // Yeni hesap oluştur
    public User createUser(String name, String lastName, String email, String password, String job, int age, Date date) {
        User newUser = new User(name, lastName, email, password, job, age, date);
        addUser(newUser); // Yeni kullanıcıyı listeye ekle
        return newUser;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void addUser(User newUser) {
        boolean userExists = false;
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(newUser.getEmail())) {
                userExists = true;
                break;
            }
        }
        if (!userExists) {
            users.add(newUser); // HashSet'e yeni kullanıcıyı ekleyin
            System.out.println("Kullanıcı başarıyla eklendi.");
        } else {
            System.out.println("Bu e-posta ile zaten kayıtlı bir kullanıcı var.");
        }
    }


}