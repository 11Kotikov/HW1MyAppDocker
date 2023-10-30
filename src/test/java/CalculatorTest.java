import org.example.Calculator;
import org.example.model.CalculatorModel;
import org.example.presenter.CalculatorPresenter;
import org.example.view.impl.CalculatorView;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    @Test
    public void testAdd() {
        CalculatorModel model = new CalculatorModel();
        int result = model.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        CalculatorModel model = new CalculatorModel();
        int result = model.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        CalculatorModel model = new CalculatorModel();
        int result = model.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        CalculatorModel model = new CalculatorModel();
        int result = model.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        CalculatorModel model = new CalculatorModel();
        assertThrows(ArithmeticException.class, () -> {
            model.divide(10, 0);
        });
    }

    @Test
    public void testPresenter() {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        presenter.calculate('+', 3, 4);
    }
}

