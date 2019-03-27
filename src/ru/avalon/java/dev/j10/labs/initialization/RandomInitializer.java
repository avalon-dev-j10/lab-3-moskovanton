package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private int min;    //Минимальный предел диапазона
    private int max;    //Максимальный предел диапазона
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        for (int i = 0; i < array.length; i++){           
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        } 
        System.out.println("Random array elements: " + Arrays.toString(array));
    }
    //Конструктор
    public RandomInitializer(int min, int max) {
        this.min = min;
        this.max = max;
    }     
}