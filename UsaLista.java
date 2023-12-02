
package listas.ligadas.simples;

public class UsaLista{

	public static void main(String[] args){
		ListaSimple lista = new ListaSimple();

		lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "A");
		lista.imprimir();
		System.out.print(lista);
                
                Node nodoEnPosicion2 = lista.buscarPorPosicion(2);
    System.out.println("Nodo en posición 2: " + nodoEnPosicion2.name);

    lista.insertarAntesDelUltimo("N");
    lista.imprimir();

    lista.intercambiarNodos("O", "R");
    lista.imprimir();
	}


}
