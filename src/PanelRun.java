import java.util.*;

public class PanelRun {
    static AccountManager accountManager=new AccountManager();
    static AddressManager addressManager = new AddressManager();
     private static Scanner inp = new Scanner(System.in);






    //createUser metodunu burada döngüye sok
    public Set<User> addUser(){
        System.out.println("---- YENI HESAP OLUSTURMA MENUSU ----");
        System.out.println("---- 1- BIREYSEL                 ----");
        System.out.println("---- 2- KURUMSAL                 ----");
        System.out.println("---- 0- CIKIS                    ----");
        System.out.println();

        int choice=inp.nextInt();
        inp.nextLine();


        switch (choice){
            case 0:
                System.out.println("Ana menüye dönülüyor.");
                break;
            case 1:
                System.out.println("---- BIREYSEL OLUSTURMA MENUSU   ----");

                System.out.print("AD:");
                String name=inp.nextLine();

                System.out.print("SOYAD");
                String lastName=inp.nextLine();

                System.out.print("E-MAIL");
                String email=inp.nextLine();

                System.out.print("SIFRE");
                String password=inp.nextLine();


                System.out.print("MESLEK");
                String job=inp.nextLine();

                System.out.print("YAS");
                int age=inp.nextInt();
                inp.nextLine();

                Date date=new Date();
                accountManager.addUser(accountManager.createUser(name,lastName,email,password,job,age,date));
                break;

            case 2:
                System.out.println("---- KURUMSAL OLUSTURMA MENUSU   ----");

                System.out.print("AD:");
                String name2=inp.nextLine();

                System.out.print("SOYAD");
                String lastName2=inp.nextLine();

                System.out.print("E-MAIL");
                String email2=inp.nextLine();

                System.out.print("SIFRE");
                String password2=inp.nextLine();


                System.out.print("MESLEK");
                String job2=inp.nextLine();

                System.out.print("YAS");
                int age2=inp.nextInt();
                inp.nextLine();

                Date date2=new Date();

                accountManager.addUser(accountManager.createUser(name2,lastName2,email2,password2,job2,age2,date2));
                break;

        }

        return accountManager.getUsers();
    }











}
