// estructuras 25/08
package co.edu.unbosque.util;
public class DNode<T> {

	private DNode<T> next;
	private DNode<T> previous;
	private T info;

	public DNode(T info) {
		
		this(null, null, info);
	}
	
	public DNode() {
	}

	public DNode(DNode<T> next, DNode<T> previous, T info) {
		super();
		this.next = next;
		this.previous = previous;
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "DNode [next=" + next + ", previous=" + previous + ", info=" + info + "]";
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}	
}
