package marioKart;

import java.util.ArrayList;
import java.util.List;

public class Race {

	private String name;
	private Circuit circuit;
	private static final int NUM_KARTS = 3;
	private List<Kart> karts = new ArrayList<Kart>();
	private List<Kart> finishedKarts = new ArrayList<Kart>();

	public Race(String name) {
		super();
		this.name = name;
	}

	public void run() {
		while (notAllFinished()) {
			for (Kart kart : karts) {
				moveKart(kart);
				if (isFinished(kart)) {
					moveToFinished(kart);
				}
			}
		}
	}

	private boolean notAllFinished() {
		return this.karts.size() > 0;
	}

	private void moveKart(Kart kart) {

		int movedPositions = 0;
		movedPositions = kart.move() - circuit.difficulty();
		kart.setPosition(kart.getPosition() + movedPositions);
	}

	private boolean isFinished(Kart kart) {
		return kart.getPosition() >= this.circuit.getDistance();
	}

	private void moveToFinished(Kart kart) {

		int pos = this.karts.indexOf(kart);
		this.finishedKarts.add(this.karts.remove(pos));
	}

}
