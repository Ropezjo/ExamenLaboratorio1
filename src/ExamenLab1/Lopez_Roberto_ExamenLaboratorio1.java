/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenLab1;
import java.util.Scanner;


/**
 *
 * @author rjl01
 */
public class Lopez_Roberto_ExamenLaboratorio1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        do {
            System.out.println("*** *** *** MENU *** *** ***");
            System.out.println("1. Piramide: ");
            System.out.println("2. El Mayor: ");
            System.out.println("3. Cliente: ");
            System.out.println("4. Caracteres Vocales: ");
            System.out.println("5. Salir.");
            System.out.print("Ingrese una opcion: ");
            opcion = lea.nextInt();

            if (opcion == 1) {
                int filas;
                int PrimerNumero = 1;
                System.out.print("Ingresar el numero de filas: ");
                filas = lea.nextInt();
                for (int i = 1; i <= filas; i++) {
                    int suma = 0;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(PrimerNumero + " ");
                        suma += PrimerNumero;
                        PrimerNumero += 2;
                    }
                    System.out.println(" = " + suma);
                }
            } else if (opcion == 2) {
                int suma = 0;
                int contar = 0;
                int MaxNum = Integer.MIN_VALUE;
                boolean continuar = true;
                while (continuar) {
                    int numeros;
                    System.out.print("Ingrese un numero entero: ");
                    if (lea.hasNextInt()) {
                        numeros = lea.nextInt();
                        System.out.println("Numero ingresado: " + numeros);

                        if (numeros > MaxNum) {
                            MaxNum = numeros;
                        }
                        suma += numeros;
                        contar++;

                        System.out.print("Desea ingresar otro numero entero? (si/no): ");
                        String respuesta = lea.next().trim().toLowerCase();

                        if (!respuesta.equals("si")) {
                            continuar = false;
                        }
                    } else {
                        System.out.println("Error... el numero ingresado no es correcto.");
                        lea.next(); 
                    }
                }

                if (contar > 0) {
                    double promedio = (double) suma / contar;
                    System.out.println("El numero mayor es: " + MaxNum);
                    System.out.println("El promedio es: " + promedio);
                }

            } else if (opcion == 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente = scanner.nextLine();
                int canalesNormales = 0;
                int canalesHD = 0;
                int costoCaja = 0;
                int subtotalCanales = 0;
                int subtotalCaja = 0;
                String ingresoCanal;
                do {
                    System.out.print("Ingrese el tipo de canal ( HD / NORMAL ): ");
                    ingresoCanal = scanner.nextLine().toUpperCase();

                    if (ingresoCanal.equals("HD")) {
                        canalesHD++;
                        subtotalCanales += 30; 
                    } else if (ingresoCanal.equals("NORMAL")) {
                        canalesNormales++;
                        subtotalCanales += 20; 
                    } else {
                        System.out.println("Tipo de canal no valido. Intentelo de nuevo.");
                    }

                    System.out.print("Desea ingresar otro canal? (si/no): ");
                } while (scanner.nextLine().trim().equalsIgnoreCase("si"));

                System.out.print("Ingrese el tipo de Caja Digital ( 1.LIGHTBOX /2.HDBOX /3.DVRBOX ): ");
                String tipoCaja = scanner.nextLine().toUpperCase();

                if (tipoCaja.equals("1")) {
                    costoCaja = 50;
                } else if (tipoCaja.equals("2")) {
                    costoCaja = 100;
                } else if (tipoCaja.equals("3")) {
                    costoCaja = 150;
                } else {
                    System.out.println("Tipo de caja digital no valido. Se aplicara costo base.");
                }

                subtotalCaja = costoCaja;
                double subtotal = subtotalCanales + subtotalCaja;
                double impuesto = subtotal * 0.15;
                double totalPagar = subtotal + impuesto;

                System.out.println("\nResumen del Cliente: " + nombreCliente);
                System.out.println("Cantidad de canales NORMALES: " + canalesNormales);
                System.out.println("Cantidad de canales HD: " + canalesHD);
                System.out.println("Subtotal a pagar: " + subtotal);
                System.out.println("Impuesto (15%): " + impuesto);
                System.out.println("Total a Pagar: " + totalPagar);
                
             } else if (opcion == 4) {
                System.out.print("Ingrese una cadena de caracteres: ");
                String cadena = lea.next();

                int cantidadA = 0;
                int cantidadE = 0;
                int cantidadI = 0;
                int cantidadO = 0;
                int cantidadU = 0;

                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);

                    switch (caracter) {
                        case 'a':
                            cantidadA++;
                            break;
                        case 'e':
                            cantidadE++;
                            break;
                        case 'i':
                            cantidadI++;
                            break;
                        case 'o':
                            cantidadO++;
                            break;
                        case 'u':
                            cantidadU++;
                            break;
                        default:
                            break;
                    }
                }

                int totalVocales = cantidadA + cantidadE + cantidadI + cantidadO + cantidadU;

                System.out.println("Cantidad de vocales minusculas:");
                System.out.println("a: " + cantidadA);
                System.out.println("e: " + cantidadE);
                System.out.println("i: " + cantidadI);
                System.out.println("o: " + cantidadO);
                System.out.println("u: " + cantidadU);
                System.out.println("Total: " + totalVocales);

            } else if (opcion == 5) {
                System.out.println("Hasta luegoooooooo...");
                
            } else {
                System.out.println("Opcion no vaida. Ingrese un numero del 1 al 5.");
            }
            
        } while (opcion != 5); 
    }
}