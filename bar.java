public class bar{
    private String propietario;
    private double litrosCerveza;
    private boolean abierto;
    
    public bar(double litrosDeCerveza){
        propietario = "El cigala";
        litrosCerveza = litrosDeCerveza;
        abierto = true;
    }
    public String getpropietario(){
        return propietario;
    }
    public boolean getestaAbierto(){
        return abierto;
    }
    public double getlitrosCerveza(){
        return litrosCerveza;
    }
    public void cambiarNombre (String nombreDelPropietario){
        propietario = nombreDelPropietario;
    }
    public void litrosConsumidos (double litrosConsumidos){
        litrosCerveza = litrosConsumidos + litrosCerveza;
    }
    public void abrirOCerrar(boolean estadoActual){
        abierto = estadoActual;
    }
    public void imprimirDetalles(){
        System.out.println("Propietario del bar " + propietario + "Litros de cerveza consumidos " + litrosCerveza + "Bar abierto" + abierto);
    }
}