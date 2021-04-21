package com.mycompany.listasenlazadas;

public class ClasePrincipal {

    public static void main(String[] args) {
        //Vamos a crear la lista para empezar
        ListaEnlazadaSimple miLista = new ListaEnlazadaSimple();
        
        //Lo primero que haremos es verificar si la lista esta vacia.
        System.out.println("¿Esta realmente la lista vacia?: " + miLista.isVacia() + "\n");
        
        //Ahora que ya verificamos que la lista esta vacia vamos a crear nodos 
        Nodo miPrimerNodo = new Nodo(0);
        Nodo miSegundoNodo = new Nodo(1);
        Nodo miTercerNodo = new Nodo(2);
        Nodo miCuartoNodo = new Nodo(3);
        Nodo miQuintoNodo = new Nodo(4);
        System.out.println("Se ejecuto la creación de nodos \n");
        
        //una vez creamos los nodos vamos a insertarlos en la lista
        miLista.setCabeza(miPrimerNodo);
        miPrimerNodo.setSiguiente(miSegundoNodo);
        miSegundoNodo.setSiguiente(miTercerNodo);
        miTercerNodo.setSiguiente(miCuartoNodo);
        miCuartoNodo.setSiguiente(miQuintoNodo);
        System.out.println("Los nodos se han implementado a la lista \n");
        
        //ahora que hemos impementado los nodos, vamos a verificar si esta vacia
        System.out.println("Luego de implementar los nodos, ¿la lista esta vacia?: "+ miLista.isVacia() + "\n");
        
        //Ahora vamos a recorrer la lista para saber que nodos posee
        System.out.println("A continuación el orden de los valores que estan en la lista:");
        miLista.recorrer();
        System.out.println(" ");
        
        //Continuamos con que vamos a localizar unos valores
        System.out.println("Ahora vamos a buscar un par de valores");
        System.out.println("¿Se encuentra el valor: 3 ? dame su posición: "+miLista.localizar(3));
        System.out.println("¿Se encuentra el valor: 9 ? dame su posición:  "+miLista.localizar(9)+"\n");
        
        //Vamos a agregar una cabeza a la lista
        System.out.println("¿Que tal si ahora agregamos una cabeza a la lista?");
        System.out.println("el valor que agregaremos sera... 9");
        miLista.agregarCabeza(9);
        System.out.println("Veamos si al recorrer la lista cambiara su estructura");
        miLista.recorrer();
        System.out.println(" ");
        
        //Ahora vamos a investigar cual sera el ultimo valor de la lista
        System.out.println("Investiguemos el ultimo valor de la lista");
        System.out.println("El valor es: "+miLista.ultimo().getDato()+" y su posición es: "+miLista.ultimo()+"\n");
        
        //Vamos a agregar una cola a la lista
        System.out.println("¿Que tal si ahora agregamos una cola a la lista?");
        System.out.println("el valor que agregaremos sera... 23");
        miLista.agregarUltimo(23);
        System.out.println("Veamos si al recorrer la lista cambiara su estructura");
        miLista.recorrer();
        System.out.println(" ");
        
        //Intentemos agregar un valor en una posición
        System.out.println("Vamos a agregar un valor a la lista en una posición escogida");
        System.out.println("insertemos el valor 10 en la posición 4");
        miLista.agregarEnPosicion(4, 10);
        System.out.println("Ahora veamos si se agrego el valor viendo la lista en el orden especificado ");
        miLista.recorrer();
        System.out.println(" ");
        
        //Ahora quiero que eliminemos la cola
        System.out.println("He estado pensando y la cola no era tan necesaria, vamos a eliminarla");
        miLista.suprimirCola();
        System.out.println("La cola se ha removido, vamos a confirmar");
        miLista.recorrer();
        System.out.println(" ");
        
        //Vamos a suprimir la cabeza
        System.out.println("Me ha pasado lo mismo con la cabeza de la lista, ¿es realmente necesario?");
        System.out.println("Vamos a eliminarla");
        miLista.suprimirCabeza();
        System.out.println("Se ha eliminado la cabeza, vamos a verificar");
        miLista.recorrer();
        System.out.println(" ");
        
        //Por ultimo vamos a suprimir en cierta posicion
        System.out.println("Tengo ganas de eliminar mas cosas, que tal algo en cierta posicion...");
        System.out.println("No me agrada la posicion 2 asi que la eliminare");
        miLista.suprimirEnPosicion(2);
        System.out.println("¿Se ha eliminado? vamos a ver");
        miLista.recorrer();
    } 
    
}
