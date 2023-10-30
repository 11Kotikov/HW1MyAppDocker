package org.example.presenter;

import org.example.model.CalculatorModel;
import org.example.view.impl.CalculatorView;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate(char operator, int operand1, int operand2) {
        try {
            switch (operator) {
                case '+':
                    view.displayResults(model.add(operand1, operand2));
                    break;
                case '-':
                    view.displayResults(model.subtract(operand1, operand2));
                    break;
                case '*':
                    view.displayResults(model.multiply(operand1, operand2));
                    break;
                case '/':
                    view.displayResults(model.divide(operand1, operand2));
                    break;
                default:
                    throw new IllegalArgumentException("Неверный оператор");
            }
        } catch (Exception e) {
            view.displayError(e);
        }
    }
}