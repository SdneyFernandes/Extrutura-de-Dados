package Dados;

import java.util.LinkedList;

/**
 * @author fsdney
 */


public class HashMap {
    private LinkedList<Entry>[] tabela;
    private int capacidade = 10;

    public HashMap() {
        tabela = new LinkedList[capacidade];
        for (int i = 0; i < capacidade; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % capacidade;
    }

    public void put(int key, int value) {
        int index = hashFunction(key);
        LinkedList<Entry> lista = tabela[index];

        for (Entry entrada : lista) {
            if (entrada.key == key) {
                entrada.value = value; 
                return;
            }
        }

        lista.add(new Entry(key, value)); 
    }

    public int get(int key) {
        int index = hashFunction(key);
        LinkedList<Entry> lista = tabela[index];

        for (Entry entrada : lista) {
            if (entrada.key == key) {
                return entrada.value; 
            }
        }

        return -1; 
    }

    public void delete(int key) {
        int index = hashFunction(key);
        LinkedList<Entry> lista = tabela[index];

        for (Entry entrada : lista) {
            if (entrada.key == key) {
                lista.remove(entrada); 
                return;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < capacidade; i++) {
            tabela[i].clear(); 
        }
    }
}
