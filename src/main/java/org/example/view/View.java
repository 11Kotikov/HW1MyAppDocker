package org.example.view;

public interface View {
    // Метод для отображения результатов операций
    void displayResults(double result);

    void displayError(Exception e);
}
