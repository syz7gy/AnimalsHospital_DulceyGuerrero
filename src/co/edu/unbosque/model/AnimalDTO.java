package co.edu.unbosque.model;

public class AnimalDTO {
	
	private String name;
	private int arriveTime;
	private boolean blanked;
	
	public AnimalDTO(String name, int arriveTime, boolean blanked) {
		super();
		this.name = name;
		this.arriveTime = arriveTime;
		this.blanked = blanked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}

	public boolean isBlanked() {
		return blanked;
	}

	public void setBlanked(boolean blanked) {
		this.blanked = blanked;
	}

	@Override
	public String toString() {
		return "AnimalsDTO [name=" + name + ", arriveTime=" + arriveTime + ", blanked=" + blanked + "]";
	}
}
