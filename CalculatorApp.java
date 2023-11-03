import javax.swing.SwingUtilities;

public class CalculatorApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			CalculatorGUI gui = new CalculatorGUI();
			gui.createGUI();
		});
	}
}
