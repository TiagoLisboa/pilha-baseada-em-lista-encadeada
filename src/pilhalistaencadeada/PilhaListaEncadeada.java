/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhalistaencadeada;

/**
 *
 * @author tiago
 */
public class PilhaListaEncadeada {
    private No topo;
    private int tamanho;
    
    public int size () {
        return this.tamanho;
    }
    
    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    
    public No top() throws PilhaVaziaException {
        if (this.topo != null)
            return this.topo;
        else
            throw new PilhaVaziaException();
    }
    
    public void push (int valor) {
        No novoNo = new No(valor, this.topo);
        this.topo = novoNo;
        this.tamanho++;
    }
    
    public No pop () throws PilhaVaziaException {
        No antigoTopo = this.topo;
        if (antigoTopo != null) {
            this.topo = antigoTopo.getProxNo();
            this.tamanho--;
        } else {
            throw new PilhaVaziaException();
        }
        return antigoTopo;
    }
    
}
