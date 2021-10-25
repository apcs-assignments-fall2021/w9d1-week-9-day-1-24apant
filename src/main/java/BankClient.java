import java.util.Objects;
import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        String prefName;
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        BankAccount account = new BankAccount(name, 101134);

        while(true){
            System.out.println("Hi " + account.getPreferredName() + ", What command would you like to carry out? (withdraw/deposit/check balance/check account number/set preferred name/print summary)? ");
            response = scan.nextLine();
            if(Objects.equals(response, "check balance")){
                System.out.println("Current Balance: " + account.getBalance());
            }
            else if(Objects.equals(response, "deposit")){
                System.out.println("How much money would you like to deposit?");
                account.deposit(Integer.parseInt(scan.nextLine()));
            }

            else if(Objects.equals(response, "withdraw")){
                System.out.println("How much money would you like to withdraw?");
                    account.withdraw(Integer.parseInt(scan.nextLine()));

            }
            else if(Objects.equals(response, "check account number")){
                System.out.println("Account Number: " + account.getAccountNumber());
            }
            else if(Objects.equals(response, "set preferred name")){
                System.out.println("What would you like to set your preferred name to? ");
                prefName = scan.nextLine();
                account.setPreferredName(prefName);
                System.out.println("Name successfully changed to: " + prefName);
            }
            else if(Objects.equals(response, "print summary")){
                System.out.println(account);
            }






        }
    }
}
