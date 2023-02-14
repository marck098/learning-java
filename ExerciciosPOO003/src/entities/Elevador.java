package entities;

public class Elevador {

	private int currentFloor;
	private int totalFloors;
	private int peopleOnElevator;
	private int elevMaxLoad;

	public Elevador() {
	}

	public Elevador(int currentFloor, int totalFloors, int peopleOnElevator, int elevMaxLoad) {
		this.currentFloor = currentFloor;
		this.totalFloors = totalFloors;
		this.peopleOnElevator = peopleOnElevator;
		this.elevMaxLoad = elevMaxLoad;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getTotalFloor() {
		return totalFloors;
	}

	public void setTotalFloor(int totalFloor) {
		this.totalFloors = totalFloor;
	}

	public int getPeopleOnElevator() {
		return peopleOnElevator;
	}

	public void setPeopleOnElevator(int peopleOnElevator) {
		this.peopleOnElevator = peopleOnElevator;
	}

	public int getElevMaxLoad() {
		return elevMaxLoad;
	}

	public void setElevMaxLoad(int elevMaxLoad) {
		this.elevMaxLoad = elevMaxLoad;
	}

	public void inicializa(int totalFloors, int maxLoad) {
		this.currentFloor = 0;
		this.peopleOnElevator = 0;
		this.totalFloors = totalFloors;
		this.elevMaxLoad = maxLoad;
	}

	public void enter() {
		if (peopleOnElevator < elevMaxLoad) {
			this.peopleOnElevator++;
			System.out.println("Pessoas no Elevador: " + peopleOnElevator);
		} else {
			System.out.println("NÃO É POSSIVEL ENTRAR - CARGA MÁX ATINGIDA!");
		}
	}

	public void exit() {
		if (peopleOnElevator > 0) {
			this.peopleOnElevator--;
			System.out.println("Pessoas no Elevador: " + peopleOnElevator);
		} else {
			System.out.println("O ELEVADOR JÁ ESTÁ VAZIO");
		}
	}

	public void upFloor() {
		if (currentFloor < totalFloors) {
			this.currentFloor++;
			System.out.println("ANDAR ATUAL - " + currentFloor);
		} else {
			System.out.println("O ELEVADOR JÁ ESTÁ NO ULTIMO ANDAR");
		}
	}

	public void downFloor() {
		if (currentFloor > 0) {
			this.currentFloor--;
			System.out.println("ANDAR ATUAL - " + currentFloor);
		} else {
			System.out.println("O ELEVADOR JÁ ESTÁ NO ANDAR TÉRREO");
		}
	}

}
