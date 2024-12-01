
import java.util.Scanner;

public class AccountSystem {

    private String NewUser, user, Newpassword, password;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AccountSystem account = new AccountSystem();
        int choice = 0;

        do {
            System.out.println(" ________                                    __     ______  ");
            System.out.println("/        |                                 _/  |   /      \\ ");
            System.out.println("$$$$$$$$/__    __       ______    ______  / $$ |  /$$$$$$  |");
            System.out.println("$$ |__  /  \\  /  |     /      \\  /      \\ $$$$ |  $$ ___$$ |");
            System.out.println("$$    | $$  \\/$$/     /$$$$$$  |/$$$$$$  |  $$ |    /   $$< ");
            System.out.println("$$$$$/   $$  $$<      $$ |  $$/ $$ |  $$ |  $$ |   _$$$$$  |");
            System.out.println("$$ |     /$$$$  \\  __ $$ |      $$ \\__$$ | _$$ |_ /  \\__$$ |");
            System.out.println("$$ |    /$$/ $$  |/  |$$ |      $$    $$ |/ $$   |$$    $$/ ");
            System.out.println("$$/     $$/   $$/ $$/ $$/        $$$$$$$ |$$$$$$/  $$$$$$/  ");
            System.out.println("                                /  \\__$$ |                  ");
            System.out.println("                                $$    $$/                   ");
            System.out.println("                                 $$$$$$/                    ");

            System.out.println("1. create Account");
            System.out.println("2. Login");
            System.out.println("3.Exit");
            System.out.println("Choose an option : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    account.NewAccount();
                    break;
                case 2:
                    account.Login();
                    break;
                case 3:
                    System.out.println("Exiting..... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;

            }

        } while (choice != 3);

    }

    public void NewAccount() {
        String ConfirmPassword;
        try {
            System.out.println("\n=== Create Account ===");
            System.out.println("create new user");
            NewUser = input.nextLine();

            input.nextLine();
            System.out.println("Create a new password");
            Newpassword = input.nextLine();
            System.out.println("Confirm password");
            ConfirmPassword = input.nextLine();

            if (NewUser.isEmpty() || Newpassword.isEmpty()) {
                System.out.println("Error : Username and password cannot be empty.");
                return;
            }

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

        input.nextLine();
        System.out.println("Enter ur password : ");
        password = input.nextLine();

        if (user.equals(NewUser) && password.equals(Newpassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
