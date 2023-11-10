package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        System.out.print("Enter the amount of goods: ");
        int amountOfGoods = scanner.nextInt();
        String[] goods = new String[amountOfGoods];

        System.out.println("Goods: ");
        for(int i = 0; i < amountOfGoods; i++){
            goods[i] = scanner.nextLine();
        }

        for(int i = 0; i < goods.length; i++){
            ++counter;
            System.out.printf("%d) %s%n",counter, goods[i]);
        }

        System.out.print("\nWhat product do you search? ");
        String goodSearch = scanner.nextLine();
        for (int i = 0; i < amountOfGoods; i++) {
            if (goodSearch.equals(goods[i])) {
                System.out.printf("Found product: %s%n", goods[i]);
            }
            else{
                System.out.println("This product is not found");
                break;
            }
        }
        scanner.close();
    }
}
