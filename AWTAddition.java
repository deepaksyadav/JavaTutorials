import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

// Main class for the AWT addition application
public class AWTAddition extends Frame implements ActionListener {

    // Declare GUI components
    TextField tfNum1, tfNum2, tfResult;
    Button btnAdd;
    Label lblNum1, lblNum2, lblResult;

    // Constructor to set up the GUI
    AWTAddition() {
        // Set the title of the frame
        setTitle("Addition of Two Numbers");

        // Initialize components
        lblNum1 = new Label("First Number:");
        lblNum2 = new Label("Second Number:");
        lblResult = new Label("Result:");

        tfNum1 = new TextField(10); // 10 columns wide
        tfNum2 = new TextField(10);
        tfResult = new TextField(10);
        tfResult.setEditable(false); // Make the result field read-only

        btnAdd = new Button("Add");

        // Set layout to null for manual positioning using setBounds()
        setLayout(null);

        // Set positions and sizes for components
        // Labels
        lblNum1.setBounds(50, 50, 100, 20); // x, y, width, height
        lblNum2.setBounds(50, 90, 100, 20);
        lblResult.setBounds(50, 170, 100, 20);

        // TextFields
        tfNum1.setBounds(160, 50, 120, 25);
        tfNum2.setBounds(160, 90, 120, 25);
        tfResult.setBounds(160, 170, 120, 25);

        // Button
        btnAdd.setBounds(120, 130, 80, 30); // Position the button between inputs and result

        // Add components to the frame
        add(lblNum1);
        add(tfNum1);
        add(lblNum2);
        add(tfNum2);
        add(btnAdd);
        add(lblResult);
        add(tfResult);

        // Set frame size and make it visible
        setSize(350, 250); // Adjust size to fit components better
        setVisible(true);

        // Register the button with an ActionListener
        btnAdd.addActionListener(this);

        // Add a WindowListener to handle closing the window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Terminate the program when the window is closed
            }
        });
    }

    // This method is called when the "Add" button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            try {
                // Get text from input fields
                String sNum1 = tfNum1.getText();
                String sNum2 = tfNum2.getText();

                // Convert text to double (for potential decimal numbers)
                double num1 = Double.parseDouble(sNum1);
                double num2 = Double.parseDouble(sNum2);

                // Perform addition
                double sum = num1 + num2;

                // Display the result in the result TextField
                tfResult.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                // Handle cases where input is not a valid number
                tfResult.setText("Invalid Input!");
                System.err.println("Error: " + ex.getMessage()); // Print error to console for debugging
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new AWTAddition(); // Create an instance of the AWTAddition class
    }
}

