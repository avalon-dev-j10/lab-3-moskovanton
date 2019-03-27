package ru.avalon.java.dev.j10.labs.sort;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
         */
        for (int j = 0; j < array.length - 1; j++){
            int least = j;
            for (int i = j+1; i < array.length; i++){
                if(array[i] < array[least]){
                    least = i;
                }
            }
            int temp = array[j];
            array[j] = array[least];
            array[least] = temp;
        }
        System.out.println("Selection sort array elements: " + Arrays.toString(array));
    }
}

