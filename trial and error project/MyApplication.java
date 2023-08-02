import javax.swing.*;

public class MyApplication extends JFrame {
    public MyApplication() {
        setTitle("My Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Set the size of the window

        // Create and add components to the window
        JLabel label = new JLabel("Hello, Swing!");
        getContentPane().add(label);

        JButton button = new JButton("Click me!");
        getContentPane().add(button);

        // Set the layout manager
        getContentPane().setLayout(new FlowLayout());

        // Display the window
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyApplication();
        });
    }
}
