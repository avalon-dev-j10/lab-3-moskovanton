package ru.avalon.java.dev.j10.labs.sort;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
        int d = array.length / 2;
        while (d >= 1) {
            for (int k = 0; k < d; k++) {
                for (int i = k; i < array.length - 1; i = i + d) {
                    for (int j = Math.min(i + d, array.length - 1); j - d >= 0; j = j - d) {
                        if (array[j - d] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j - d];
                            array[j - d] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
            d = d / 2;
        }
        System.out.println("Shell sort array elements: " + Arrays.toString(array)); 
    }
}
