package co.edu.unbosque.util;

public class MyDoubleLinkedList<T> {
	// solo se maneja la posicion 0 y la ultima

	protected DNode<T> head;
	protected DNode<T> currentPosition;

	public MyDoubleLinkedList() {
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<T> currentPosition) {
		this.currentPosition = currentPosition;
	}

	public void forward(int ... numPosition) { // multiatributo crea un array

		if (numPosition[0] > 0 && head != null) {
			int positionForward = numPosition[0];

			if (currentPosition == null) {
				currentPosition = head;
				positionForward--;
			}
			while (currentPosition.getNext() != null && positionForward > 0) {
				currentPosition = currentPosition.getNext();
				positionForward--;
			}
		}
	}

	public void insert(T data) {

		DNode<T> temporary = new DNode<T>(data);

		if (currentPosition == null) {
			temporary.setNext(head);

			if (head != null) {
				head.setPrevious(temporary);
			}
			head = temporary;

		} else {
			temporary.setNext(currentPosition.getNext());
			temporary.setPrevious(currentPosition);

			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevious(temporary);
			}

			currentPosition.setNext(temporary);
		}

		currentPosition = temporary;
	}

	public T extract() {

		T info = null;

		if (currentPosition != null) {
			info = currentPosition.getInfo();

			if (head == currentPosition) {
				head = currentPosition.getNext();

			} else {
				currentPosition.getPrevious().setNext(currentPosition.getNext());
			}

			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevious(currentPosition.getPrevious());
			}

			currentPosition = currentPosition.getNext();
		}

		return info;
	}
	
	public void backward(int ... numPosition) {
		
		if (numPosition[0] <= 0 || head == null || currentPosition == null) {
			return;		
		}
		
		int positionBack = numPosition[0];
		
		while(currentPosition != null && positionBack > 0) {
			currentPosition = currentPosition.getPrevious();
			positionBack --;
		}
	}
	
	@Override
	public String toString() {
		
		DNode <T> temporary = head;	
		StringBuilder sb = new StringBuilder();
		
		while(temporary != null) {			
			sb.append(temporary.getInfo());
			
			if (temporary.getNext() != null) {
				sb.append("<->");			
			}

			temporary = temporary.getNext();
		}		
		return sb.toString();
	}
}
