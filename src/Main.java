//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Вот решение задания 1:");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша установленная OS не поддерживается");
        }
        System.out.println("Вот решение задания 2:");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша установленная OS не поддерживается");
        }
        System.out.println("Вот решение задания 3:");
        short year = 2021;
        if (year < 1584) {
            System.out.println("Определить високосный год или нет невозможно, так как високосный год был введен после 1584 года");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Вот решение задания 4:");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Вот решение задания 5:");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону зима");
                break;
            case 2:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону зима");
                break;
            case 3:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону весна");
                break;
            case 4:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону весна");
                break;
            case 5:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону весна");
                break;
            case 6:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону лето");
                break;
            case 7:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону лето");
                break;
            case 8:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону лето");
                break;
            case 9:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону осень");
                break;
            case 10:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону осень");
                break;
            case 11:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону осень");
                break;
            case 12:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону зима");
                break;
            default:
                System.out.println("Месяца под номером " + monthNumber + " не существует");
        }

    }
}


