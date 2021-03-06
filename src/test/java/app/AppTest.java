package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private App app;
    @BeforeEach
    void setUp() {
        app = new App();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("main app entry")
    void main() {
        String[] args = {"this", "is", "args"};
        app.main(args);
    }

    @Test
    @DisplayName("x * x")
    void sqrt() {
        assertEquals(4, app.sqrt(2));
    }

    @Test
    @DisplayName("x + y")
    void sum() {
        assertEquals(4, app.sum(1,3));
    }

    @Test
    @DisplayName("x - y")
    void min() {
        assertEquals(1, app.min(4, 3));
    }
}
