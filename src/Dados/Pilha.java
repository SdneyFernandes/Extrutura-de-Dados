package Dados;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fsdney
 */

public class Pilha {
	
	private List<Integer> elementos;
	
	public Pilha() {
		elementos = new ArrayList<>();
	}
	
	public void push(int valor) {
		elementos.add(valor);
	}
	
	public int pop() {
		if (isEmpty() ) {
			throw new IllegalStateException("A pilha está vazia");
		}
		return elementos.remove(elementos.size() -1);
	}
	
	public int top() {
		if (isEmpty() ) {
			throw new IllegalStateException("A pilha está vazia");
		}
		return elementos.get(elementos.size() -1);
	}
	
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
	
	public int size() {
		return elementos.size();
	}

}
