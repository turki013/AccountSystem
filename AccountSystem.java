
import java.util.Scanner;

public class AccountSystem {

    String NewUser, user, Newpassword, password;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AccountSystem account = new AccountSystem();
        account.NewAccount();
        account.Login();

    }

    public void NewAccount() {
        String ConfirmPassword;
        try {
            System.out.println("create new user");
            NewUser = input.nextLine();
            System.out.println("Create a new password");
            Newpassword = input.nextLine();
            System.out.println("Confirm password");
            ConfirmPassword = input.nextLine();

            if (Newpassword.equals(ConfirmPassword)) {
                System.out.println("The account has been created successfully....");
            } else {
                System.out.println("Please enter valid data");
            }
        } catch (Exception e) {
            System.out.println("Please Enter A-z and 0-9 only");
        }
    }

    public void Login() {
        System.out.println("Enter ur user : ");
        user = input.nextLine();

        System.out.println("Enter ur password : ");
        password = input.nextLine();

        if (user.equals(NewUser) && password.equals(Newpassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
