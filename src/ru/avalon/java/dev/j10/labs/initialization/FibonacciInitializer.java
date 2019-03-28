package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Класс, выполняющий инициализацию массива чисел,
 * значениями последовательности Фибоначчи.
 *
 * <p>Чи́сла Фибона́ччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21 …
 * (последовательность A000045 в OEIS), в которой первые два
 * числа равны либо 1 и 1, либо 0 и 1, а каждое последующее
 * число равно сумме двух предыдущих чисел.
 *
 * <p>Экземпляры класса можно использовать повторно для
 * инициализации любого числа массивов. При инициализации
 * нового массива, последовательность начинается с начала.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class FibonacciInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива значениями
     * последовательности Фибоначчи.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса FibonacciInitializer
         */
        if ((array != null) && (array.length > 2)){                          // проверка корректности длины массива
        /*  TODO (Проверка№1 ЛР№3)
            - Перед каждым обращением к элементу массива надо проверять есть ли такой индекс
            length() > 1, если я в метод передам массив int[1] или array = null возникнет ошибка выполнения
            - Исправить ошибку RunTime!!!!
            - Добавить коментарии к полям и методам класса
        */
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < array.length; i++){     // каждое последующее число равно сумме двух предыдущих чисел
                array[i] = array[i-1] + array[i-2]; 
            } 
            System.out.println("Fibonacci array elements: " + Arrays.toString(array));
        }
        else {
            System.out.println("Incorrect array");
        }
    }
}
