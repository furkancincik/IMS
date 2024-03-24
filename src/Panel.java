import java.util.Scanner;

public class Panel {
    static User user;
    static Account account;
    static AccountManager accountManager;
    static Address address;
    static Insurance insurance;
    static Scanner inp = new Scanner(System.in);
    static PanelRun panelRun = new PanelRun();

    public void run() {
        accountManager = new AccountManager(); // AccountManager başlatıldı

        boolean isRun = true;
        while (isRun) {
            System.out.println("----------Insurance Interface---------");
            System.out.println("|                                    |");
            System.out.println("|         1-LogIn                    |");
            System.out.println("|         2-Create Account           |");
            System.out.println("|         0-Exit Program             |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            System.out.print("Enter: ");

            while (!inp.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                inp.next(); // Hatalı girişi temizle
            }

            int preference = inp.nextInt();
            switch (preference) {
                case 0:
                    System.out.println("Çıkış Yapılıyor");
                    isRun = false;
                    break;
                case 1:
                    System.out.println("Login işlemi yapılır");
                    System.out.print("E-posta: ");
                    String email = inp.next();
                    System.out.print("Şifre: ");
                    String password = inp.next();

                    try {
                        // Kullanıcı girişini kontrol et
                        user = accountManager.login(email, password);
                        System.out.println("Giriş başarılı! Hoş geldiniz, " + user.getName() + "!");
                    } catch (InvalidAuthenticationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    // Yeni hesap oluşturma işlemi burada gerçekleşecek
                    panelRun.addUser();
                    break;
                default:
                    System.out.println("Geçersiz Seçenek");
            }
        }
    }
}
