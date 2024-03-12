import java.util.Date;
import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
        exampleAccount(); //Örnek hesap olusturuldu
    }


    // Örnek bir hesap oluştur
    private void exampleAccount() {
        User user = new User("example", "user", "example@example.com", "password", "job", 25, new Date());
        Account exampleAccount = new Individual(user);
        accounts.add(exampleAccount);
    }


    // Kullanıcı girişini kontrol et
    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                AuthenticationStatus status = account.login(email, password);
                if (status.equals(AuthenticationStatus.SUCCESS)) {
                    return account; // Giriş başarılıysa hesabı döndür
                }
            } catch (InvalidAuthenticationException e) {
                // Geçersiz kimlik doğrulaması durumunda devam et
                System.out.println("Giriş başarısız. !!!");
            }
        }
        // Hiçbir hesap giriş yapamadıysa null döndür
        return null;
    }


}
