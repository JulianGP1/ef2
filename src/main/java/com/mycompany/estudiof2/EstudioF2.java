
package com.mycompany.estudiof2;

import java.util.Scanner;


public class EstudioF2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ingrese el nombre la cuenta :");
        String name=scan.nextLine();
        System.out.println("ingrese el monto inicial de la cuenta");
        double mount=scan.nextDouble();
        System.out.println("ingrese tipo de cliente");
        scan.nextLine();
        String type=scan.nextLine();
        System.out.println("ingresa tu edad");
        int edad=scan.nextInt();
        if (edad<14) {
            System.out.println("bienvenido a programa joven");
        }else if (edad>14) {
            
        Cuenta cuenta1=new Cuenta(name,mount,type);
        cuenta1.setMount(mount);
        System.out.println(" puede: "+"\n"+"1)depositar"+"\n"+"2)retirar"+"\n"+"3)saber ganancia por interes");
        scan.nextLine();
        String r=scan.nextLine();
        try {
                Dif0.verific(r);
                
        } catch (Exception e1) {
             double c= cuenta1.deposit();
             System.out.println("el monto actual es :"+c);
        }
        try {
                Dif0.verific2(r);
            } catch (Exception e) {
               double c= cuenta1.retit();
                            System.out.println("el monto actual es :"+c);

            }
        try {
                Dif0.verific3(r);
            } catch (Exception e) {
               double c=  cuenta1.saber();
                            System.out.println("el monto actual es :"+c);

            }
        }
    }
       
        }
    


