package view;

import controller.FatController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        FatController fatController = new FatController();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Insira um valor de 0 a 10: ");
            num = scanner.nextInt();
        } while (num > 10 || num < 0);

        System.out.println(fatController.fatorial(num));
    }
}
