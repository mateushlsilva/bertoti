import java.util.ArrayList;
import java.util.List;

public class MercadoAcoes {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void updatePreco(Model model, double newPreco) {
        model.setPreco(newPreco);
        notifyObservers(model);
    }

    private void notifyObservers(Model stock) {
        for (Observer observer : observers) {
            observer.precoChanged(stock);
        }
    }
}
