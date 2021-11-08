package QuickOrder;

import Observer.Order;
import org.junit.jupiter.api.Test;

class FastOrderConstructorTest {

    @Test
    void createOrder() {
        Order quickOrder = FastOrderConstructor.createOrder(FastOrderConstructor.ROSE_BUCKET);
    }
}
