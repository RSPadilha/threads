package sensores;

import javax.swing.JOptionPane;

public class Dashboard extends Thread{
	private int [] sensor = new int[6];	
	public void setValue(int num, int valor) {
		sensor[num] = valor;
	}
	@Override
	public void run() {
		//mostra joptionpane com os valores
	}
}
