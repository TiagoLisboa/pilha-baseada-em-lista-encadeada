package pilhalistaencadeada;

/**
 *
 * @author Rute Fernandes
 */
public interface Pilha {
    public int size();
    public boolean isEmpty();
    public void push(Object o);
    public Object pop()throws EPilhaVazia;
    public Object top()throws EPilhaVazia;
}
