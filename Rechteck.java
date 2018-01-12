import java.awt.Rectangle;


/**
 * Ein Quadrat, das manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */

public class Rechteck extends Shape{
    

    /**
       * Erzeuge ein neues Quadrat mit einer Standardfarbe an einer
     * Standardposition.
     */
    public Rechteck() {
        
        x = 50;
        y = 30;

        xPosition = 60;
        yPosition = 50;
        farbe = "rot";
        istSichtbar = false;

    }
    
     /**
     * Zeichne dieses Quadrat mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,x, y));
            leinwand.warte(10);
        }
    }



    /**
     * Mache dieses Quadrat unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;

    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);

    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);

    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);

    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);

    }

    /**
     * Bewege dieses Quadrat horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int distance) {
        loeschen();
        xPosition += distance;
        zeichnen();

    }

    /**
     * Bewege dieses Quadrat vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();

    }

    /**
     * Bewege dieses Quadrat langsam horizontal um 'entfernung'
     * Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }

    }

    /**
     * Bewege dieses Quadrat langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }

    }

    /**
     * �ndere die Gr��e dieses Quadrates in 'neueGroesse'. 'neueGroesse' muss
     * groesser gleich Null sein.
     */
    public void groesseAendern(int newX, int newY) {
        loeschen();
        x = newX;
        y = newY;
        zeichnen();

    }




    /**
     * L�sche dieses Quadrat vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);

        }
    }
}
