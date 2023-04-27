import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Observer> listObserver = new ArrayList<Observer>();

    public void subscribe(Observer lisObs){
        listObserver.add(lisObs);
    }

    public void unsubscribe(Observer lisObs) {
        listObserver.remove(lisObs);
    }
    public void notify(Observer typeLisObs, String message) {
        for (Observer listObs : listObserver) {
            if(listObserver.getClass().equals(typeLisObs.getClass()))
                listObs.update(message);
        }

    }
}
