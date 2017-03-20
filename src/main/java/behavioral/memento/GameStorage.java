package behavioral.memento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static behavioral.memento.GameXO.SIZE;

public class GameStorage {
    GameXO gameXO;

    public GameStorage(GameXO gameXO) {
        this.gameXO = gameXO;
    }

    // Сохранение игры
    public void save(String fileName) throws FileNotFoundException {
        System.out.println("Сохранение в \"" + fileName + "\"");
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writer.println(SIZE);
            char[][] field = gameXO.getField();
            for (char[] row : field) {
                for (char cell : row) {
                    writer.print(cell);
                }
                writer.println();
            }
        }
    }

    public void load(String fileName) throws FileNotFoundException {
        try (Scanner scan = new Scanner(new File(fileName))) {
            scan.nextLine();
            // ...
            System.out.println("Чтение файла...");
        }
    }
}
