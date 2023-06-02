
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TemperatureConverter {
    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel lblKelvin;
    public static JTextField textKelvin;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    public static JButton btnCalculateFtoK;
    public static JButton btnCalculateKtoF;
    public static JButton btnCalculateCtoK;
    public static JButton btnCalculateKtoC;
    
    public static void main(String[] args) {
        // Set up the frame
        frmMain = new JFrame("Temperature Converter");
        frmMain.setSize(600, 200);
        frmMain.setLayout(new FlowLayout());
    
        // Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        lblKelvin = new JLabel("Kelvin:");
        textKelvin = new JTextField(10);

        btnCalculateCtoF = new JButton("Convert C to F");
        // Add ActionListener
        btnCalculateCtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert C to F
                String cText = textCelsius.getText();
                double c = Double.parseDouble(cText);
                double f = (c * 9 / 5) + 32;
                textFahrenheit.setText(String.valueOf(f));
            }
        });
        
        btnCalculateFtoC = new JButton("Convert F to C");
        // Add ActionListener
        btnCalculateFtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert F to C
                String fText = textFahrenheit.getText();
                double f = Double.parseDouble(fText);
                double c = (f - 32) * 5 / 9;
                textCelsius.setText(String.valueOf(c)); 
            }
        });
        
        btnCalculateFtoK = new JButton("Convert F to K");
        // Add ActionListener
        btnCalculateFtoK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert F to K
                String fText = textFahrenheit.getText();
                double f = Double.parseDouble(fText);
                double k = (f - 32) * 5 / 9 + 273;
                textKelvin.setText(String.valueOf(k)); 
            }
        });
        
        btnCalculateKtoF = new JButton("Convert K to F");
        // Add ActionListener
        btnCalculateKtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert K to F
                String kText = textKelvin.getText();
                double k = Double.parseDouble(kText);
                double f = (k - 273) * 9 / 5 + 32;
                textFahrenheit.setText(String.valueOf(f)); 
            }
        });
        
        btnCalculateCtoK = new JButton("Convert C to K");
        // Add ActionListener
        btnCalculateCtoK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert C to K
                String cText = textCelsius.getText();
                double c = Double.parseDouble(cText);
                double k = c + 273;
                textKelvin.setText(String.valueOf(k)); 
            }
        });
        
        btnCalculateKtoC = new JButton("Convert K to C");
        // Add ActionListener
        btnCalculateKtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert K to C
                String kText = textKelvin.getText();
                double k = Double.parseDouble(kText);
                double c = k - 273;
                textCelsius.setText(String.valueOf(c)); 
            }
        });

        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);
        frmMain.add(btnCalculateFtoK);
        frmMain.add(btnCalculateKtoF);
        frmMain.add(btnCalculateCtoK);
        frmMain.add(btnCalculateKtoC);

        // Make the frame visible
        frmMain.setVisible(true);
    }
}