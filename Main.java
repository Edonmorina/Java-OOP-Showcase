package Autosalloni;

import Autosalloni.Automjetet.Limuzina;
import Autosalloni.Automjetet.SUV;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nMain method");
        Autosalloni aS = new Autosalloni("Autosalloni ABC");

        // Shtojm disa Limuzina
        Limuzina l1 = new Limuzina("10JFIEIUTIROYPASJ", "BMW", 3, "Black");
        Limuzina l2 = new Limuzina("11JFIEIUTIROYPASJ", "Mercedes", 1, "Black");
        Limuzina l3 = new Limuzina("12JFIEIUTIROYPASJ", "Mercedes", 10, "Black");

        // Shtojm disa SUV
        SUV s1 = new SUV("13JFIEIUTIROYPASJ", "Toyota", 4, true);
        SUV s2 = new SUV("14JFIEIUTIROYPASJ", "Chrysler", 7, false);
        SUV s3 = new SUV("15JFIEIUTIROYPASJ", "Ford", 2, true);

        // Shtojm disa Minibusa
        Autosalloni.Minibusi m1 = aS.new Minibusi("16JFIEIUTIROYPASJ", "Honda", 7, 4);
        Autosalloni.Minibusi m2 = aS.new Minibusi("17JFIEIUTIROYPASJ", "Toyota", 2, 3);
        Autosalloni.Minibusi m3 = aS.new Minibusi("18JFIEIUTIROYPASJ", "BMW", 4, 6);

        // Shtojm disa Coupe
        Autosalloni.Coupe c1 = new Autosalloni.Coupe("19JFIEIUTIROYPASJ", "Mercedes", 2, 2);
        Autosalloni.Coupe c2 = new Autosalloni.Coupe("20JFIEIUTIROYPASJ", "Mercedes", 10, 4);
        Autosalloni.Coupe c3 = new Autosalloni.Coupe("21JFIEIUTIROYPASJ", "Mercedes", 5, 4);

        aS.shtoAutomjetin(l1);
        aS.shtoAutomjetin(l2);
        aS.shtoAutomjetin(l3);

        aS.shtoAutomjetin(s1);
        aS.shtoAutomjetin(s2);
        aS.shtoAutomjetin(s3);

        aS.shtoAutomjetin(m1);
        aS.shtoAutomjetin(m2);
        aS.shtoAutomjetin(m3);

        aS.shtoAutomjetin(c1);
        aS.shtoAutomjetin(c2);
        aS.shtoAutomjetin(c3);

        System.out.println("\n--------------------------------------------------------");
        System.out.print("Numri mesatar i ulseve te automjeteve: ");
        System.out.println(((Autosalloni.Coupe) aS.avgNumriUlseve()).getNrUlseve());
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Te gjitha automjetet automatike: \n");
        aS.shtypAutomatik(true);
        System.out.println("\n--------------------------------------------------------\n");
        System.out.println("Te gjitha automjetet manuale: \n");
        aS.shtypAutomatik(false);
        System.out.println();
    }
}
