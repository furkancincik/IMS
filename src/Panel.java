import java.util.Scanner;

public class Panel {
    static User user;
    static Account account;
    static Address address;
    static Insurance insurance;
    static Scanner inp = new Scanner(System.in);



    public static void run() {

        boolean isRun=true;
        while (isRun) {
            System.out.println("""
                                                   
                    ----------Insurance Interface---------
                    1-LogIn
                    2-Create Account
                    0-Exit Program
                     --------------------------------------
                    Enter:\\\s""");


            while (!inp.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                inp.next(); // Hatalı girişi temizle
            }

            int preference = inp.nextInt();
            switch (preference){

                case 0:
                    System.out.println("Çıkış Yapılıyor");
                    isRun=false;
                    break;
                case 1:
                    System.out.println("Login işlemi yapılır");
                    account.login(user.getEmail(),user.getPassword());
                    break;
                case 2:
                    System.out.println("Yeni hesap oluşturulur");
                    break;
                default:
                    System.out.println("Geçersiz Seçenek");
            }



        }


    }

}
