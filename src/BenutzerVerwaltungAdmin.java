public class BenutzerVerwaltungAdmin implements BenutzerVerwaltung {

    Benutzer datenhaltung[] = new Benutzer[10];




    @Override
    public void benutzerEintragen(Benutzer benutzer) {
        for (int i = 0; i < 10; i++) {
            if (datenhaltung[i] == null) {
                datenhaltung[i] = benutzer;
                break;
            }
        }
    }

    @Override
    public boolean benutzerVorhanden(Benutzer benutzer) {
        boolean vorhanden = true;

        for (int i = 0; i < 10; i++) {
            if (datenhaltung[i].equals(benutzer)) {
                vorhanden = true;
                break;
            }
            else {
                vorhanden = false;
            }
        }
      return vorhanden;
    }

    //Konstruktor
    BenutzerVerwaltungAdmin(){
    };


    String toString(Benutzer array[]) {
        String datenhaltungErgebnis ="";
        for (int i = 0; i < datenhaltung.length; i++)
            if (datenhaltung[i] != null) {
                datenhaltungErgebnis += datenhaltung[i].toString();
            }
        return datenhaltungErgebnis;
        }



}
