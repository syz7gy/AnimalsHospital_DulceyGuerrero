package co.edu.unbosque.util;

public class QueueImpl<T> implements Queue<T>{
    
    private DequeList<T> infos;
    
    public QueueImpl(){
        infos = new DequeList<T>();
    }
    
    @Override
    public void enqueue(T info) {
        infos.insertFirst(info);
    }
    
    @Override
    public T dequeue() {
       return infos.removeLast();
    }
    
    @Override
    public int size() {
        return infos.size();
    }
    
    @Override
    public T peek() {
        T temp = infos.removeFirst();
        infos.insertFirst(temp);
        return temp;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BACK [");
        DNode<T> temporal = infos.getHead();
        for(int i=0; i<infos.getSize(); i++){
            sb.append(temporal.getInfo().toString());
            if(temporal==infos.getTail()){
                break;
            }
            sb.append("-");
            temporal = temporal.getNext();
        }
        sb.append("] FRONT");
        return sb.toString();
    }
}
