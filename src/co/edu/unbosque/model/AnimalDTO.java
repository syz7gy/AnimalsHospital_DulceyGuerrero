package co.edu.unbosque.model;

public class AnimalDTO {
	
	private String name;
	private int arrivalTime;
	private boolean blanket;
	
	public AnimalDTO() {
	}
	
	public AnimalDTO(String name, int arrivalTime, boolean blanket) {
		super();
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.blanket = blanket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isBlanked() {
		return blanket;
	}

	public void setBlanked(boolean blanket) {
		this.blanket = blanket;
	}

	@Override
	public String toString() {
		return "AnimalsDTO [name=" + name + ", arrivalTime=" + arrivalTime + ", blanket=" + blanket + "]";
	}
}
