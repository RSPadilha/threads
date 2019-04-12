package alarmes;

import javax.swing.JOptionPane;

public class Alarme extends Thread{
	int segundo = 0, minuto = 0;
	int segundoAlarme, minutoAlarme;
	
	public void setAlarme(int minuto, int segundo) {
		this.minutoAlarme = minuto;
		this.segundoAlarme = segundo;
	}
	
	@Override
	public void run() {
	try {
		while(true) {
		//while(minuto < minutoAlarme || segundo < segundoAlarme) {
			System.out.println("Horario: " + minuto + ":" + segundo);
			sleep(1000);
			if(segundo < 59) {
				segundo++;
			}else {
				segundo = 0;
				minuto++;
			}
			if (segundo == segundoAlarme && minuto == minutoAlarme) {//dispara joption
				JOptionPane.showMessageDialog(null, "ALARME");
			}
		}
			
	} catch (Exception e) { System.out.println("Erro" +e);	}
	}
}
