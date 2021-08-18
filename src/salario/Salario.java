/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author JCERNA10
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre = "";
        double Salario = 0;
        double ISSS = 0.02;
        double AFP = 0.03;
        double Renta = 0.05;
        double SalarioNeto = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el Nombre");
        Nombre = entrada.nextLine();

        System.out.println("Ingresar salario");
        Salario = entrada.nextDouble();

        if (Salario >= 500) {
            SalarioNeto = (Salario - (Salario * ISSS) - (Salario * AFP) - (Salario * Renta));
            ISSS = Salario * ISSS;
            AFP = Salario * AFP;
            Renta = Salario * Renta;
            System.out.println("Nombre: " + Nombre);
            System.out.println("SalarioNeto: " + (SalarioNeto));
            System.out.println("La deduccion de AFP es: " + (ISSS));
            System.out.println("La deduccion de ISSS es: " + (AFP));
            System.out.println("La deduccion de renta es: " + (Renta));
        } else {
            System.out.println("El Salario no tiene retenciones");
        }

    }

}
