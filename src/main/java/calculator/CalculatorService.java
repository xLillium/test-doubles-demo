package calculator;

public class CalculatorService {
    private final AddService addService;
    private final MultiplyService multiplyService;

    public CalculatorService(AddService addService, MultiplyService multiplyService) {
        this.addService = addService;
        this.multiplyService = multiplyService;
    }

    public int performAddition(int a, int b) {
        return addService.add(a, b);
    }

    public int performMultiplication(int a, int b) {
        return multiplyService.multiply(a, b);
    }
}
