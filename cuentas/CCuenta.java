package cuentas;
/**
 *Clase CCuenta que simula una cuenta con nombre de titular, nombre de cuenta, saldo y tipo de interés
 * Se pueden retirar y ingresar cantidades
 * 
 * @author Joel Nassar Fuentes
 * *@version 1.0 
*/


public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     *Constructor crea una CCuenta vacia
    */
    public CCuenta()
    {
    }



    /**
     *Constructor crea una nueva CCuenta con:
     
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    //Getters & Setters

    /**
     *
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *
     * @return cuenta
     */
    public String getCuenta(){
        return cuenta;
    }

    /**
     *
     * @return saldo
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     *
     * @return tipoInteres
     */
    public double getTipoInteres(){
        return tipoInteres;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    /**
     *
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres=tipoInteres;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
