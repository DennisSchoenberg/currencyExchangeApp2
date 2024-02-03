package task;

import java.util.Scanner;

public class CurrencyExchangeApp {
    private final ExchangeManager exchangeManager = new ExchangeManager();

    public void displayMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Обмен валюты");
        System.out.println("2. Просмотр истории обменов");
        System.out.println("3. Выход");
        System.out.print("Выберите опцию: ");
    }

    public void performExchange(Scanner scanner) {
        exchangeManager.displayCurrencyAbbreviations();
        exchangeManager.performExchange(scanner);
    }

    public void viewExchangeHistory() {
        exchangeManager.viewExchangeHistory();
    }
}
