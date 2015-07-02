package behavioral.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Текущее состояние калькулятора
 */
public class State {
    /**
     * Текущее значение
     */
    public int curIndex = 0;

    /**
     * Значение
     */
    public List<Double> values = new ArrayList<>(
            Arrays.asList(0.0));

    /**
     * @return Текущее значение
     */
    public double curValue() {
        return values.get(curIndex);
    }

    public void addValue(double newValue) {
        values = values.subList(0, curIndex + 1);
        values.add(newValue);
        curIndex = values.size() - 1;
    }

    public void undo() {
        if (curIndex > 0)
            curIndex--;
    }

    public void redo() {
        if (curIndex < values.size() - 1)
            curIndex++;
    }
}
