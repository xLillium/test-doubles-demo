package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {
    @Test
    void Should_ReturnSum_When_AddingTwoNumbers() {
        // Arrange
        AddService addService = new AddService();
        int a = 10;
        int b = 20;

        // Act
        int result = addService.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}
