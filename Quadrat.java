import java.awt.Rectangle;

/**
 * Ein Quadrat, das manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */

public class Quadrat extends Rechteck{
    
    protected int groesse;
    
    public Quadrat(){
        
        groesse = 30;
    }


    /**
     * �ndere die Gr��e dieses Quadrates in 'neueGroesse'. 'neueGroesse' muss
     * groesser gleich Null sein.
     */
    public void groesseAendern(int neueGroesse) {
        loeschen();
        groesse = neueGroesse;
        zeichnen();

    }
    
     /**
     * �ndere die Farbe dieses Quadrates in 'neueFarbe'. G�ltige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();

    }


    /**
     * Zeichne dieses Quadrat mit seinen aktuellen Werten auf den Bildschirm.
     */
    protected  void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,groesse, groesse));
            leinwand.warte(10);
        }

    }
    
     /**
     * Mache dieses Quadrat sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
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
    
    public void DreimalRunterRaufMitFarbwechsel(int distance){
        
        String initialColor = this.farbe;
        
        for(int i = 0; i <= 2; i++){
            
            farbeAendern("rot");
            langsamVertikalBewegen(distance);
            farbeAendern("blau");
            langsamVertikalBewegen(-distance);
                  
        }
        
        farbeAendern(initialColor);
        
       }
       
    public void DreimalRunterRaufMitFarbwechselPro(int distance, String FarbeRunter, String FarbeRauf){
        
        String initialColor = this.farbe;
        
        for(int i = 0; i <= 2; i++){
            
            farbeAendern(FarbeRunter);
            langsamVertikalBewegen(distance);
            farbeAendern(FarbeRauf);
            langsamVertikalBewegen(-distance);
                  
        }
        
        farbeAendern(initialColor);
        
       }
}
