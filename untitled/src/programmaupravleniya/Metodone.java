package programmaupravleniya;

import java.util.*;

public class Metodone {
    void theManualmethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива: ");
        int size1 = scanner.nextInt();
        int[] array = new int[size1];
        System.out.println("введите данные в массив : ");
        for (int i = 0; i < size1; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("введенныe данные в массив: " + Arrays.toString(array));
        System.out.println("Выберите метод поиска данных  в массиве");
        System.out.println("1 - линейный поиск");
        System.out.println("2 - бинарный поиск");
        System.out.println("3 - поиск с использованием бинарного дерева");
        int numbers = scanner.nextInt();
        //---------------------------------------------------------------------
        if (numbers == 1) {
            System.out.println("введите число которое нужно найти: ");
            int search = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == search) {
                    System.out.println("число которое вы запросили: " + array[i]);
                    break;
                }
                else {
                    System.out.println("число которое вы запросили: " + search+" не найдено");
                    break;
                }
            }
        }
        //---------------------------------------------------------------------------
        if (numbers == 2) {
        // Сортируем массив
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        System.out.println("введите число для поиска в массиве: ");
        Scanner scanners = new Scanner(System.in);
        int val = scanners.nextInt();
        // Вызываем бинарный поиск
            BinarysearchManual in1 = new BinarysearchManual();
        String result = in1.binarySearch(array, val);
        System.out.println(result);
        }
        //---------------------------------------------------------------------------
        if (numbers == 3) {
            BinarySearchTree bst = new BinarySearchTree();
          for (int key:array) {
              bst.insert(key);
          }
             System.out.println("\nВведите число для поиска значения в дереве: ");
              Scanner in1 = new Scanner(System.in);
              int q = in1.nextInt();
            System.out.println(bst.search(q));
        }
    }
}


