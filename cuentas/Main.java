
package cuentas;

/**
 * 
 * @author Joel Nassar Fuentes
 * @version 1.0
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        /**
         *
         * @param nombre
         * @param cantidad
         */
        public CCuenta operativa_cuenta(CCuenta cuenta, String nombre, float cantidad) {
            cuenta = new CCuenta(nombre,"1000-2365-85-1230456789",cantidad,0);
            saldoActual = cuenta.getSaldo();
            System.out.println("El saldo actual es"+ saldoActual );

            try {
                cuenta.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            try {
                System.out.println("Ingreso en cuenta");
                cuenta.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
        
        
    }
}

