package corrida;

import java.util.Random;

public class Lebre extends Thread {
	Random rand = new Random();
	int velocidade = rand.nextInt(20)+1;
	int qtdCochilos = rand.nextInt(10);
	int tempoCochilos = rand.nextInt(10)+1;
	int distanciaPercorrida, distanciaCorrida;
	@Override
	public void run() {
		while(distanciaPercorrida < distanciaCorrida) {
			if (rand.nextBoolean() && qtdCochilos > 0) {
				System.out.println("Dormiu");
				try {
					sleep(tempoCochilos*1000);
				} catch (Exception e) {}
				qtdCochilos--;
			} else {
				try {
					sleep(1000);
				} catch (Exception e) {}
				distanciaPercorrida += velocidade;
				System.out.println("Lebre: " +distanciaPercorrida);
			}
		}
		System.out.println("Lebre finalizou!!!");
	}
}
