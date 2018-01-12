import java.awt.Rectangle;
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{

    
    
    protected String farbe;
    protected boolean istSichtbar; 
    protected int xPosition;
    protected int yPosition;
    protected int x;
    protected int y;
    
    public Shape(){
        
       farbe = "rot";
       istSichtbar = false;
       x = 10;
       y = 10;
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
     * Ändere die Farbe dieses Quadrates in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();

    }
    
        /**
     * Mache dieses Quadrat sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();

    }
    
    


}
