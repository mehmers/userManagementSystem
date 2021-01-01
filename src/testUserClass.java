import java.util.Scanner;
import java.util.Random;

class testUserClass {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("-- USER MANAGEMENT SYSTEM --\n");
    System.out.print("Enter username :");
    String username1 = input.next();
    while(username1.length() < 4){
      System.out.print("\nUsername should be longer than 3 character.\nEnter username : ");
      username1 = input.next();
    }
    System.out.print("\nEnter password :");
    String password1 = input.next();
    while(password1.length() < 6 || password1.length() > 100){
      System.out.print("\nPassword should be longer than 5 character and lower than 101 characters.\nEnter password : ");
      password1 = input.next();
    }
    System.out.print("\nEnter email :");
    String email1 = input.next();
    while(!email1.contains("@") || !email1.contains(".") || email1.length() < 5){
      System.out.print("\nInvalid e-mail format.\nEnter a valid e-mail : ");
      email1 = input.next();
    }
    System.out.print("\nCreating your account...");

    System.out.println("");
    User user1 = new User(username1, password1, email1);
    String user1s = user1.toString();
    System.out.println("\nYour account created successfully !\n" + user1s);

    System.out.print("Enter random password length : ");
    int newPasswordLength1 = input.nextInt();
    while(newPasswordLength1 < 6 || newPasswordLength1 > 100){
      System.out.print("\nPassword should be longer than 5 character and lower than 101 characters.\nEnter password : ");
      newPasswordLength1 = input.nextInt();
    }
    user1.setRandomPassword(newPasswordLength1);
    System.out.println("\nUpdated account details are : ");
    String newUser1s = user1.toString();
    System.out.println(newUser1s);
    }
}
