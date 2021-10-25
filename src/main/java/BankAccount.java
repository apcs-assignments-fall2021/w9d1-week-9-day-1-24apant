public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;
    public BankAccount(String name, int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.preferredName = name;
    }

   public void withdraw(int x){
        if (x > this.balance){
            System.out.println("ERROR excf007: USER ATTEMPTED TO WITHDRAW $" + x + " FROM ACCOUNT#" + this.accountNumber + " WITH A BALANCE OF $" + this.balance);
            System.out.println("Sorry, you cannot withdraw more than what you have.\n");
        }
        else{
            this.balance -= x;
            System.out.println("Successfully withdrawn $" + x);
        }

   }

   public void deposit(int x){
        this.balance += x;
   }

   public int getBalance(){
        return this.balance;
   }

   public int getAccountNumber(){
        return this.accountNumber;
   }

   public String getPreferredName(){
        return this.preferredName;
   }

   public void setPreferredName(String s){
        this.preferredName = s;
   }

   @Override
   public String toString(){
    return "Account number " + accountNumber + " has a bank balance of: $" + balance;
   }



}