
package practicaprogra;

public class Entrada {
    
    
    private int entero;
    private double decimal;
    
    public Entrada(){}
    
    public Entrada(int entero) {//creando el constructor para el numero entero 
        this.entero = entero;
    }
    
    public Entrada(double decimal) {//creando el construtor para el numero decimal
        this.decimal = decimal;
    }

    public int pedirEntero() {
        return entero;
    }

    public void escribirEntero(int entero) {
        this.entero = entero;
    }

    public double pedirDecimal() {
        return decimal;
    }

    public void escribirDecimal(double decimal) {
        this.decimal = decimal;
    }
    
    public void mostrar(){
        System.out.println("Dato entero " + this.entero);
        System.out.println("Datos decimal "+ this.decimal);
    }
    
    
    
    
}
