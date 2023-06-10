import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        List<Model> models = new ArrayList<>();

        Model model = new Model("AAPL", 150.0);
        Model model1 = new Model("CCBD", 150.0);

        models.add(model);
        models.add(model1);

        view.menu((ArrayList<Model>) models);

    }
}