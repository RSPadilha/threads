package sensores;

import javax.swing.JOptionPane;

public class Sensor {

	public static void main(String[] args) {
		Dashboard dash = new Dashboard();
		Integer [] possibilidades = {1, 2, 3, 4, 5, 6};
		int op = (int)JOptionPane.showInputDialog(null, "Escolha o sensor", "Sensores", JOptionPane.PLAIN_MESSAGE, null, possibilidades, null);
		String texto =  JOptionPane.showInputDialog(null, "Valor");
		int valor = Integer.parseInt(texto);
		dash.setValue(op, valor);
		//rodar
	}
}
