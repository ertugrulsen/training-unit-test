package com.definex.tddunit.database;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DatabaseTest {
    @Mock
    private Database database;

    private Credentials credentials = new Credentials("user", "password");

    @Test
    void testUserSuccessfulLogin() {
        when(database.login(credentials)).thenReturn(true);
        Credentials sameCredentials = new Credentials("user", "password");
        assertTrue(database.login(sameCredentials));
    }
    @Test
    void testUserFailedlLogin() {
        when(database.login(credentials)).thenReturn(true);
        Credentials otherCredentials = new Credentials("user", "password");
        otherCredentials.setPassword("setPassword");
        otherCredentials.setUsername("setUsername");
        assertNotEquals(credentials.getPassword(), otherCredentials.getPassword());
        assertNotEquals(credentials.getUsername(), otherCredentials.getUsername());
        assertFalse(database.login(otherCredentials));
    }
}
