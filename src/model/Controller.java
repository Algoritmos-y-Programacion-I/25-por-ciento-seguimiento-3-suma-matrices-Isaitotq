package model;

import model.SalaCine;
import model.MatrizNumerica;


public class Controller {

    private SalaCine CineColombia; // Declarando sala de cine
    private MatrizNumerica matriz1; // Declarando matriz numerica numero 1
    private MatrizNumerica matriz2; // Declarando matriz numerica numero 2

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
    }

    public void crearMatrices(int filas, int columnas) {
        matriz1 = new MatrizNumerica(filas, columnas);
        matriz2 = new MatrizNumerica(filas, columnas);
    }

    public MatrizNumerica sumarMatrices() {
        return matriz1.sumar(matriz2);
    }

    public void inicialiceSala() {
        CineColombia = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return CineColombia.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        CineColombia.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return CineColombia.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return CineColombia.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1(){
        return matriz1;
    }

    public MatrizNumerica getMatriz2(){
        return matriz2;
    }


}
