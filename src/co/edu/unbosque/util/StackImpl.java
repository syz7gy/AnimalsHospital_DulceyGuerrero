package co.edu.unbosque.util;

public class StackImpl<T> implements Stack<T>{
    
    private DequeList<T> infos;
    
    public StackImpl() {
        infos = new DequeList<T>();
    }
    
    @Override
    public void push(T info) {
        infos.insertFirst(info);
    }
    
    @Override
    public T pop() {
        return infos.removeFirst();
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
        sb.append("TOP [");
        DNode<T> temporal = infos.getHead();
        for(int i=0; i<infos.getSize(); i++){
            sb.append(temporal.getInfo().toString());
            if(temporal==infos.getTail()){
                break;
            }
            sb.append("-");
            temporal = temporal.getNext();
        }
        sb.append("] BOTTOM");
        return sb.toString();
    }
}
