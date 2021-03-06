package com.voloshyn.mykyta.test.java;

import com.voloshyn.mykyta.main.java.User;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;


/**
 * Created by VSV on 16/01/17.
 */
public class UserTest extends TestCase {

    private User user;
    private Date dateOfBirth;

    protected void setUp() throws Exception {
        super.setUp();
        user = new User();

        Calendar calendar = Calendar.getInstance();
        calendar.set(1984, Calendar.MAY, 26);
        dateOfBirth = calendar.getTime();
    }

    public void testGetFullName() {
        user.setFirstname("John");
        user.setLastName("Doe");
        assertEquals("Doe, John", user.getFullName());
    }

    public void testGetAge() {
        user.setDateOfBirthd(dateOfBirth);
        assertEquals(2017 - 1984, user.getAge());
    }

}