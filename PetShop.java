package Lectures.FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вход
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());

        //пресмятания
        double total = dogs * 2.50 + otherAnimals * 4;

        //Отпечатване
        System.out.println(total);
    }
}
