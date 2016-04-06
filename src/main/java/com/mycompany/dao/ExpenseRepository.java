package com.mycompany.dao;

import com.mycompany.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by anuradha on 3/10/2016.
 */
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
