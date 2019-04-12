package corrida;

import java.util.Random;

public class Tartaruga extends Thread {
	Random rand = new Random();
	int velocidade = rand.nextInt(10)+1;
	int distanciaPercorrida, distanciaCorrida;
	@Override
	public void run() {
		while(distanciaPercorrida < distanciaCorrida) {
			try {
				sleep(1000);
			} catch (Exception e) {}
			distanciaPercorrida += velocidade;
			System.out.println("Tartaruga: " +distanciaPercorrida);
		}
		System.out.println("Tartaruga finalizou!!!");
	}
}
