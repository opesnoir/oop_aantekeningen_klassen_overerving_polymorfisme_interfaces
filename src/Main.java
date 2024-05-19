public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // stukken code

        //Gebruik van Ternary Operator: De ternary operator (? :) wordt gebruikt om de boolean waarde (true of false) om te zetten naar "wel" of "geen" binnen de printf statement.
        System.out.printf("%s verdient %.2f per jaar en heeft %b recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus());
        // de boolean returned true of false
        System.out.printf("%s verdient %.2f per jaar en heeft %s recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus()? "wel": "geen");
        // hier maak je van de boolean een string en laat je hem "wel" teruggeven als de boolean true is, en "geen" als de boolean false is

        //enhanced fori-loop, ook wel for-each-loop genoemd
        //reguliere for loop
        for (int i = 0; i < arrayVerbruik.length; i++) {
            System.out.println("Geef je dataverbruik in MB per maand: ");
            System.out.printf("%s: ", arrayVerbruik[i].getMaand());
            arrayVerbruik[i].setHoeveelheidMb(input.nextInt());
        }
        //enhanced for-each-loop
        for (Verbruik verbruik : arrayVerbruik) {
            System.out.println("Geef je dataverbruik in MB per maand: ");
            System.out.printf("%s: ", verbruik.getMaand());
            verbruik.setHoeveelheidMb(input.nextInt());
        }

    }
}