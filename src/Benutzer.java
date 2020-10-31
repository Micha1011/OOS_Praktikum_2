/**
 * @author michaelbuschmann
 */

import java.util.Arrays;
import java.util.Objects;

/**
 * Enhält User Id's und Passwörter von jedem Benutzer des Systems.
 * Außerdem enhält es die Methoden um mit den Benutzer Instanzen zu arbeiten.
 */


public class Benutzer {
    //Attribute
    private String userId;
    private char[] passwort = new char[20];

    //Getter und Setter
    public  String getuserId(){
        return userId;
    }
    public String getPasswort(){
        String stringPasswort = "";
        stringPasswort= stringPasswort.copyValueOf(this.passwort);
        return stringPasswort;
    }

    /**
     * Default Konstruktor der Klasse
     */
    Benutzer(){};

    /** Konstruktor, der die beiden Attribut userID und Passwort mit den übergebenen Parametern initialisiert
     *
     * @param userid User ID des anzulegenden Benutzers
     * @param password Passwort des anzulegenden Benutzers
     */
    Benutzer( String userid, char[] password) {
        this.userId = userid;
        this.passwort = password;
    }

    /** Equals Methode zum Vergleich zweier Benutzer ID's
     *
     * @param o das zu verlgleichende Objekt
     * @return gibt zurück, ob die Objekte übereinstimmen oder nicht
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benutzer benutzer = (Benutzer) o;
        return Objects.equals(userId, benutzer.userId);
    }

    public String toString(){
        return("\n"+"User ID: "+ this.getuserId()+" | User Passwort: " + this.getPasswort());
    }


}
