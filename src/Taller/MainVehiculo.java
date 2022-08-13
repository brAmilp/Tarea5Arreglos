package Taller;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainVehiculo{

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String placa, marca, modelo;
        int kilometraje, precio;
        System.out.println(" Favor ingresar placa: ");
        placa = entrada.nextLine();
        System.out.println(" Favor ingresar marca: ");
        marca = entrada.nextLine();
        System.out.println(" Favor ingresar Modelo: ");
        modelo = entrada.nextLine();
        System.out.println(" Favor ingresar Kilometraje: ");
        kilometraje = entrada.nextInt();
        System.out.println(" Favor ingresar Precio: ");
        precio = entrada.nextInt();
        Vehiculo e;
        e = new Vehiculo(placa, marca, modelo, kilometraje, precio);
        e.mostrarVehiculo();
    }
}
