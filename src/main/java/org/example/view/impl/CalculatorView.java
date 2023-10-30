package org.example.view.impl;

import org.example.view.View;

public class CalculatorView implements View {

    @Override
    public void displayResults(double result) {
        System.out.println("Ваш результат: " + result);
    }

    @Override
    public void displayError(Exception e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
}
