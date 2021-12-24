package com.bharatmane.genericsdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prompter prompter = new Prompter(System.out,scanner);
        BankingApplication bankingApplication = new BankingApplication(prompter);
        bankingApplication.run();
    }
}
