public class main {
    public static void main(String[] arg){
        char[] passwort1 = {'1','1','1','1'};
        char[] passwort2 = {'0','0','0','0'};
        char[] passwort3 = {'1','1','1','1'};

        Benutzer benutzer1 = new Benutzer("Micha1011", passwort1);
        Benutzer benutzer2 = new Benutzer("Matze1011", passwort2);
        Benutzer benutzer3 = new Benutzer("Micha1011", passwort3);



        System.out.println("Sind Benutzer 1 und 1 gleich?(erwartet true): " + benutzer1.equals(benutzer1));
        System.out.println("Sind Benutzer 1 und 2 gleich?(erwartet false): " + benutzer1.equals(benutzer2));
        System.out.println("Sind Benutzer 1 und 3 gleich?(erwartet true): " + benutzer1.equals(benutzer3));

        System.out.println("\n"+"Benutzer 1 ausgeben:"+ benutzer1.toString());

        BenutzerVerwaltungAdmin admin = new BenutzerVerwaltungAdmin();
        admin.benutzerEintragen(benutzer1);
        admin.benutzerEintragen(benutzer2);
        admin.benutzerEintragen(benutzer3);


        System.out.println("\n"+"Gespeicherte Daten ausgeben: "+ admin.toString(admin.datenhaltung));

        System.out.println("Ist Benutzer 1 vorhanden?: "+ admin.benutzerVorhanden(benutzer1));

    }
}
