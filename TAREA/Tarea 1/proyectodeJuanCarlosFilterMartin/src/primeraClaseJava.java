public class primeraClaseJava {
    public static void main(String[] args) {
        /*Asignamos las variables y las inicializamos en el caso 
        de que fuera necesario*/
        double expre;
        //double es una variable para decimales.
        int a = 4;
        int b = 6;
        int c = 2;
        //int es una variable de tipo entero.
        boolean Booleana = true;
        //boolean es una variable de un bit para inducar true o false.
        String nombre =  "Juan Carlos Filter Martín";
        /*String es una variable que permite almacenar texto y
        siempre entre comillas*/
        
        /*System.out.print(); nos muestra por pantalla el
        contenido entre parentesis*/
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Booleana);
        System.out.println(nombre);
        
        //Se está inicializando la variable expre
        expre = a+b/c+1;
        System.out.println(expre);
        //Le cambiamos el valor a la variable expre
        expre = (a+b)/c+1;
        System.out.println(expre);
        
        /*añadimos a la variable String nombre el DNI y mostramos
        con un System.out.println()*/
        nombre = "Juan Carlos Filter Martín DNI:15121113A";
        System.out.println(nombre);
 
        
    }
    
}
