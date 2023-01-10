package task2;

import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите набор чисел: ");
        for (int i = 0; i < 6; i++) {
            Integer num = scanner.nextInt();
            numbers.add(num);

        }
        System.out.println(numbers);


    }
}
