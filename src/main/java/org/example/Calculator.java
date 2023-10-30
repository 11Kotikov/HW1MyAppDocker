package org.example;

import org.example.model.CalculatorModel;
import org.example.presenter.CalculatorPresenter;
import org.example.view.impl.CalculatorView;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        System.out.println("Введите допустимую операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите первый операнд: ");
        int operand1 = scanner.nextInt();

        System.out.println("Введите второй операнд: ");
        int operand2 = scanner.nextInt();

        presenter.calculate(operator, operand1, operand2);
    }
}