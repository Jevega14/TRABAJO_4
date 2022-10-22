package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class LocalComercial extends Local {
        
    protected static double valorArea = 3000000;
    protected String centroComercial;

    //Constructor de la clase LocalComercial

    public LocalComercial(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, String centroComercial){
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.centroComercial = centroComercial;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
