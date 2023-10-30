FROM openjdk:latest
WORKDIR /src/app
COPY src/main/java /src/app
RUN javac org/example/Calculator.java org/example/model/CalculatorModel.java org/example/presenter/CalculatorPresenter.java org/example/view/impl/CalculatorView.java
CMD ["java", "org.example.Calculator"]