package Dados;



/**
 * @author fsdney
 */

public class ListaEncadeada {
	private Node head;
	private int tamanho;
	
	public ListaEncadeada( ) {
		this.head = null;
		this.tamanho = 0;
	}
	
	
	public void push(int valor) {
		Node novoNo = new Node(valor);
		
		if (head == null) {
			head = novoNo;
		} else {
			Node atual = head;
			while (atual.next != null) {
				atual = atual.next;
			}
			atual.next = novoNo;
		}
		
		tamanho++;
	}
	
	public int pop() {
	    if (head == null) {
	        throw new IllegalStateException("A lista está vazia.");
	    }

	    if (head.next == null) {
	        int valor = head.data;
	        head = null; 
	        tamanho--;
	        return valor;
	    }

	    Node atual = head;
	    while (atual.next.next != null) { 
	        atual = atual.next;
	    }

	    int valor = atual.next.data; 
	    atual.next = null; 
	    tamanho--;
	    return valor;
	}

	
	public void insert(int index, int valor) {
	    if (index < 0 || index > tamanho) {
	        throw new IndexOutOfBoundsException("Índice inválido.");
	    }

	    Node novoNo = new Node(valor);

	    if (index == 0) {
	        novoNo.next = head; 
	        head = novoNo;
	    } else {
	        Node atual = head;
	        for (int i = 0; i < index - 1; i++) {
	            atual = atual.next; 
	        }
	        novoNo.next = atual.next; 
	        atual.next = novoNo; 
	    }

	    tamanho++;
	}
	
	public void remove(int index) {
	    if (index < 0 || index >= tamanho) {
	        throw new IndexOutOfBoundsException("Índice inválido.");
	    }

	    if (index == 0) {
	        head = head.next; 
	    } else {
	        Node atual = head;
	        for (int i = 0; i < index - 1; i++) {
	            atual = atual.next; 
	        }
	        atual.next = atual.next.next; 
	    }

	    tamanho--;
	}

	public int elementAt(int index) {
	    if (index < 0 || index >= tamanho) {
	        throw new IndexOutOfBoundsException("Índice inválido.");
	    }

	    Node atual = head;
	    for (int i = 0; i < index; i++) {
	        atual = atual.next; 
	    }

	    return atual.data; 
	}

	public int size() {
	    return tamanho; 
	}

	public void printList() {
	    Node atual = head;
	    while (atual != null) {
	        System.out.print(atual.data + " -> ");
	        atual = atual.next; 
	    }
	    System.out.println("null");
	}

}
