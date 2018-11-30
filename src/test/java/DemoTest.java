import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import model.User;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DemoTest {

    @Test
    @DisplayName("Run forest run!")
    @Tag("smoke")
    public void dummyTest() {

        User user = User.builder().build();

        assertFalse(user.getName().isEmpty());
    }
}
