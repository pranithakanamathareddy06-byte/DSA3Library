interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
}

class ScientificCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}

class FinancialCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    public double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

class CalculatorDemoAbstract {
    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();
        FinancialCalculator fc = new FinancialCalculator();

        System.out.println("Scientific Add: " + sc.add(10, 20));
        System.out.println("Scientific Square Root: " + sc.squareRoot(25));

        System.out.println("Financial Subtract: " + fc.subtract(5000, 1500));
        System.out.println("Financial Interest: " + fc.calculateInterest(10000, 5, 2));
    }
}
