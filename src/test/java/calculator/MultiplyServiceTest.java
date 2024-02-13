package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyServiceTest {
    @Test
    void Should_ReturnProduct_When_MultiplyingTwoNumbers() {
        // Arrange
        MultiplyService multiplyService = new MultiplyService();
        int a = 10;
        int b = 20;

        // Act
        int result = multiplyService.multiply(a, b);

        // Assert
        assertEquals(200, result);
    }
}
