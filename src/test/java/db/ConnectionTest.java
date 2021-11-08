package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection c1;
    private Connection c2;

    @BeforeEach
    void setUp() {
        c1 = Connection.getConnection();
        c2 = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertSame(c1, c2);
    }
}
