import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailBoxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email:" + this.firstName + this.lastName + "@department.com");

    }

    public String department() {
        System.out.println("What is your department \n1: for Sales, \n2: for Developers, \n3: for Accountant");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else {
            return "";
        }
    }

}
