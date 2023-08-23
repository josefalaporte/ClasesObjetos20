/*Escriba la clase Cafetera con atributos para mantener (como mínimo) la capacidad máxima y
la cantidad actual de café. Además, debe respetar las siguientes restricciones:*/

public class Cafetera {
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera(){   //
        this.capacidadMax = 1000;
        this.cantidadActual = this.capacidadMax;
    }

    public Cafetera(int capacidadMax){
        this.capacidadMax = capacidadMax;
        this.cantidadActual = this.capacidadMax;
    }

    public Cafetera(int capacidadMax, int canticadActual){
        this.capacidadMax = capacidadMax;
        if (canticadActual > capacidadMax){
            this.cantidadActual = capacidadMax;
        }else{
            this.cantidadActual = canticadActual;
        }
    }

    public void llenarCafetera(){
        cantidadActual = capacidadMax;
    }

    public void servirTaza(int capacidadTaza){
        if(cantidadActual >= capacidadTaza){
            cantidadActual -= capacidadTaza;
            System.out.println("Se ha servido una taza de " + capacidadTaza + "cc de café");
        }else{
            System.out.println("No hay suficiente café");
            cantidadActual = 0;
        }
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public void agregarCafe(int cantidadAgregar){
        if(cantidadActual + cantidadAgregar <= capacidadMax){
            cantidadActual += cantidadAgregar;
            System.out.println("Se agregaron " + cantidadAgregar + "cc de Café");
        }else{
            cantidadActual = capacidadMax;
            System.out.println("Cafetera al máximo");
        }
    }

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        System.out.println("Cantidad actual de café: " + cafetera.cantidadActual + "cc");
        cafetera.llenarCafetera();
        cafetera.agregarCafe(300);
        cafetera.servirTaza(2000);
    }
}
