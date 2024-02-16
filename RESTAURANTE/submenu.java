package RESTAURANTE;

import java.util.Scanner;

public class submenu {

    int cantidads,cantidadp,cantidadc,cantidadb,cantidadm,cantidadpo=0;
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
                    cantidadp=cantidadp+op2;
                  submenuSopas();
                    break;
                case 3:
                    System.out.println("Cuantas changuas desea \n");
                    int op3=lectura.nextInt();
                    System.out.println("Escojiste " + op3 + " CHANGUAS");
                    cantidadc=cantidadc+op3;
                    submenuSopas();
                    break;
            }
        }while (opcion!=4);
        if (opcion==4){
           if (cantidads>=1){
               System.out.println("El total fue de "+cantidads + "sopa de sancocho");
           } if (cantidadc>=1) {
                System.out.println("El total fue "+ cantidadc + "sopa de pasta");
           }if (cantidadp>=1){
                System.out.println("El total fue "+cantidadp + "changuas");
           }else {
                System.out.println("NO SE REGISTRO NADA");
           }
           int CantidadSopasTotales=cantidads+cantidadp+cantidadc;
            System.out.println("EL TOTAL DE SOPAS TOMADAS FUERON "+CantidadSopasTotales);
            volverMenu();
        }
    }

    public void submenuFuerte(){
        Scanner lectura=new Scanner(System.in);

        //MENU DE PLATOS FUERTES
        System.out.println("MENU DE PLATO FUERTE \n");
        System.out.println("1)BANDEJA PAISA             2).......");
        System.out.println("3)...........               4)volver");

        int opcion =lectura.nextInt();
        do {
            switch (opcion){
                case 1:
                    System.out.println("Cuantas Bandejas paisa desea \n");
                    int opf1=lectura.nextInt();
                    System.out.println("Escojiste " + opf1 + " BANDEJAS PAISAS");
                    cantidadb=cantidadb+opf1;
                    submenuFuerte();
                    break;
                case 2:
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.println("..-----------------");
                    break;
            }
        }while (opcion!=4);
        if (opcion==4){
            if (cantidadb>=1){
                System.out.println("El total fue de "+cantidadb + "BANDEJA PAISA");
            } if (cantidadc>=1) {
                System.out.println("--------------------------------------");
            }if (cantidadp>=1){
                System.out.println("--------------------------------------");
            }else {
                System.out.println("NO SE REGISTRO NADA");
            }
            int CantidadPlatosFuertesTotales=cantidadb;
            System.out.println("EL TOTAL DE PLATOS FUERTES TOMADAS FUERON "+CantidadPlatosFuertesTotales);
            volverMenu();
        }
    }

    public void submenuJugos(){
        Scanner lectura=new Scanner(System.in);

        //MENU DE JUGOS
        System.out.println("MENU DE PLATO FUERTE \n");
        System.out.println("1)JUGO DE MORA             2).......");
        System.out.println("3)...........               4)volver");

        int opcion =lectura.nextInt();
        do {
            switch (opcion){
                case 1:
                    System.out.println("Cuantos JUGOS DE MORA desea \n");
                    int opj1=lectura.nextInt();
                    System.out.println("Escojiste " + opj1 + " JUGOS DE MORA");
                    cantidadm=cantidadm+opj1;
                    submenuJugos();
                    break;
                case 2:
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.println("..-----------------");
                    break;
            }
        }while (opcion!=4);
        if (opcion==4){
            if (cantidadm>=1){
                System.out.println("El total fue de "+cantidadm + "sopa de sancocho");
            } if (cantidadc>=1) {
                System.out.println("--------------------------------------");
            }if (cantidadp>=1){
                System.out.println("--------------------------------------");
            }else {
                System.out.println("NO SE REGISTRO NADA");
            }
            int CantidadJugosTotales=cantidadm;
            System.out.println("EL TOTAL DE JUGOS TOMADAS FUERON "+CantidadJugosTotales);
            volverMenu();
        }
    }

    public void submenuPostres(){
        Scanner lectura=new Scanner(System.in);

        //MENU DE POSTRES
        System.out.println("MENU DE POSTRES \n");
        System.out.println("1)BRASO DE REINA           2).......");
        System.out.println("3)...........               4)volver");

        int opcion =lectura.nextInt();
        do {
            switch (opcion){
                case 1:
                    System.out.println("Cuantos POSTRES DE BRASO DE REINA desea \n");
                    int opbr1=lectura.nextInt();
                    System.out.println("Escojiste " + opbr1 + " JUGOS DE MORA");
                    cantidadm=cantidadm+opbr1;
                    submenuPostres();
                    break;
                case 2:
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.println("..-----------------");
                    break;
            }
        }while (opcion!=4);
        if (opcion==4){
            if (cantidadpo>=1){
                System.out.println("El total fue de "+cantidadpo + "sopa de sancocho");
            } if (cantidadc>=1) {
                System.out.println("--------------------------------------");
            }if (cantidadp>=1){
                System.out.println("--------------------------------------");
            }else {
                System.out.println("NO SE REGISTRO NADA");
            }
            int CantidadPostresTotales=cantidadpo;
            System.out.println("EL TOTAL DE POSTRES TOMADAS FUERON "+CantidadPostresTotales);
            volverMenu();
        }

    }
}
