package RESTAURANTE;

import java.util.Scanner;

public class submenu {

    int cantidads,cantidadp,cantidadc=0;
    public void volverMenu(){
        menu volverI=new menu();
        volverI.menuprincipal();
    }


    public void submenuSopas(){
        Scanner lectura=new Scanner(System.in);

        //MENU DE SOPAS
        System.out.println("MENU DE SOPAS \n");
        System.out.println("1)SANCOCHO              2)SOPA DE PASTA");
        System.out.println("3)CHANGUA               4)VOLVER");

        int opcion =lectura.nextInt();
        do {
            switch (opcion){
                case 1:
                    System.out.println("Cuantas sopas de sancocho desea \n");
                    int op1=lectura.nextInt();
                    System.out.println("Escojiste " + op1 + " DE SOPA DE SANCOCHO");
                    cantidads=cantidads+op1;
                    submenuSopas();
                    break;
                case 2:
                    System.out.println("Cuantas sopas de pasta desea \n");
                    int op2=lectura.nextInt();
                    System.out.println("Escojiste " + op2 + " DE SOPA DE PASTA");
                  submenuSopas();
                    break;
                case 3:
                    System.out.println("Cuantas changuas desea \n");
                    int op3=lectura.nextInt();
                    System.out.println("Escojiste " + op3 + " CHANGUAS");
                    submenuSopas();
                    break;
            }
        }while (opcion!=4);
        if (opcion==4){
            System.out.println("el total fue "+ cantidads +""+cantidadc+" "+cantidadp+" ");
            volverMenu();
        }


    }

    public void submenuFuerte(){

    }

    public void submenuJugos(){

    }

    public void submenuPostres(){

    }

    public void submenuFactura(){

    }
}
