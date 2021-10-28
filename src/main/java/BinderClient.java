import java.util.Objects;
import java.util.Scanner;

public class BinderClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        String prefName;
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        System.out.println("How many classes do you take?");
        int numClass = Integer.parseInt(scan.nextLine());

        Binder account = new Binder(numClass, name);

        while(true){
            System.out.println("Hi " + account.getStudentName() + ", What command would you like to carry out? (add class, replace class, gen new id, change name, get classes, get student summary)? ");
            response = scan.nextLine();
            if(Objects.equals(response, "add class")){
                System.out.println("What is the name of the class you would like to add?");
                account.addClass((scan.nextLine()));
            }
            else if(Objects.equals(response, "replace class")){
                System.out.println("What is the name of the class you would like to replace?");
                String oldClass = scan.nextLine();
                System.out.println("What is the name of the new class you would like?");

                account.replaceClass(oldClass, (scan.nextLine()));
            }

            else if(Objects.equals(response, "gen new id")){
                account.genNewID();
            }
            else if(Objects.equals(response, "set preferred name")){
                System.out.println("What is your new preferred name? ");
                account.changePreferredName(scan.nextLine());
            }

            else if(Objects.equals(response, "get classes")){
                System.out.println(account);
            }

            else if(Objects.equals(response, "get student summary")){
                System.out.println(account.getStudentSummary());
            }







        }
    }
}
