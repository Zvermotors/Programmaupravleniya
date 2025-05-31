package programmaupravleniya;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(System.in);
        Metodone in1 = new Metodone();
        Metodtwo in2 = new Metodtwo();
        Metodthree in3 = new Metodthree();
        System.out.println("Выберите способ ввод данных ");
        System.out.println("1 - ввод данных с консоли ручной способ");
        System.out.println("2 - ввод данных из файла ");
        System.out.println("3 - генерация случайных чисел ");
        int number =  scanner.nextInt();

        if(number == 1) {
            long startTime = System.nanoTime();
            in1.theManualmethod();
            long endTime = System.nanoTime();
            double durationMs = (endTime - startTime) / 1_000_000.0;
            System.out.printf("Время выполнения операции: %.5f мс%n", durationMs);
        }
        if(number == 2) {
            long startTime = System.nanoTime();
            in2.consoleMethod();
            long endTime = System.nanoTime();
            double durationMs = (endTime - startTime) / 1_000_000.0;
            System.out.printf("Время выполнения операции: %.5f мс%n", durationMs);
        }
        if(number == 3) {
            long startTime = System.nanoTime();
            in3.theRandomMethod();
            long endTime = System.nanoTime();
            double durationMs = (endTime - startTime) / 1_000_000.0;
            System.out.printf("Время выполнения операции: %.5f мс%n", durationMs);
        }




    }
}