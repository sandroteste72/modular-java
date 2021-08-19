package digital.innvation.one.core;

import digital.innovation.one.utils.operation.Calculator;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 9));
    }
}
