package com.definex.tddunit.database;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DatabaseTest {
    @Mock
    private Database database;

    private Credentials credentials = new Credentials("username","password");

    @Test
    void testUserSuccessfulLogin(){
        when(database.login(credentials)).thenReturn(true);
        Credentials sameCredentials = new Credentials("username", "password");
        assertTrue(database.login(sameCredentials));
    }

    @Test
    void testUserFailedLogin(){
        when(database.login(credentials)).thenReturn(true);
        Credentials otherCredentials = new Credentials("username","username");
        otherCredentials.setUsername("setUsername");
        otherCredentials.setPassword("setPassword");
        assertNotEquals(credentials.getPassword(), otherCredentials.getPassword());
    }

}
