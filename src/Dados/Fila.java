package Dados;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fsdney
 */

public class Fila {

	private List<Integer>elementos;
	
	public Fila() {
		elementos = new ArrayList<>();
	}
	
	public void enqueue(int valor)  { 
		elementos.add(valor);
	}
	
	public int dequete() {
		if (isEmpty() ) {
			throw new IllegalStateException("A fila está vazia");
		}
		return elementos.remove(0);
	}
	
	public int rear() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia");
		}
		return elementos.get(elementos.size() -1);
	}
	
	public int front() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia");
		}
		return elementos.get(0);
	}
	
	public boolean isEmpty() {
	    return elementos.isEmpty(); 
	}
	
	public int size() {
	    return elementos.size(); 
	}
	
}
