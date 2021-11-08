package Observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User sender;
    private User receiver;

    @BeforeEach
    void setUp() {
        sender = new Sender();
        receiver = new Receiver();
    }

    @Test
    void constructor() {
        assertEquals(1, receiver.id - sender.id);
    }

    @Test
    void update() {
        sender.update("status1");
        receiver.update("status2");
    }
}
