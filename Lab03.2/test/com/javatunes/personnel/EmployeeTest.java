package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Ms. Purr", Date.valueOf("2009-01-01"));
        emp1 = new SalariedEmployee("Ms. Purr", Date.valueOf("2009-01-01"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("Keakster");

        assertNotEquals(emp1, emp2);
        assertFalse(emp1.equals(emp2));
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2020-02-02"));

        assertNotEquals(emp1, emp2);  // this does a !.equals() check
        assertFalse(emp1.equals(emp2));  // alternative assertion
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp1, emp2);  // this does a .equals() check
        assertTrue(emp1.equals(emp2));  // alternative assertion
    }
}