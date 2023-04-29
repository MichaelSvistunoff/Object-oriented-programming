package HomeWork005.Core.MVP;
import HomeWork005.Core.Model.Car;
import Lecture005.Ex002Phonebook.Core.Models.Contact;

public class Presenter {
    private Model model;
    private View view;

    public Presenter (View view, String db) {
        this.view = view;
        model = new Model(db);
    }

    public void loadFromFile() {
        model.load();

        if (model.currentAutopark().count() > 0) {
            model.setCurrentIndex(0);
            var car = model.currentCar();

            view.setModel(car.model);
            view.setBrand(car.brand);
        }
    }

    public void add() {
        model.currentAutopark().add(
                new Car(view.getModel(),view.getBrand()));
    }

    public void remove() {
        Car car = new Car(view.getModel(), view.getBrand());
        model.currentAutopark().remove(car);

        if (model.currentAutopark().count() < 1) {
            model.setCurrentIndex(-1);

            view.setModel("");
            view.setBrand("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Car temp = model.currentCar();
            view.setModel(temp.model);
            view.setBrand(temp.brand);
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentAutopark().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentAutopark().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Car car = model.currentCar();
                view.setModel(car.model);
                view.setBrand(car.brand);
            }
        }
    }

    public void prev() {
        if (model.currentAutopark().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Car car = model.currentCar();
                view.setModel(car.model);
                view.setBrand(car.brand);
            }
        }
    }
}
