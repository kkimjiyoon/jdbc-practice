package com.nhnacademy.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@Slf4j
public class DriverLoadTest {

    @Test
    @DisplayName("mysql driver load : success")
    public void mysql_driverLoadTest() {

        try {
            Class<?> driver = Class.forName("com.mysql.cj.jdbc.Driver");
            log.info("driver:{}", driver.getName());
            Assertions.assertEquals(driver.getName(), com.mysql.cj.jdbc.Driver.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
