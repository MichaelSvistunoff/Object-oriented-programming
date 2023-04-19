package HomeWork004;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class HomeWork004 {
    public static void main(String[] args) {
        ToDoList<HighPriority> dangers = new ToDoList<HighPriority>("Must do that right now!");
        dangers.add(Alerts.createNewH());
        dangers.add(Alerts.createNewH());
        dangers.add(Alerts.createNewH());
        dangers.add(Alerts.createNewH());
        dangers.add(Alerts.createNewH());
        dangers.iterShow();   // Show dangers as iteration
        dangers.saveAsCsv("Dangers1");
        dangers.saveAsJson("Dangers2");
        dangers.saveAsXml("Dangers3");
        System.out.println(); // Divider

        ToDoList<MiddlePriority> warnings = new ToDoList<MiddlePriority>("You have time to keep this work");
        warnings.add(Alerts.createNewM());
        warnings.add(Alerts.createNewM());
        warnings.add(Alerts.createNewM());
        warnings.iterShow();   // Show warnings as iteration
        dangers.saveAsCsv("Warnings1");
        dangers.saveAsJson("Warnings2");
        dangers.saveAsXml("Warnings3");
        System.out.println(); // Divider

        ToDoList<LowPriority> primary = new ToDoList<LowPriority>("Just added to the board");
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.add(Alerts.createNewL());
        primary.iterShow();   // Show primary as iteration
        dangers.saveAsCsv("Primary1");
        dangers.saveAsJson("Primary2");
        dangers.saveAsXml("Primary3");
    }
}

abstract class Priority {
    private final Integer id;
    private final String name;
    private final LocalDate deadLine;
    private final LocalDate createdOn;
    private final String author;

    public Priority() {
        Random r = new Random();
        LocalDate dateOfCreation = LocalDate.now();
        LocalDate deadLineFromStart = dateOfCreation;
        deadLineFromStart = deadLineFromStart.plusDays(r.nextInt(1, 25));
        String tID = UUID.randomUUID().toString().substring(0, 5);
        String tAuthor = UUID.randomUUID().toString().substring(0, 5);
        this.id = hashCode();
        this.createdOn = dateOfCreation;
        this.name = String.format("Task_%s", tID);
        this.deadLine = deadLineFromStart;
        this.author = String.format("Author_%s", tAuthor);
    }

    @Override
    public String toString() {
        String priorityType = this.getClass().getSimpleName();
        return String.format("[%d %s %tA %tA %s %s]", id, name, createdOn, deadLine, author, priorityType);
    }

    public String toStringForJson() {
        return "{" +
                "\n\t\"id\": \"" + id + '\"' +
                ",\n\t\"name\": \"" + name + '\"' +
                ",\n\t\"createdOn\": \"" + createdOn + '\"' +
                ",\n\t\"deadLine\": \"" + deadLine + '\"' +
                ",\n\t\"author\": \"" + author + '\"' + '\n' +
                '}';
    }

    public String toStringForXml() {
        return "\t<priority id=\"" + id + '\"' + ">" +
                "\n\t\t<name>" + name + "</name>" +
                "\n\t\t<createdon>" + createdOn + "</createdon>" +
                "\n\t\t<deadline>" + deadLine + "</deadline>" +
                "\n\t\t<author>" + author + "</author>" + '\n' +
                "\t</priority>";
    }
}

class HighPriority extends Priority {
    public HighPriority() {
        super();
    }
}

class MiddlePriority extends Priority {
    public MiddlePriority() {
        super();
    }
}

class LowPriority extends Priority {
    public LowPriority() {
        super();
    }
}

class ToDoList<T extends Priority> {
    private final String name;
    private final List<T> priorities;

    public ToDoList(String name) {
        this.name = name;
        priorities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<T> getPriorities() {
        return priorities;
    }

    public void add(T w) {
        priorities.add(w);
    }

    public void iterShow() {
        System.out.println(name);
        for (T priority : priorities) {
            System.out.println(priority);
        }
    }

    public void saveAsCsv(String fileName) {
        StringBuilder sb = new StringBuilder();
        for (T priority : getPriorities()) {
            sb.append(priority.toString()
                    .replace(" ", ",")
                    .replace("[", "")
                    .replace("]", "")).append(",").append("\n");
        }
        try (FileWriter writer = new FileWriter("src/main/java/HomeWork004/SavedFiles/" +
                fileName + ".csv", false)) {
            writer.write("id, priority_name, created_date,deadline,author,priority," + "\n");
            writer.write(String.valueOf(sb));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveAsJson(String fileName) {
        StringBuilder sb = new StringBuilder();
        for (T priority : getPriorities()) {
            sb.append(priority.toStringForJson() + "," + "\n");
        }
        try (FileWriter writer = new FileWriter("src/main/java/HomeWork004/SavedFiles/" +
                fileName + ".json", false)) {
            writer.write(String.valueOf(sb));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveAsXml(String fileName) {
        StringBuilder sb = new StringBuilder();
        for (T priority : getPriorities()) {
            sb.append(priority.toStringForXml() + '\n');
        }
        try (FileWriter writer = new FileWriter("src/main/java/HomeWork004/SavedFiles/" +
                fileName + ".xml", false)) {
            writer.write("<priorityList>\n");
            writer.write(String.valueOf(sb));
            writer.write("</priorityList>");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, priorities);
    }

    public void saveToFile() {
    }
}

class WorkingProgress<T extends Priority> {
    ToDoList<T> workingHighPriority, workingMiddlePriority, workingLowPriority;

    public WorkingProgress() {
    }

}

class Alerts {
    public static HighPriority createNewH() {
        return new HighPriority();
    }

    public static MiddlePriority createNewM() {
        return new MiddlePriority();
    }

    public static LowPriority createNewL() {
        return new LowPriority();
    }
}