package com.bharatmane.genericsdemo;

import com.bharatmane.genericsdemo.entities.Customer;
import com.bharatmane.genericsdemo.entities.User;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class Prompter {

    private final PrintStream stdOut;
    private final Scanner scanner;
    private String lastInput;
    public Prompter(PrintStream stdOut, Scanner scanner) {
        this.stdOut = stdOut;
        this.scanner = scanner;
    }

    public void greetUser() {
        print("!!!!! Welcome to user CRUD Services !!!!!");
        print("-------------------------------------------------");
    }

    private void print(String message) {
        stdOut.println(message);
    }

    private void prompt() {
        stdOut.print("> ");
        lastInput = scanner.nextLine();
    }

    public int promptOperation() {
        print("Enter the operation that you want to perform");
        print("---------------------------------------------------");
        print("1. Registration");
        print("2. Update");
        print("3. Display Data");
        print("4. Delete");
        print("5. Exit");
        print("---------------------------------------------------");
        prompt();
        return Integer.parseInt(lastInput);
    }

    public void promptGoodBye() {
        print("Thank you for working with us, visit again.");
    }

    public void registrationSuccessful() {
        print("New registration completed successfully");
    }

    public void updationSuccessful() {
        print("Updation completed successfully");
    }

    public void displayData(List<Customer> users) {
        print("List of all customers");
        print("Id\t\tName");
        print("--------------------------------------------------------------------------------");
        for (User user : users) {
            print(user.getId() + "\t\t" + user.getFistName() + " " + user.getLastName());
        }
    }

    public void deletionSuccessful() {
        print("Deletion completed successfully");
    }
}

