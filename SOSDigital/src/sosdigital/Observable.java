package sosdigital;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer ob){
        monitores.add(ob);
    }
    
    public void deleteObserver(Observer ob){
        monitores.remove(ob);
    }
    
    public void notifyObserver(){
        for(Observer ob : monitores){
            ob.update(this);
        }
    }
}
