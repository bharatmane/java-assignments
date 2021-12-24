package com.bharatmane.genericsdemo;

import com.bharatmane.genericsdemo.dao.UserDao;
import com.bharatmane.genericsdemo.entities.Customer;

import java.util.List;


public class BankingApplication {

    private final Prompter prompter;
    private final UserDao<Customer> userDao;
    public BankingApplication(Prompter prompter) {
        this.prompter = prompter;
        userDao = new UserDao<>();
    }

    public void run() {
        prompter.greetUser();
        Operation operation;
        do
        {
            operation = Operation.values()[prompter.promptOperation() - 1];
            processOperationMenu(operation);
        }   while(operation != Operation.EXIT);

    }

    private void processOperationMenu(Operation operation) {
        switch(operation){
            case REGISTRATION:
                userDao.create(new Customer("Bob", "Smith", 1L));
                prompter.registrationSuccessful();
                break;
            case UPDATE:
                userDao.update(new Customer("Martin", "Fowler", 1L));
                prompter.updationSuccessful();
                break;
            case DISPLAY_DATA:
                List<Customer> customers = userDao.getAllUsers();
                prompter.displayData(customers);
                break;
            case DELETE:
                userDao.delete(new Customer("Martin", "Fowler", 1L));
                prompter.deletionSuccessful();
                break;
            case EXIT:
                prompter.promptGoodBye();
                break;
        }
    }
}
