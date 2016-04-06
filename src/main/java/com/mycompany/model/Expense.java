package com.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by anuradha on 3/10/2016.
 */
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String expenseName;
    private int expense;

    public Expense() {
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expenseName='" + expenseName + '\'' +
                ", expense=" + expense +
                '}';
    }

    public Expense(String expenseName, int expenseValue) {
        this.expenseName = expenseName;
        this.expense = expenseValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }


    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }
}
