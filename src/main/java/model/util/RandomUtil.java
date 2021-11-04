package model.util;

import javafx.beans.binding.ObjectExpression;

import java.util.List;
import java.util.Random;

public class RandomUtil {

    private RandomUtil() {}

    public static <T> T randomElement(List<T> elements, Random random) {
        random = new Random();
        return elements.get(random.nextInt(elements.size()));
    }

    public static <T> T randomElement(T[] elements, Random random) {
        int randomElementChoicePlace = random.nextInt(elements.length);
        return elements[randomElementChoicePlace];
    }
}

