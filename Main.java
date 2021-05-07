public class Main {
    public static void main(String[] args) {

        Klant Klant1 = new Klant("Johan vam der Laan","Lievendaal 60 - 6651 DE -Druten","Lievendaal 60 - 6651 DE -Druten",5984849);
        System.out.println("Particulier klant Info");
        System.out.println("Klant Naam: " +Klant1.getNaam());
        System.out.println("Klant adres: "+Klant1.getAdres());
        System.out.println("Klant factuuradres: "+Klant1.getFacutuuradres());
        System.out.println("Klant-nummer: "+Klant1.getKlantid());




        Periodiekefactuur facturenKlnat1= new Periodiekefactuur(181948498,25008,"15-05-2020-25-06-2020");
        System.out.println("Factuur-nummer: "+facturenKlnat1.getFactuurid());
        System.out.println("Factuur-bedrag : "+facturenKlnat1.getFactuurbedrag()+ "Euro");
        System.out.println("Factuur-periode : "+facturenKlnat1.getPeriode());

        Zakkelijkeklant Bedrijfnaam1 = new Zakkelijkeklant("Onlineshop4u","Mariastraat 25, 6654AN - Utrecht","Mariastraat 95, 6654AN- Utrecht",8418181,"Nl-84564964B01");
        System.out.println("Zakkelijke klant Info");
        System.out.println("Bedrijfsnaam : "+Bedrijfnaam1.getNaam());
        System.out.println("Bedrijfs adres : "+Bedrijfnaam1.getAdres());
        System.out.println("Factuur adres : "+Bedrijfnaam1.getFacutuuradres());
        System.out.println("Debiteurnummer : "+Bedrijfnaam1.getKlantid());
        System.out.println("Btw-nummer : "+Bedrijfnaam1.getBtwnummer());



        Periodiekefactuur Onlineeshop4u = new Periodiekefactuur(519688949,5984,"25-04-2020 - 08-05-2020");
        System.out.println("Factuur-nummer: "+Onlineeshop4u.getFactuurid());
        System.out.println("Factuur-bedrag : "+Onlineeshop4u.getFactuurbedrag()+ "Euro");
        System.out.println("Factuur-periode : "+Onlineeshop4u.getPeriode());


        Klant Klant2 = new Klant("Sam Ingrid","Padenpaal 48 - 6674 MG - Arnhem","Kadellaanstraat 65 - 6694 HF - Tiel",62654189);
        System.out.println("Particulier klant Info");
        System.out.println("Klant Naam: " +Klant2.getNaam());
        System.out.println("Klant adres: "+Klant2.getAdres());
        System.out.println("Klant factuuradres: "+Klant2.getFacutuuradres());
        System.out.println("Klant-nummer: "+Klant2.getKlantid());




        Periodiekefactuur facturenKlnat2= new Periodiekefactuur(256495,89444,"20-03-2020-28-07-2020");
        System.out.println("Factuur-nummer: "+facturenKlnat2.getFactuurid());
        System.out.println("Factuur-bedrag : "+facturenKlnat2.getFactuurbedrag()+ "Euro");
        System.out.println("Factuur-periode : "+facturenKlnat2.getPeriode());

        Zakkelijkeklant Bedrijfnaam2 = new Zakkelijkeklant("Keda Systeem","Nijgraaf 25, 6654AN - Utrecht","Mariastraat 95, 6654AN- Utrecht",658874,"Nl-5687987B01");
        System.out.println("Zakkelijke klant Info");
        System.out.println("Bedrijfsnaam : "+Bedrijfnaam2.getNaam());
        System.out.println("Bedrijfs adres : "+Bedrijfnaam2.getAdres());
        System.out.println("Factuur adres : "+Bedrijfnaam2.getFacutuuradres());
        System.out.println("Debiteurnummer : "+Bedrijfnaam2.getKlantid());
        System.out.println("Btw-nummer : "+Bedrijfnaam2.getBtwnummer());



        Periodiekefactuur KedaSysteem = new Periodiekefactuur(41894984,45846,"25-01-2020 - 08-02-2020");
        System.out.println("Factuur-nummer: "+KedaSysteem.getFactuurid());
        System.out.println("Factuur-bedrag : "+KedaSysteem.getFactuurbedrag()+ "Euro");
        System.out.println("Factuur-periode : "+KedaSysteem.getPeriode());






    }
}


