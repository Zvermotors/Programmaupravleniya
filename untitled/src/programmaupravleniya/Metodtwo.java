package programmaupravleniya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Metodtwo {

    public void consoleMethod() throws FileNotFoundException {

        String filePath = "C:\\Users\\Notebook\\OneDrive\\Desktop\\СИАОД  JAVA\\programmaupravleniya\\inicializationArray.txt";
        File file = new File(filePath);
        Scanner scanner1 = new Scanner(file);
        String line = scanner1.nextLine();
        String[]number = line.split(";");
        int[] numbersint = new int[number.length];
        for(int i = 0;i < number.length;i++) {
            numbersint[i] = Integer.parseInt(number[i]);
        }
        System.out.println("массив типа String" + Arrays.toString(number));
        System.out.println("преобразованный массив типа int"+Arrays.toString((numbersint)));

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
            for (int i = 0; i < numbersint.length; i++) {
                if (numbersint[i] == search) {
                    System.out.println("число которое вы запросили: " + numbersint[i]);
                    break;
                }
                else {
                    System.out.println("число которое вы запросили: " + search +" не найдено");
                    break;
                }
            }
        }
        //---------------------------------------------------------------------------
        if (numbers == 2) {

            Arrays.sort(numbersint);
            System.out.println("Отсортированный массив: " + Arrays.toString(numbersint));
            System.out.println("введите число для поиска в массиве: ");
            Scanner scanners = new Scanner(System.in);
            int val = scanners.nextInt();
            // Вызываем бинарный поиск
            BinarysearchManual in1 = new BinarysearchManual();
            String result = in1.binarySearch(numbersint, val);
            System.out.println(result);
        }
        //---------------------------------------------------------------------------
        if (numbers == 3) {
            BinarySearchTree insert = new BinarySearchTree();
            for (int key:numbersint) {
                insert.insert(key);
            }
                System.out.println("\nВведите число для поиска значения в дереве: ");
                Scanner in1 = new Scanner(System.in);
                int q = in1.nextInt();
                System.out.println(insert.search(q));
        }

    }
}
