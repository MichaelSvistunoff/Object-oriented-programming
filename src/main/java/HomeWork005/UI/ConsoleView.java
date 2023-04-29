package HomeWork005.UI;

import HomeWork005.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getModel() {
        System.out.printf("Model: ");
        return in.nextLine();
    }

    @Override
    public void setModel(String model) {
        System.out.printf("Model: %s\n", model);
    }

    @Override
    public String getBrand() {
        System.out.printf("Brand: ");
        return in.nextLine();
    }

    @Override
    public void setBrand(String brand) {
        System.out.printf("Brand: %s\n", brand);
    }

    @Override
    public void set(String toString) {

    }

    @Override
    public String get() {
        return null;
    }
}
