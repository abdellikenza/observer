
package dz.univ.bechar.dame;


public class DzUnivBecharDame {

    public static void main(String[] args) {
        subject sub = new subject()  ;
        
        observer ob = new observer ();
        observer obs = new observer();
        observer obsr = new observer();
        
        sub.register(ob);
        sub.register(obs);
        sub.register(obsr);
        
        ob.update();
        obs.update();
        obsr.update();        
    }
    
}
