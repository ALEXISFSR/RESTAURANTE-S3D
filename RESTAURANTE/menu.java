package RESTAURANTE;
import java.util.Scanner;
public class menu {
    Scanner lectura=new Scanner(System.in);


    public void menuprincipal() {

        //System.out.println("DIGITE NOMBRE PORFAVOR \n");
        //String nombre =lectura.nextLine();

        //BIENVENIDA AL RETSAURANTE
        System.out.println("BIENVENIDO AL RESTAURANTE "+ /*nombre.toUpperCase()+*/ "\n");


        System.out.println("🥗🍚🥙🥘🍲🍱🦐🍡🍪🍥🍤🍩🍧🍟🍔🍕🍗 \n");

        //AQUI MOSTRAMOS EL MENU
        System.out.println("1)SOPAS              2)PLATO FUERTE");
        System.out.println("3)JUGOS              4)POSTRES");
        System.out.println("5)FACTURA            6)CERRAR PROGRAMA \n");

        //AQUI HACEMOS QUE EL CLIENTE SELCCIONE
        System.out.println("SELECCIONE EL PRODUCTO QUE QUIERES COJER");
        int opcion = lectura.nextInt();

        switch (opcion) {
            case 1:
                submenu sopas=new submenu();
                sopas.submenuSopas();
                break;
            case 2:
                submenu Fuerte=new submenu();
                Fuerte.submenuFuerte();
                break;
            case 3:
                submenu Jugos=new submenu();
                Jugos.submenuJugos();
                break;
            case 4:
                submenu Postres=new submenu();
                Postres.submenuPostres();
            case 5:
                System.out.println("OPCION 5");

            default:
                break;
        }


    }
}
