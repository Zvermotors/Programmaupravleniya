package programmaupravleniya;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodthree {

    void theRandomMethod() {

        System.out.println("массив сгенерированный случайным образом: ");
        int length = 10; // длина массива [1]
        int[] nums = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // заполняем каждый элемент случайным числом от 0 до 99
            nums[i] = random.nextInt(100);
        }
        // выводим массив на экран
        System.out.println(Arrays.toString(nums));

        System.out.println("Выберите метод поиска данных  в массиве");
        System.out.println("1 - линейный поиск");
        System.out.println("2 - бинарный поиск");
        System.out.println("3 - поиск с использованием бинарного дерева");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        //---------------------------------------------------------------------
        if (numbers == 1) {
            System.out.println("введите число которое нужно найти: ");
            int search = scanner.nextInt();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == search) {
                    System.out.println("число которое вы запросили: " + nums[i]);  //выводим число которое необходимо найти
                    break;
                } else {
                    System.out.println("число которое вы запросили: " + search );
                    break;
                }}}
            //---------------------------------------------------------------------------

            if (numbers == 2) {
                Arrays.sort(nums);
                System.out.println("Отсортированный массив: " + Arrays.toString(nums));
                System.out.println("введите число для поиска в массиве: ");
                Scanner scanners = new Scanner(System.in);
                int val = scanners.nextInt();
                // Вызываем бинарный поиск
                BinarysearchManual in1 = new BinarysearchManual();
                String result = in1.binarySearch(nums, val);
                System.out.println(result);
            }
            //---------------------------------------------------------------------------

                if (numbers == 3) {
                    BinarySearchTree bst = new BinarySearchTree();

                    for (int key : nums) {
                        bst.insert(key);
                    }
                    System.out.println("\nВведите число для поиска значения в дереве: ");
                    Scanner in1 = new Scanner(System.in);
                    int q = in1.nextInt();
                    System.out.println(bst.search(q));
                }


        }
    }
