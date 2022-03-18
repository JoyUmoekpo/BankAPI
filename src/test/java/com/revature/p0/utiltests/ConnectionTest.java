package com.revature.p0.utiltests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.p0.utils.ConnectionUtil;

import java.sql.Connection;

public class ConnectionTest {
    @Test
    void generate_connection() {
        Connection conn = ConnectionUtil.createConnection();
        Assertions.assertNotNull(conn);
    }
}
