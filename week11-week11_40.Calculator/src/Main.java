

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CalculatorLogic calc = new CalculatorLogic();
        GraphicCalculator graphic = new GraphicCalculator(calc);
        SwingUtilities.invokeLater(graphic);
    }
}
