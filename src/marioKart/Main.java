package marioKart;

public class Main {

	public static void main(String[] args) {

		Race race = new Race("Super cup");

		Kart kartDeMario = new Kart("Mario");
		Kart kartDeLuigi = new Kart("Luigi");
		Kart kartDeBowser = new Kart("Bowser");
		race.addKart(kartDeMario);
		race.addKart(kartDeLuigi);
		race.addKart(kartDeBowser);

		Circuit circuit = new Circuit("Mina de Wario", 100);
		race.setCircuit(circuit);

		System.out.println("**** Init Super Mario Kart ****");

		System.out.println(race.toString());

		race.run();

		System.out.println("**** Game Over****");

		race.showResult();

	}

}
