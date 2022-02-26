package com.rmit.sept.bk_loginservices;

import com.rmit.sept.bk_loginservices.model.User;
import org.assertj.core.util.Throwables;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class msloginTests {



    @Test
    void contextLoads() {
    }

    @Test
    void getUser_NoUserExists_ExceptionThrown() {
        User nullUser = null;
        Throwable exception = assertThrows(NullPointerException.class, () -> nullUser.getId());
        //assertEquals("User cannot be Null", exception.getMessage());
    }

}
