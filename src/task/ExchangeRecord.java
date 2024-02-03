package task;

import java.text.DecimalFormat;
import java.util.Date;

// Класс ExchangeRecord содержит поля для хранения информации об обмене
// (дата, сумма, исходная и целевая валюты, результат) и метод toString(),
// который возвращает строковое представление объекта.
// Метод toString() используется для удобного вывода информации о записи
// об обмене при просмотре истории обменов.

public class ExchangeRecord {
    private final Date date; // Дата и время обмена
    private final double amount; // Исходная сумма для обмена
    private final CurrencyEnum sourceCurrency; // Исходная валюта
    private final CurrencyEnum targetCurrency; // Целевая валюта
    private final double resultAmount; // Результат обмена

    // Формат для отображения чисел
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    // Конструктор для создания записи об обмене
    public ExchangeRecord(Date date, double amount, CurrencyEnum sourceCurrency, CurrencyEnum targetCurrency, double resultAmount) {
        this.date = date;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.resultAmount = resultAmount;
    }

    // Переопределение метода toString для удобного вывода информации о записи об обмене

    @Override
    public String toString() {
        return "Дата: " + date + ", Сумма: " + amount + " " + sourceCurrency +
                " -> " + decimalFormat.format(resultAmount) + " " + targetCurrency.getDescription();
    }
}
