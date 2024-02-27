import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculatorApplet extends JApplet implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;

    public void init() {
        // Set up the layout
        getContentPane().setLayout(new BorderLayout());

        // Create the input and result fields
        inputField = new JTextField(20);
        inputField.setEditable(false);
        resultField = new JTextField(20);
        resultField.setEditable(false);

        // Create the buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(5, 5));
        String[] buttonLabels = {
            "7", "8", "9", "/", "C",
            "4", "5", "6", "*", "(",
            "1", "2", "3", "-", ")",
            "0", ".", "pi", "+", "="
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonsPanel.add(button);
        }

        // Add components to the content pane
        getContentPane().add(inputField, BorderLayout.NORTH);
        getContentPane().add(resultField, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            evaluateExpression();
        } else if (command.equals("C")) {
            inputField.setText("");
            resultField.setText("");
        } else {
            inputField.setText(inputField.getText() + command);
        }
    }

    private void evaluateExpression() {
        String expression = inputField.getText();
        try {
            double result = evaluate(expression);
            resultField.setText(Double.toString(result));
        } catch (ArithmeticException | IllegalArgumentException ex) {
            resultField.setText("Error: " + ex.getMessage());
        }
    }

    private double evaluate(String expression) {
        // Implement the expression evaluation logic here
        // This is a placeholder method, you need to replace it with a proper implementation
        // For simplicity, this method just returns 0
        return 0;
    }
}
