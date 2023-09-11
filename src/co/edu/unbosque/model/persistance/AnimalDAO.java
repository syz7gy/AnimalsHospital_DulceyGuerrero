package co.edu.unbosque.model.persistance;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.util.QueueImpl;

public class AnimalDAO {
	
	private QueueImpl<AnimalDTO> addedList;
	
	public AnimalDAO() {
		addedList = new QueueImpl<AnimalDTO>();
	}

	public QueueImpl<AnimalDTO> getAddedList() {
		return addedList;
	}

	public void setAddedList(QueueImpl<AnimalDTO> addedList) {
		this.addedList = addedList;
	}
	
	public void create(Object o) {
		addedList.enqueue((AnimalDTO) o);
	}
	
	public void delete() {
		addedList.dequeue();
	}
	
	public String read() {
		return addedList.toString();
	}
	
	public int size() {
		return addedList.size();
	}

}
