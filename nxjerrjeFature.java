import javax.swing.*;

public class MyFirstProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fatura e Restorantit");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        vendosKomponentet(panel);

        frame.setVisible(true);
    }

    private static void vendosKomponentet(JPanel panel) {
        panel.setLayout(null);

        JLabel emriLabel = new JLabel("Emri:");
        emriLabel.setBounds(50, 20, 80, 25);
        panel.add(emriLabel);

        JTextField emriField = new JTextField(20);
        emriField.setBounds(130, 20, 200, 25);
        panel.add(emriField);

        JLabel pizzaLabel = new JLabel("Sasia e Pizave:");
        pizzaLabel.setBounds(50, 50, 120, 25);
        panel.add(pizzaLabel);

        JTextField pizzaField = new JTextField(10);
        pizzaField.setBounds(170, 50, 50, 25);
        panel.add(pizzaField);

        JLabel CocaColaLabel = new JLabel("Sasia e CocaCola:");
        CocaColaLabel.setBounds(50, 80, 120, 25);
        panel.add(CocaColaLabel);

        JTextField pijeField = new JTextField(10);
        pijeField.setBounds(170, 80, 50, 25);
        panel.add(pijeField);

        JButton llogaritButton = new JButton("Llogarit Faturën");
        llogaritButton.setBounds(130, 120, 150, 25);
        panel.add(llogaritButton);

        JTextArea rezultatiArea = new JTextArea();
        rezultatiArea.setBounds(50, 160, 300, 80);
        rezultatiArea.setEditable(false);
        panel.add(rezultatiArea);

        llogaritButton.addActionListener(e -> {
            double cmimiPizza = 450;
            double cmimiCocaCola = 150;
            double totali = 0;

            String emri = emriField.getText();
            int sasiaPizza = Integer.parseInt(pizzaField.getText());
            int sasiaPije = Integer.parseInt(pijeField.getText());

            double totaliPizza = cmimiPizza * sasiaPizza;
            double totaliCocaCola = cmimiCocaCola * sasiaPije;
            totali = totaliPizza + totaliCocaCola;

            String rezultati = "Fatura juaj:\n";
            rezultati += "Emri: " + emri + "\n";
            rezultati += "Pizat: " + sasiaPizza + " x " + cmimiPizza + " = " + totaliPizza + " lek\n";
            rezultati += "Pijet: " + sasiaPije + " x " + cmimiCocaCola + " = " + totaliCocaCola + " lek\n";
            rezultati += "Totali: " + totali + " lek\n";

            rezultatiArea.setText(rezultati);
        });
    }
}
