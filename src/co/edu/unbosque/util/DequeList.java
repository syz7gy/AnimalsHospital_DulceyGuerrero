package co.edu.unbosque.util;

public class DequeList<T> extends MyDoubleLinkedList<T> implements Deque<T> {
    
    private DNode<T> tail;
    private int size;
    
    public DequeList(){
        head = new DNode<T>();
        tail = new DNode<T>();
        head.setNext(head);
        tail.setNext(tail);
        size = 0;
    }
    
    @Override
    public void insertLast(T info) {
        DNode<T> t = this.tail;
        DNode<T> temporary = new DNode<T>();
        temporary.setInfo(info);
        temporary.setPrevious(t);
        t.setNext(temporary);
        tail = temporary;
        
        if(size==0){
            head = temporary;
        }
        size++;
        
    }
    
    @Override
    public T removeLast() {
        if(tail==null){
            return null;
        } else {
            T value = tail.getInfo();
            tail = tail.getPrevious();
            size--;
            return value;
        }
    }
    
    @Override
    public void insertFirst(T info) {
        DNode<T> h = this.head;
        DNode<T> temporary = new DNode<T>();
        temporary.setInfo(info);
        temporary.setNext(h);
        h.setPrevious(temporary);
        this.head = temporary;
        
        if(size==0){
            tail = temporary;
        }
        size++;
    }
    
    @Override
    public T removeFirst() {
        if(head==null){
            return null;
        }
        T value = this.head.getInfo();
        head = head.getNext();
        size--;
        return value;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HEAD [");
        DNode<T> aux = head;
        for(int i=0; i<size; i++){
            sb.append(aux.getInfo().toString());
            if(aux==tail){
                break;
            }
            sb.append("-");
            aux = aux.getNext();
        }
        sb.append("] TAIL");
        return sb.toString();
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public DNode<T> getTail() {
        return tail;
    }
    
    public void setTail(DNode<T> tail) {
        this.tail = tail;
    }
}
