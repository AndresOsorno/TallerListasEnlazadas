package com.mycompany.listasenlazadas;

public class ListaEnlazadaSimple {
    private Nodo cabeza;
    
    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }
    
    public ListaEnlazadaSimple(Nodo cabeza) {
        this.cabeza = cabeza;
    }   
    
    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean isVacia() {
        return this.cabeza==null;
    }
    
    public void anular() {
        this.cabeza = null;
    }
    
    public void recorrer() {
        Nodo nodoActual;
        if(this.cabeza != null){
            nodoActual = this.cabeza;
            System.out.println(nodoActual.getDato());
            while(nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
                System.out.println(nodoActual.getDato());
            }
        }
    }
    
    public Nodo localizar(Integer x) {
        Nodo nodoActual = this.cabeza;
        while (nodoActual != null){
            if (nodoActual.getDato().equals(x)){
                return nodoActual;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }
    
    public void agregarCabeza(Integer d){
        Nodo nuevoNodo = new Nodo(d);
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
    }
    
    public Nodo ultimo(){
        Nodo nodoActual = this.cabeza;
        while (nodoActual != null){
            if(nodoActual.getSiguiente() == null){
                return nodoActual;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }
    
    public void agregarUltimo(Integer d){
        Nodo nuevaCola = new Nodo(d);
        ultimo().setSiguiente(nuevaCola);
    }
    
    public void agregarEnPosicion(int pos, Integer nod){
        Nodo nodoNuevo = new Nodo(nod);
        Nodo nodoAnterior = this.cabeza;
        Nodo nodoActual = this.cabeza;
        int posicion = 1;
        
        if(this.cabeza != null){
            while (nodoActual.getSiguiente() != null){
                if (posicion == pos){
                    nodoAnterior.setSiguiente(nodoNuevo);
                    nodoNuevo.setSiguiente(nodoActual);
                    break;
                } else {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getSiguiente();
                    posicion++;
                }
            }
        }
    }
    
    public void suprimirCabeza(){
        this.cabeza = this.cabeza.getSiguiente();
        
        /*this.cabeza.setSiguiente(null);
        this.cabeza = null;*/
    }
    
    public void suprimirCola(){
        Nodo nodoActual;
        Nodo nodoAnterior;
        if(this.cabeza != null){
            nodoActual = this.cabeza;
            nodoAnterior = nodoActual;
            while(nodoActual.getSiguiente() != null){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            nodoAnterior.setSiguiente(null);
        }
    }
    
    public void suprimirEnPosicion(int i){
        Nodo nodoAnterior;
        Nodo nodoSiguiente;
        Nodo nodoActual;
        
        if(this.cabeza != null) {
            nodoAnterior = this.cabeza;
            nodoActual = this.cabeza;
            
            for (int j=1; j < i; j++){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            nodoAnterior.setSiguiente(nodoActual.getSiguiente());
        }
    }
}
