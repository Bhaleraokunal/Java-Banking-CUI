import java.util.Scanner;

class BankAccount {
    static double balance;
    static long accno;
    static int pin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------Select the option from below---------------------");
            System.out.println("1) Create Bank Account :");
            System.out.println("2) Withdraw Money :");
            System.out.println("3) Deposit Money :");
            System.out.println("4) Change PIN :");
            System.out.println("5) Check Balance :");
            System.out.println("0) Exit :");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter your Account number:");
                    long acno = sc.nextLong();
                    System.out.println("Enter your pin:");
                    int acpin = sc.nextInt();
                    createAccount(acno, acpin);
                    break;

                case 2:
                    System.out.println("Enter your Account number:");
                    acno = sc.nextLong();
                    System.out.println("Enter your pin:");
                    acpin = sc.nextInt();
                    System.out.println("Enter the amount:");
                    int amt = sc.nextInt();
                    withdraw(acno, acpin, amt);
                    break;

                case 3:
                    System.out.println("Enter your Account number:");
                    acno = sc.nextLong();
                    System.out.println("Enter your pin:");
                    acpin = sc.nextInt();
                    System.out.println("Enter the amount:");
                    amt = sc.nextInt();
                    deposit(acno, acpin, amt);
                    break;

                case 4:
                    System.out.println("Enter your Account number:");
                    acno = sc.nextLong();
                    System.out.println("Enter your old PIN:");
                    acpin = sc.nextInt();
                    System.out.println("Enter your new PIN:");
                    amt = sc.nextInt();
                    pinChange(acno, acpin, amt);
                    break;

                case 5:
                    System.out.println("Enter your Account number:");
                    acno = sc.nextLong();
                    System.out.println("Enter your pin:");
                    acpin = sc.nextInt();
                    checkBalance(acno, acpin);
                    break;

                case 0:
                    System.out.println("Thank you for using my banking system!");
                    return;

                default:
                    System.out.println("Invalid number");
            }
        }
    }

    public static void createAccount(long acno, int acpin) {
        if (accno == 0 && pin == 0) {
            accno = acno;
            pin = acpin;
            System.out.println("Your account is created successfully");
        } else {
            System.out.println("Account is already created");
        }
    }

    public static void checkBalance(long acno, int acpin) {
        if (accno > 0 && pin > 0) {
            if (accno == acno && pin == acpin) {
                System.out.println("Your bank balance is ₹" + balance);
            } else {
                System.out.println("Invalid Credentials");
            }
        } else {
            System.out.println("Account is not created");
        }
    }

    public static void withdraw(long acno, int acpin, int amt) {
        if (accno > 0 && pin > 0) {
            if (accno == acno && pin == acpin) {
                if (balance - amt >= 1000) {
                    balance = balance - amt;
                    System.out.println("--------------------------------------");
                    System.out.println("Amount withdrawn: ₹" + amt);
                    System.out.println("New Balance: ₹" + balance);
                    System.out.println("--------------------------------------");
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println("Invalid Credentials");
            }
        } else {
            System.out.println("Account is not created");
        }
    }

    public static void deposit(long acno, int acpin, int amt) {
        if (accno > 0 && pin > 0) {
            if (accno == acno && pin == acpin) {
                balance = balance + amt;
                System.out.println("--------------------------------------");
                System.out.println("Amount deposited: ₹" + amt);
                System.out.println("New Balance: ₹" + balance);
                System.out.println("--------------------------------------");
            } else {
                System.out.println("Invalid Credentials");
            }
        } else {
            System.out.println("Account is not created");
        }
    }

    public static void pinChange(long acno, int oldpin, int newpin) {
        if (accno > 0 && pin > 0) {
            if (accno == acno && pin == oldpin) {
                pin = newpin;
                System.out.println("Your PIN has been changed successfully");
            } else {
                System.out.println("Invalid Credentials");
            }
        } else {
            System.out.println("Account is not created");
        }
    }
}
