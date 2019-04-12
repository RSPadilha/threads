package alarmes;

public class Relogio {

	public static void main(String[] args) {
		Alarme a1 = new Alarme();
		Alarme a2 = new Alarme();
		a1.setAlarme(0,5);
		a1.start();
		a2.setAlarme(0,10);
		a2.start();

	}

}
