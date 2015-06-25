package behavioral.memento;

/**
 * Крестики-нолики
 */
public class GameXO {
    static final int SIZE = 3;
    // Игровое поле
    char field[][] = new char[SIZE][SIZE];
    // Текущий игрок
    char player = 'X';

    public void move(int row, int col) {
        // TODO: проверить что клетка пустая
        field[row][col] = player;
        // Меняем игрока
        player = (player == 'X') ? 'O' : 'X';
        checkGameOver();
    }

    private void checkGameOver() {
        // TODO: реализовать
    }

    public char[][] getField() {
        return field;
    }
}
