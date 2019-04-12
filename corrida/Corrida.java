package corrida;

import java.util.Scanner;

public class Corrida {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha a distancia em metros");
		int distancia = scan.nextInt()*100;//le e transforma em centimetros
		Tartaruga tartaruga = new Tartaruga();
		Lebre lebre = new Lebre();
		System.out.println("Tartaruga : Velocidade : " + tartaruga.velocidade);
		System.out.printf("Lebre : Velocidade : Cochilos : Tempo : %d : %d : %d \n", lebre.velocidade,lebre.qtdCochilos,lebre.tempoCochilos);
		tartaruga.distanciaCorrida = distancia;
		lebre.distanciaCorrida = distancia;
		tartaruga.start();
		lebre.start();
	}

}
