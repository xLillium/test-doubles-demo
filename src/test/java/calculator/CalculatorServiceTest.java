package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {
    @Test
    void Should_ReturnSum_When_PerformingAddition() {
        // Arrange with Real Services
        AddService addService = new AddService();
        MultiplyService multiplyService = new MultiplyService();
        CalculatorService calculatorService = new CalculatorService(addService, multiplyService);
        // Arrange with Mocked Service
//        AddService addServiceMock = mock(AddService.class);
//        MultiplyService multiplyServiceMock = mock(MultiplyService.class);
//        when(addServiceMock.add(10, 20)).thenReturn(30);
//        CalculatorService calculatorService = new CalculatorService(addServiceMock, multiplyServiceMock);

        // Act
        int result = calculatorService.performAddition(10, 20);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void Should_ReturnProduct_When_PerformingMultiplication() {
        // Arrange with Real Services
        AddService addService = new AddService();
        MultiplyService multiplyService = new MultiplyService();
        CalculatorService calculatorService = new CalculatorService(addService, multiplyService);
        // Arrange with Mocked Service
//        AddService addServiceMock = mock(AddService.class);
//        MultiplyService multiplyServiceMock = mock(MultiplyService.class);
//        when(multiplyServiceMock.multiply(10, 20)).thenReturn(200);
//        CalculatorService calculatorService = new CalculatorService(addServiceMock, multiplyServiceMock);

        // Act
        int result = calculatorService.performMultiplication(10, 20);

        // Assert
        assertEquals(200, result);
    }
}
