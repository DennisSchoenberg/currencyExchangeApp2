package task;

import java.util.InputMismatchException;
import java.util.Scanner;
// Этот класс содержит функцию main, которая является точкой входа в приложение.
// Она создает объект CurrencyExchangeApp и использует объект Scanner для взаимодействия с пользователем в консоли.
// В цикле происходит отображение меню,
// считывание выбора пользователя и выполнение соответствующих операций.
// В случае ошибок ввода выводится соответствующее сообщение.
public class Main {
    public static void main(String[] args) {
        // Создание объекта CurrencyExchangeApp, который управляет логикой обмена валют
        CurrencyExchangeApp currencyExchangeApp = new CurrencyExchangeApp();

        try {
            // Создание объекта Scanner для ввода данных с консоли
            Scanner scanner = new Scanner(System.in);

            // Основной цикл приложения
            while (true) {
                // Отображение меню приложения
                currencyExchangeApp.displayMenu();
                // Считывание выбора пользователя
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после считывания числа


                // Обработка выбора пользователя
                switch (choice) {
                    case 1 -> currencyExchangeApp.performExchange(scanner); // Выполнение обмена валюты
                    case 2 -> currencyExchangeApp.viewExchangeHistory();// Просмотр истории обменов
                    case 3 -> {
                        System.out.println("Выход из программы. До свидания!");
                        System.exit(0); // Завершение программы при выборе выхода
                    }
                    default -> System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
                }
            }
            // catch (InputMismatchException e) - объявляет, что данный блок кода будет обрабатывать исключения
            // типа InputMismatchException.
            //System.out.println("Ошибка ввода. Введите число."); - в случае возникновения исключения
            // выводится сообщение об ошибке, указывающее, что ожидалось ввод числа, и предлагается ввести данные снова.
            //Это предостережение позволяет обработать ситуацию, когда пользователь вводит нечисловые данные,
            // и предоставляет возможность повторного ввода.
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите число.");
        }
    }
}
