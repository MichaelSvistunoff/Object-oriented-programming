package HomeWork005.Core.MVP;

import HomeWork005.Core.Infrastructure.Autopark;
import HomeWork005.Core.Model.Car;

import java.io.*;

public class Model {
    Autopark currentAutopark;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentAutopark = new Autopark();
        currentIndex = 0;
        this.path = path;
    }

    public Car currentCar() {
        if (currentIndex >= 0) {
            return currentAutopark.getCar(currentIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String model = br.readLine();
            while (model != null) {
                String brand = br.readLine();
                this.currentAutopark.add(new Car(model, brand));
                model = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter fw = new FileWriter(path, false)) {
            for (int i = 0; i < currentAutopark.count(); i++) {
                Car car = currentAutopark.getCar(i);
                fw.append(String.format("%s\n", car.model));
                fw.append(String.format("%s\n", car.brand));
            }
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Autopark currentAutopark() {
        return this.currentAutopark;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}
