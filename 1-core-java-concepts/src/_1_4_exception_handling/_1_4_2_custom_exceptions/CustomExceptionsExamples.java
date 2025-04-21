package _1_4_exception_handling._1_4_2_custom_exceptions;

import java.io.IOException;

// Custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// Another unchecked exception
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Another custom exception with multiple constructors
class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class CustomExceptionsExamples {

    public static void main(String[] args) {
        testCheckedCustomException();
        testUncheckedCustomException();
        testRealWorldBankScenario();
        testMultipleConstructors();
    }

    // 1. Using a checked custom exception
    public static void testCheckedCustomException() {
        System.out.println("== Checked Custom Exception Example ==");
        try {
            registerVoter(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();
    }

    public static void registerVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to vote.");
        }
        System.out.println("Voter registered successfully.");
    }

    // 2. Using an unchecked custom exception
    public static void testUncheckedCustomException() {
        System.out.println("== Unchecked Custom Exception Example ==");
        try {
            deposit(-500);
        } catch (NegativeAmountException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();
    }

    public static void deposit(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot deposit a negative amount.");
        }
        System.out.println("Deposited: $" + amount);
    }

    // 3. Real-world example: bank withdrawal
    public static void testRealWorldBankScenario() {
        System.out.println("== Bank Withdrawal Example ==");
        BankAccount account = new BankAccount(500.0);
        try {
            account.withdraw(1000); // Will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();
    }

    // BankAccount class inside the same file for simplicity
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void withdraw(double amount) {
            if (amount < 0) {
                throw new NegativeAmountException("Amount must be positive.");
            }
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Available: $" + balance);
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }

    // 4. Custom exception with multiple constructors
    public static void testMultipleConstructors() {
        System.out.println("== Custom Exception With Multiple Constructors ==");
        try {
            simulateDataLookup();
        } catch (DataNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause());
            }
        }
        System.out.println();
    }

    public static void simulateDataLookup() {
        try {
            throw new IOException("File not found.");
        } catch (IOException e) {
            throw new DataNotFoundException("Data could not be loaded from the source.", e);
        }
    }
}

