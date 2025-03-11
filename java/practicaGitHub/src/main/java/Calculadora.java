/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MainP
 */
/**
 *  Objeto Calculadora
 */
public class Calculadora {
    private  int a;
    private  int b;
/**
 * El constructor guarda los numeros a y b para multiplicarse.
 * @param ac parametro a del constructor.
 * @param bc parametro b del constructor.
 */
    Calculadora(int ac,int bc){
        this.a=ac;
        this.b=bc;
    }
    /**
     * Este constructor hace que no chille cuando no obtiene ningun parametro
     */
    Calculadora(){}
    /**
     * Realizar suma de dos numeros.
     * @param a
     * @param b
     * @return retorna el valor de la suma: a+b
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    /**
     * Realizar resta de dos numeros
     * @param a
     * @param b
     * @return retorna el valor de la resta.
     */
    public int restar(int a, int b) {
        return a - b;
    }
    /**
     * Realizar multiplicación de dos numeros.
     * @param a
     * @param b
     * @return retorna el valor de la multiplicación.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    /**
     * Realizar dividion de dos numeros
     * @param a
     * @param b
     * @return retorna el valor de la división.
     * @throws ArithmeticException si se divide por 0.
     */
    public int dividir(int dividendo, int divisor) {
        if(divisor==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return dividendo / divisor;
    }
    /**
 * Calcula la potencia de un número.
 * Este método utiliza internamente el método {@link #multiplicar(int, int)}.
 * @param base numero base que será multiplicado.
 * @param exponente n de veces multiplicado de la base.
 * @return retorna el resultado de la potenciación
 */
    public int potencia(int base,int potencia){
        int resultado=1;
        for(int i=0;i<potencia;i++){
            resultado=multiplicar(resultado, potencia);
        }
        return resultado;
           
        }
    /**
     * Metodo para calcular media de un array de numeros.
     * @param promedio recoge los numeros double.
     * @return retorna el promedio.
     */
    public double calcularPromedio(double[]promedio) {
    	double sumaDeNumeros=0;
    	double resultado;
    	for(int i=0;i<promedio.length;i++) {
    		sumaDeNumeros=+promedio[i];
    	}
    	return resultado= sumaDeNumeros/promedio.length;
    }
}


