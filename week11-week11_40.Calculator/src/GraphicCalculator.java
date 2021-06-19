
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private CalculatorLogic calc;
    
    public GraphicCalculator(CalculatorLogic calc){
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField output = new JTextField(String.valueOf(this.calc.getValue()));
        output.setEnabled(false);
        
        JTextField input = new JTextField();
        
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton clear = new JButton("Z");
        
        clear.setEnabled(false);
        
        AddListener addListener = new AddListener(this.calc, output, input, clear);
        plus.addActionListener(addListener);
        
        MinusListener minusListener = new MinusListener(this.calc, output, input, clear);
        minus.addActionListener(minusListener);
        
        ResetListener resetListener = new ResetListener(this.calc, output, input, clear);
        clear.addActionListener(resetListener);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(clear);
        
        container.add(output);
        container.add(input);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
