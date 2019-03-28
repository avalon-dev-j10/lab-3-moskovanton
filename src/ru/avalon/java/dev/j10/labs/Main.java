package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {
    /**Метод, возвращающий сумму элементов массива
     * 
     * @param array массив
     */
    public static void sumMas(int array[]) {
        if (array != null){  
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            } 
            System.out.println("Sum of array elements: " + sum );
        }
        else {
            System.out.println("Incorrect array");
        }
    }    

    public static void main(String[] args) {
        int[] array = new int [20];
        FibonacciInitializer fibonacci = new FibonacciInitializer();
        fibonacci.initialize(array);
        sumMas(array);
        RandomInitializer random = new RandomInitializer(-50, 50);
        random.initialize(array);
        BubbleSort bubble = new BubbleSort();
        bubble.sort(array);
        random.initialize(array);
        SelectionSort selection = new SelectionSort();
        selection.sort(array);
        random.initialize(array);
        ShellSort shell = new ShellSort();
        shell.sort(array);
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
