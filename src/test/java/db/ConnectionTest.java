package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection database = Connection.getConnection();
    Connection oldNewdatabase = Connection.getConnection();

    @Test
    void getConnection() {
        assertEquals(database, oldNewdatabase);
    }
}