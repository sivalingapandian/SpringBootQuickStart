package com.mycompany.controller;

import com.mycompany.dao.ExpenseRepository;
import com.mycompany.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by anuradha on 3/10/2016.
 */
@RestController
public class MyAppController {

    @Autowired
    ExpenseRepository expenseRepository;

    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/expenses/{expenseName}/expenseValue/{expenseValue}")
    public String enterExpense(@PathVariable String expenseName, @PathVariable int expenseValue) {
        return expenseRepository.save(new Expense(expenseName, expenseValue)).toString();
    }

    @RequestMapping("/expenses")
    public List<Expense> getList() {
        return expenseRepository.findAll();
    }

}
